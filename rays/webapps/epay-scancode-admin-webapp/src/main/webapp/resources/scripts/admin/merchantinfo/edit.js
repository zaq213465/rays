$(function(){
	Metronic.init(); // 初始化框架核心组件
	Layout.init(); // 初始化网格
	QuickSidebar.init(); // 初始化快捷操作栏
	Demo.init(); // 初始化项目
	
	$('.date-picker').datepicker({
		format: 'yyyy-mm-dd',
        weekStart: 0,
        autoclose: true,
        todayHighlight: true,
        defaultDate : new Date(),
        keyboardNavigation: true,
        todayBtn: 'linked',
        clearBtn: 'linked',
        language: 'zh-CN'
	});
	
	$("#cancle").click(function(){
		history.go(-1);
	});
	
	$("#bankCard").on("keyup afterpaste",function(){
		var value = $(this).val();
		$(this).val(value.replace(/\D/g,""));
		//输入超过六位开始条用查询
		if(value.length<2){
			$("#bankName").val("");
			$("#bankCode").val("");
		}
		var baseUrl = $("#baseUrl").text().trim();
		if(value.length>=2){
			$.ajax({
  				type: "POST",
  				url: baseUrl+"/adminManage/merchantbankcard/getBankInfo",
  				data: {"bankCard":value},
  				success:function(msg){
  					if(msg && msg!="" && msg!=null){
  						var card = JSON.parse(msg);
  	  					$("#bankName").val(card.bankName);
  	  					if(card.clearBankChannelNo == null){
  	  						$("#bankCode").removeAttr("readonly");
  	  					}else{
  	  						$("#bankCode").val(card.clearBankChannelNo);
  	  						$("#bankCode").attr("readonly","readonly");
  	  					}
  	  					$("#accountType").val("0");
  	  					$("#accountType").attr("disabled","disabled");
  	  					
  					}
  					else{
  						$("#bankName").val("");
  	  					$("#bankCode").val("");
  	  					$("#accountType").val("0");
  	  					$("#bankCode").removeAttr("readonly");
  	  					$("#bankName").removeAttr("readonly");
  	  					$("#accountType").removeAttr("disabled");
  					}
  				}
  			});
		}
	});
	
	$("#channelNo").on("change",function(){
		var apiCode = $(this).val();
		var options = $("#agentNo option");
		$("#agentNo").val("");
		for(var i = 0; i < options.size();i++){
			var $this = $(options[i]);
			$this.css("display","block");
			var opval = $this.attr("val");
			if(opval != apiCode && apiCode != '' && opval != '----'){
				$this.css("display","none");
			}
		}
	});
	
	$("#province").change(function(t){
		var pid = $("#province").val();
		var baseUrl = $("#baseUrl").text().trim();
		$("#city").empty();
		
		if(pid != ''){
			$.ajax({
				url:baseUrl + "/adminManage/merchantinfo/getcityareacode",
				data:{"pid":pid},
				async: false,
				type:"POST",
				success:function(data)
				{
					var data = JSON.parse(data);
					var cityList = data.cityList;
					if(cityList.length != 1){
						$("#city").append("<option value=''>  --  请选择  --  </option>"); 
					}else{
						$("#merchantArea").val(cityList[0].areacode);
					}
					var option="";
					for(var i in cityList){
						option += "<option value='" + cityList[i].areacode + "'>" + cityList[i].cname + "</option>";						
					}
					$("#city").append(option); 
				}
			});
			
		}		
	});
	
	$("#city").change(function(t){
		var areacode = $("#city").val();
		if(areacode != ''){
			$("#merchantArea").val(areacode);	
		}				
	});
	
	
	function checkMobile(mobile){
		var mobile = mobile;
		var id =$("#id").val();
		var bool = false;
		var baseUrl = $("#baseUrl").text().trim();
		$.ajax({
			   url:baseUrl+"/adminManage/merchantinfo/existMobile",
	 		   data:{"mobile":mobile,"id":id}, 
	 		   type: "POST",
	 		   async:false,
	 		   success: function(data){
	 			  if(data=="true"){
	 				 bool = true;
	 			  }
	 			  
	 		   }
	 		});
		return bool;
	}
	
	$("#mobile").blur(function(){
		var $this = $(this);
        var name = $this.attr("id");
        var errMsg = '手机号码已存在';
        if (checkMobile($("#mobile").val()) && $("#mobile").val().trim()!="") {
        	$("#" + name+ "-error").remove();
        	$this.parent().parent().append('<label id="' + name + '-error" class="error" for="' + name + '">' + errMsg + '，不可用！</label>');
        }
	});
	

	
	//法人姓名输入
	$("#name").on('input', function (e) {
		$("#myName").val($("#name").val());
	});
	//法人身份证输入
	$("#idCard").on('input', function (e) {
		$("#myIdCard").val($("#idCard").val());
	});
	//账户类型改变
	$("#accountType").change(function(t){
		var accountType = $("#accountType").val();
		if(accountType == '1'){
			$("#myName").val("");
			$("#myName").attr("readonly",false);
		}else{
			$("#myName").attr("readonly",true);
			$("#myName").val($("#name").val());
		}				
	});
	
	
	$.validator.addMethod("isMobile", function(value, element) { 
		   var length = value.length; 
		   var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/; 
		   return this.optional(element) || (length == 11 && mobile.test(value)); 
		 }, "请正确填写您的手机号码"); 
	$.validator.addMethod("isPhone", function(value, element) { 
		var mobile = /(^\d{3,4}-?\d{3,4}-?\d{3,4}$)|(^1[34578]{1}[0-9]{9}$)/;
		   return this.optional(element) || (mobile.test(value)); 
		 }, "请正确填写您的电话号码"); 
	$.validator.addMethod("isLegalCard", function(value, element) { 
	   var tel = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/; 
	   return this.optional(element) || (tel.test(value)); 
	   }, "身份证格式错误");
	$.validator.addMethod("isNumber", function(value, element) { 
		   var length = value.length; 
		   var number = /^[0-9]*$/; 
		   return this.optional(element) || (number.test(value)); 
		 }, "只能输入数字");
	$.validator.addMethod("isnotSpace", function(value, element) { 
		   var length = value.trim().length; 
		   return this.optional(element) || (length!=0); 
		 }, "不能是空白字符");

	/*验证表格*/
	$("#form").validate({
        event:"blur",
   	    rules: {
		    channelNo: {
	   	        required: true,
	   	        maxlength: 50
	   	      },
		    agentNo: {
	   	        required: true,
	   	        maxlength: 50
	   	      },
		    merchantName: {
	   	        required: true,
	   	        maxlength: 50
	   	      },
		    shortName: {
	   	        required: true,
	   	        maxlength: 50
	   	      },
	   	   registerType: {
	   		   required: true
	   	      },
		    busType: {
		    	required: true
	   	      },
		    name: {
	   	        required: true,
	   	        maxlength: 30
	   	      },
		    idCard: {
	   	        required: true,
	   	        isLegalCard:true,
	   	        maxlength: 30
	   	      },
		    mobile: {
	   	        required: true,
	   	        isMobile:true,
	   	        maxlength: 20
	   	      },
		    phone: {
	   	        required: true,
	   	        isMobile:true,
	   	        maxlength: 11
	   	      },
		    email: {
		    	email:true,
	   	        maxlength: 50
	   	      },
		    address: {
		    	required: true,
	   	        maxlength: 50
	   	      },
		    merchantLicense: {
		    	required: true,
	   	        maxlength: 50
	   	      },
		    taxNo: {
	   	        maxlength: 50
	   	      },
		    orgNo: {
	   	        maxlength: 50
	   	      },
	   	   storeName: {
	   	        required: true,
	   	        maxlength: 50
	   	      },
	   	   servicePhone: {
		   	    required: true,
		   	    isPhone:true,
		   	    maxlength: 20
		   	  },
		   	storeAddress: {
			   	required: false,
			   	maxlength: 250
			  },
			  contactName: {
			   	required: true,
			   	maxlength: 10
			  },
			  merchantNature: {
			   	required: true
			  },
			  openYear: {
			   	required: false,
			   	isNumber:true,
			   	maxlength: 5
			  },
			  contractNo: {
			   	required: false,
			   	maxlength: 16
			  },
			  orgNo: {
			   	required: false,
			   	maxlength: 25
			  },
			  mainBusiness: {
			   	required: false,
			   	maxlength: 250
			  },
			  businessRange: {
			   	required: true,
			   	maxlength: 500
			  },
			  registerAddr: {
			   	required: false,
			   	maxlength: 500
			  },
			  merchantArea: {
			   	required: false,
			   	maxlength: 10
			  },
			  remark: {
			   	required: false,
			   	maxlength: 500
			  },
			  bankCode: {
	   	        required: true,
	   	        isnotSpace: true,
	   	        maxlength: 20
	   	      },
	   	      bankName: {
	   		    required: true,
	   	        isnotSpace: true,
	   	        maxlength: 100
	   	      },
	   	      bankCard: {
	   		    required: true,
	   	        isnotSpace: true,
	   	        maxlength: 25,
	   	        isNumber:true
	   	      },
	   	      myIdCard: {
	   		    required: true,
	   	        isnotSpace: true,
	   	        maxlength: 30,
	   	        isLegalCard:true
	   	      },
	   	      myName: {
	   		    required: true,
	   	        isnotSpace: true,
	   	        maxlength: 25
	   	      },
	   	      myMobile: {
	   	        maxlength: 20,
	   	        isMobile: true
	   	      },
	   	      accountType: {
	   		    required: true
	   	      },
	   	      myMobile: {
	   	        required: true,
	   	        isMobile:true,
	   	        maxlength: 20
	   	      },
	   	   	  city: {
	   	        required: true
	   	      },
   	    },
   	    messages: {
		    channelNo: {
	   	        required: "请输入【渠道编号】",
	   	        maxlength: "长度不能超过50"
	   	      },
		    agentNo: {
	   	        required: "请输入【代理商编号】",
	   	        maxlength: "长度不能超过50"
	   	      },
		    merchantName: {
	   	        required: "请输入【商户名称】",
	   	        maxlength: "长度不能超过50"
	   	      },
		    shortName: {
	   	        required: "请输入【商户简称】",
	   	        maxlength: "长度不能超过50"
	   	      },
	   	   registerType: {
	   	        required: "请输入【商户模式】"
	   	      },
		    busType: {
	   	        required: "请输入【经营类型】",
	   	        maxlength: "长度不能超过50"
	   	      },
		    name: {
	   	        required: "请输入【法人姓名】",
	   	        maxlength: "长度不能超过30"
	   	      },
		    idCard: {
	   	        required: "请输入【法人身份证】",
	   	        maxlength: "长度不能超过30"
	   	      },
		    mobile: {
	   	        required: "请输入【手机号码】",
	   	        maxlength: "长度不能超过20"
	   	      },
		    phone: {
	   	        required: "请输入【联系电话】",
	   	        maxlength: "长度不能超过20"
	   	      },
		    email: {
		    	email:"请输入正确的邮箱格式",
	   	        maxlength: "长度不能超过100"
	   	      },
		    address: {
	   	        maxlength: "长度不能超过50",
	   	        required: "请输入【地址】"
	   	      },
		    merchantLicense: {
	   	        maxlength: "长度不能超过50",
	   	        required: "请输入【商户营业执照号】"
	   	      },
		    taxNo: {
	   	        maxlength: "长度不能超过50"
	   	      },
		    orgNo: {
	   	        maxlength: "长度不能超过50"
	   	      },
	   	   storeName: {
	   	        required: "请输入【门店名称】",
	   	        maxlength: "长度不能超过50"
	   	      },
	   	   servicePhone: {
		   	    required: "请输入【服务电话】",
		   	    maxlength: "长度不能超过20"
		   	  },
		   	storeAddress: {
			   	required: "请输入【门店地址】",
			   	maxlength: "长度不能超过250"
			  },
			  contactName: {
			   	required: "请输入【联系人姓名】",
			   	maxlength: "长度不能超过10"
			  },
			  merchantNature: {
			   	required: "请选择【商户性质】"
			  },
			  openYear: {
			   	required: "请输入【经营年限】",
			   	maxlength: "长度不能超过5"
			  },
			  contractNo: {
			   	required: "请输入【合同编号】",
			   	maxlength: "长度不能超过16"
			  },
			  orgNo: {
			   	required: "请输入【组织机构代码】",
			   	maxlength: "长度不能超过25"
			  },
			  mainBusiness: {
			   	required: "请输入【主营业务】",
			   	maxlength: "长度不能超过250"
			  },
			  businessRange: {
			   	required: "请输入【经营范围】",
			   	maxlength: "长度不能超过500"
			  },
			  registerAddr: {
			   	required: "请输入【注册地址】",
			   	maxlength: "长度不能超过500"
			  },
			  merchantArea: {
			   	required: "请输入【地区】",
			   	maxlength: "长度不能超过10"
			  },
			  remark: {
			   	maxlength: "长度不能超过500"
			  },
			  bankCode: {
	   		    required: "请输入【银行开户行代码】",
	   	        maxlength: "长度不能超过20"
	   	      },
	   	      bankName: {
	   		    required: "请输入【开户行银行名称】",
	   	        maxlength: "长度不能超过100"
	   	      },
	   	      bankCard: {
	   	        required: "请输入【银行卡号码】",
	   	        maxlength: "长度不能超过25"
	   	      },
	   	      myIdCard: {
	   	        required: "请输入【身份证号码】",
	   	        maxlength: "长度不能超过30"
	   	      },
	   	      myName: {
	   	        required: "请输入【姓名】",
	   	        maxlength: "长度不能超过25"
	   	      },
	   	      myMobile: {
	   	        maxlength: "长度不能超过20"
	   	      },
	   	      accountType: {
	   		   required: "请选择【账户类型】"
	   	      },
	   	      myMobile: {
	   	        required: "请输入【手机号码】",
	   	        maxlength: "长度不能超过20"
	   	      },
	   	      city: {
	   	        required: "请输入【地区】"
	   	      },
		},
   	    submitHandler:function(form){
   	    	var id = $("#id").val();
   	    	if(id !=null && id != ""){
   	    	//如果是修改页面判断提示
   	    	//是否确认提交，是为true,否为false
   	   	     bootbox.setLocale("zh_CN");  //设置按钮为中文
   	   	     bootbox.confirm("提交修改将会导致您的商户重新进行审核，请确认是否要继续提交？", function(result) {
   	   	   	  if(result){
   	   	   		$(".bootbox-confirm.in").remove();
   	   	   		$(".modal-backdrop.fade.in").remove();
   	   	    	$("#save").attr("disabled","disabled");
   	   			var flag = 0;
   	   			var errMsg = '';
   	   			if(checkMobile($("#mobile").val())){
   	   				flag ++ ;
   					errMsg += "该手机号码在商户中已使用!";
   	   			}
   	   			var text = $(".form-horizontal input[val='hidden']");
   	   			for(var i = 0; i < text.size();i++){
   	   				var $this = $(text[i]);
   	   				var val = $this.val();
   	   				if(val == null || val == ''){
   	   					flag ++ ;
   	   					errMsg += $this.attr("title") + "不可为空!";
   	   				}
   	   			}
   	   			var busType = $("#busType").val();
   	   			if(busType == ''){
   					flag++;
   					errMsg = "经营类型必须选择！<br/>";
   				}
   	   			if(flag == 0){
   	   				var baseUrl = $("#baseUrl").text().trim();
   	   				var isDisabled = $("#accountType").attr("disabled");
   	   				$("#accountType").removeAttr("disabled");
   	   				var datajson = $('#form').serialize();
   	   				$("#accountType").attr("disabled",isDisabled);
   	   				$.ajax({
   	   					url:baseUrl+"/adminManage/merchantinfo/save",
   	   					data:datajson,
   	   					type:"POST",
   	   					success:function(msg)
   	   					{
   	   						msg = $.parseJSON(msg);
   	   						if(msg.executeStatus == '0'){
   	   							bootbox.alert(msg.values,function(){
   	   								window.location.href = msg.url;
				 			    });
   			 				}else if(msg.result == '0'){
   			 					var paywayList = msg.paywayStatus;
   			 					var message = '';
   			 					for(var i = 0; i <paywayList.length; i++){
   			 						if(paywayList[i].status == '2'){
   			 						paywayList[i].status = '失败';
   			 						}else{
   			 						paywayList[i].status = '成功';
   			 						}
   			 						if(paywayList[i].paycode == 'zfb'){
   			 						paywayList[i].paycode ="支付宝";
   			 						}else if(paywayList[i].paycode == 'wechat'){
   			 						paywayList[i].paycode ="微信";
   			 						}
   			 						if(i == paywayList.length -1){
   			 							message = message + paywayList[i].paycode + ' : ' + paywayList[i].status;
   			 						}else{
   			 							message = message + paywayList[i].paycode + ' : ' + paywayList[i].status + '&nbsp;&nbsp;'; 
   			 						}
   			 					}
	   			 				bootbox.alert(message,function(){
		   								window.location.href = '/adminManage/merchantinfo';
				 			    });
   			 				}else if(msg.executeStatus == '1'){
   			 					$("#save").removeAttr("disabled");
   			 	   				bootbox.alert(msg.values,function(){});
   			 				}
   	   						
   	   					},
   	   					error: function(XMLHttpRequest, textStatus, errorThrown) {
   	   						$("#save").removeAttr("disabled");
   	   				    }
   	   				});
   	   			}else{
   	   				$("#save").removeAttr("disabled");
   	   				bootbox.alert(errMsg,function(){});
   	   			}
   				return false;
   				
   	   	   	  	}
   	   	     	});
   	    	}else{
   	    		//如果是新增则不提示
   	   	    	$("#save").attr("disabled","disabled");
   	   			var flag = 0;
   	   			var errMsg = '';
   	   			if(checkMobile($("#mobile").val())){
   	   				flag ++ ;
   					errMsg += "该手机号码在商户中已使用!";
   	   			}
   	   			var text = $(".form-horizontal input[val='hidden']");
   	   			for(var i = 0; i < text.size();i++){
   	   				var $this = $(text[i]);
   	   				var val = $this.val();
   	   				if(val == null || val == ''){
   	   					flag ++ ;
   	   					errMsg += $this.attr("title") + "不可为空!";
   	   				}
   	   			}
   	   			var busType = $("#busType").val();
   	   			if(busType == ''){
   					flag++;
   					errMsg = "经营类型必须选择！<br/>";
   				}
   	   			if(flag == 0){
   	   				var baseUrl = $("#baseUrl").text().trim();
   	   				var isDisabled = $("#accountType").attr("disabled");
   	   				$("#accountType").removeAttr("disabled");
   	   				var datajson = $('#form').serialize();
   	   				$("#accountType").attr("disabled",isDisabled);
   	   				$.ajax({
   	   					url:baseUrl+"/adminManage/merchantinfo/save",
   	   					data:datajson,
   	   					type:"POST",
   	   					success:function(msg)
   	   					{
   	   						msg = $.parseJSON(msg);
   	   						if(msg.executeStatus == '0'){
//   	   							sweetRedirect(msg,msg.url);
   	   						bootbox.alert(msg.values,function(){
	   								window.location.href = msg.url;
			 			    });
   			 				}else{
   			 					$("#save").removeAttr("disabled");
   			 	   				bootbox.alert(msg.values,function(){});
   			 				}
   	   						
   	   					},
   	   					error: function(XMLHttpRequest, textStatus, errorThrown) {
   	   						$("#save").removeAttr("disabled");
   	   				    }
   	   				});
   	   			}else{
   	   				$("#save").removeAttr("disabled");
   	   				bootbox.alert(errMsg,function(){});
   	   			}
   				return false;
   	    	}
   	    	},
		errorPlacement: function(error, element) { 
		     error.appendTo(element.parent().parent()); 
		}
   	 
	}); 
	
	var text = $("select.form-control");
	for(var i = 0; i < text.size();i++){
		var $this = $(text[i]);
		var id = $this.attr("id");
		var val = $("."+id).val();
		var ops = $this.find("option");
		for(var j = 0; j < ops.size();j++){
			var opval = $(ops[j]).val();
			if(opval == val){
				$(ops[j]).attr("selected","selected");
			}else{
				$(ops[j]).removeClass("selected");
			}
		}
	}
	
	function setCategory(obj,level){
		var baseUrl = $("#baseUrl").text().trim();
		var categoryNo = $(obj).find("option:selected").attr("categoryNo");	
		if (typeof(categoryNo) == "undefined"){
			$("#busType").val("");
			$("#busTypeStr").text("");
			return;
		}
		var name = $(obj).find("option:selected").text();	
		var busTypeStr = name+"(" + categoryNo + ")";
		if(categoryNo == "null" || categoryNo == ''){
			var id = $(obj).val();
			$.ajax({
				url:baseUrl+"/adminManage/passageCategoryCmbc/list",
				data:{"parentId":id,"level":level},
				type:"POST",
				success:function(data)
				{
					var json = JSON.parse(data); 
					var objList = json.objList;
					var item = "<option  value='' selected = 'selected'>----请选择----</option>"
					for(var i in objList){ 
						var option = "<option value='" + objList[i].id + "' categoryNo = '" + objList[i].categoryNo + "'>" + objList[i].name + "</option>"
						if(level == 2){
							if(i==0){
								$("#categoryTwo").css("display","block");
								$("#categoryTwo").empty();
								$("#categoryTwo").append(item); 
							}
							$("#categoryTwo").append(option); 
						}else if(level == 3){
							if(i==0){
								$("#categoryThree").css("display","block");
								$("#categoryThree").empty();
								$("#categoryThree").append(item); 
							}
							$("#categoryThree").append(option); 
						}
						
					}
					if(objList.length == 0){
						$('#categoryError').css("display","block");
						if(level == 2){
							$("#categoryTwo").empty();
						}else if(level == 3){
							$("#categoryThree").empty();
						}
					}else{
						$('#categoryError').css("display","none");
					}
				}
			});
		}else{
			$("#busType").val(categoryNo);
			$("#busTypeStr").text(busTypeStr);
			if(level == 2){
				$("#categoryTwo").css("display","none");
				$("#categoryThree").css("display","none");
			}else if(level == 3){
				$("#categoryThree").css("display","none");
			}
		}
	}
	$("#categoryOne").change(function(){
		setCategory(this,2);
	});
	$("#categoryTwo").change(function(){
		setCategory(this,3);
	});
	$("#categoryThree").change(function(){
		var categoryNo = $(this).find("option:selected").attr("categoryNo");	
		var name = $(this).find("option:selected").text();	
		var busTypeStr = name+"(" + categoryNo + ")";
		if (typeof(categoryNo) == "undefined"){
			$("#busType").val("");
			$("#busTypeStr").text("");
		}else if(categoryNo == null || categoryNo == ''){
			$('#categoryError').css("display","block");
		}else{
			$("#busType").val(categoryNo);
			$("#busTypeStr").text(busTypeStr);
		}
	});
		
});


