$(function(){
	Metronic.init(); // 初始化框架核心组件
	Layout.init(); // 初始化网格
	QuickSidebar.init(); // 初始化快捷操作栏
	Demo.init(); // 初始化项目
	
	$('.date-picker').datepicker({
	    rtl: Metronic.isRTL(),
	    orientation: "left",
	    autoclose: true
	});
	
	$("#cancle").click(function(){
		history.go(-1);
	});
	
	$.validator.addMethod("isMobile", function(value, element) { 
		   var length = value.length; 
		   var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/; 
		   return this.optional(element) || (length == 11 && mobile.test(value)); 
		 }, "请正确填写您的手机号码"); 

	$.validator.addMethod("isLegalCard", function(value, element) { 
	   var tel = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/; 
	   return this.optional(element) || (tel.test(value)); 
	   }, "身份证格式错误");

	/*验证表格*/
	$("#form").validate({
        event:"blur",
   	    rules: {
		    auditId: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    auditType: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    merchantNo: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    merchantName: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    auditStatus: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    reason: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    operatorOrganizations: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    operator: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    temp1: {
	   	        required: true,
	   	        maxlength: 25
	   	      },
		    temp2: {
	   	        required: true,
	   	        maxlength: 25
	   	      }
   	    },
   	    messages: {
		    auditId: {
	   	        required: "请输入【审核记录ID】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    auditType: {
	   	        required: "请输入【审核类型：0 商户入驻审核 (上级，平台)1：银行卡变更审核(平台)】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    merchantNo: {
	   	        required: "请输入【商户编号】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    merchantName: {
	   	        required: "请输入【商户名称】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    auditStatus: {
	   	        required: "请输入【审核状态】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    reason: {
	   	        required: "请输入【审核意见】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    operatorOrganizations: {
	   	        required: "请输入【审核人机构】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    operator: {
	   	        required: "请输入【操作人账号】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    temp1: {
	   	        required: "请输入【temp1】",
	   	        maxlength: "长度不能超过25"
	   	      },
		    temp2: {
	   	        required: "请输入【temp2】",
	   	        maxlength: "长度不能超过25"
	   	      }
		}});
		/*验证表格*/
		$("#form").validate({
			event:"submit",
		   	    rules: {
		   		reason: {
			   	        maxlength: 1000,
			   	        isNumber:true
			   	      },
			   	   auditStatus: {
			   		    required: true
			   	      }
		   	    },
		   	    messages: {
			   	  
		   	    	reason: {
			   	        maxlength: "长度不能超过1000"
			   	      },
			   	   auditStatus: {
			   	        maxlength: "请选择是否通过！"
			   	      }
				},
				
   	    submitHandler:function(form){
   			var flag = 0;
   			var errMsg = '';
//   			var text = $(".form-horizontal select");
//   			for(var i = 0; i < text.size();i++){
//   				var $this = $(text[i]);
//   				var val = $this.val();
//   				if(val == null || val == ''){
//   					flag ++ ;
//   				}
//   			}
   			if(flag == 0){
   				var baseUrl = $("#baseUrl").text().trim();
   				var datajson = $('#form').serialize();
   				$.ajax({
   					url:baseUrl+"/adminManage/platfromAuditlog/save",
   					data:datajson,
   					type:"POST",
   					success:function(msg)
   					{
   						msg = $.parseJSON(msg);
   			 			  bootbox.alert(msg.values,function(){
   			 				 if(msg.executeStatus == '0'){
   			 					location.href=baseUrl+msg.url;
   			 				 }
   			 			  });
   					}
   				});
   			}else{
   				bootbox.alert(errMsg,function(){});
   			}
			return false;
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