//1		required:true	                  必须输入的字段。
//2		remote:"check.php"	          使用 ajax 方法调用 check.php 验证输入值。
//3		email:true	                          必须输入正确格式的电子邮件。
//4		url:true	                          必须输入正确格式的网址。
//5		date:true	                          必须输入正确格式的日期。日期校验 ie6 出错，慎用。
//6		dateISO:true	                  必须输入正确格式的日期（ISO），例如：2009-06-23，1998/01/22。只验证格式，不验证有效性。
//7		number:true	                          必须输入合法的数字（负数，小数）。
//8		digits:true				  必须输入整数。
//9		creditcard				  必须输入合法的信用卡号。
//10	equalTo:"#field"	          输入值必须和 #field 相同。
//11	accept:					  输入拥有合法后缀名的字符串（上传文件的后缀）。
//12	maxlength:5				  输入长度最多是 5 的字符串（汉字算一个字符）。
//13	minlength:10			  输入长度最小是 10 的字符串（汉字算一个字符）。
//14	rangelength:[5,10]		  输入长度必须介于 5 和 10 之间的字符串（汉字算一个字符）。
//15	range:[5,10]		  	  输入值必须介于 5 和 10 之间。
//16	max:5		   			  输入值不能大于 5。
//17	min:10					  输入值不能小于 10