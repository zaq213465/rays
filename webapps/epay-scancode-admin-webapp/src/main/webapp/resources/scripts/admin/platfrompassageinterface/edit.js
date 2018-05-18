$(function(){
	Metronic.init(); // 初始化框架核心组件
	Layout.init(); // 初始化网格
	QuickSidebar.init(); // 初始化快捷操作栏
	Demo.init(); // 初始化项目		
	
	$('.date-picker').datepicker({
		format: 'yyyy-mm-dd ',
        weekStart: 0,
        autoclose: true,
        todayHighlight: true,
        defaultDate : new Date(),
        keyboardNavigation: true,
        todayBtn: 'linked',
        clearBtn: 'linked',
        language: 'zh-CN'
	});
	
	$("#form").find("#cancle").click(function(){
		var baseUrl = $("#baseUrl").text().trim();
		window.location.href= baseUrl + "/adminManage/platfrompassageinterface";
	});	
		
	$("#passageNo").blur(
			function() {
				var $this = $(this);
				var name = $this.attr("id");
				var baseUrl = $("#baseUrl").text().trim();
				if ($("#" + name + "-error").text() == '') {
					$this.parent().parent().find("label:gt(0)").remove();

					var val = $this.val();
					var placeholder = $this.attr("placeholder");
					var flag = 0;
					var errMsg = '';
					if (val == null || val == '') {
						flag++;
						errMsg = '为空';
					}
//					if(flag==0){
//					$.ajax({
//						type : "POST",
//						url : baseUrl
//								+ "/adminManage/platfrompassageconfig/list",
//						data : name + "=" + val,
//						async : false,
//						success : function(msg) {
//
//							msg = $.parseJSON(msg);
//							if (msg.objList.length > 1) {
//								flag++;
//								errMsg = '已存在';
//							}
//							if (msg.objList.length == 1) {
//								var idVal = $("#id").val();
//								if (idVal == null || idVal == '') {
//									flag++;
//									errMsg = '已存在';
//								} else {
//									var off = msg.objList[0];
//									if (idVal != off.id) {
//										flag++;
//										errMsg = '已存在';
//									}
//								}
//							}
//						}
//					});
//					}
					if (flag != 0) {
						$this.parent().parent().append(
								'<label id="' + name
										+ '-error" class="error" for="' + name
										+ '">' + placeholder + errMsg
										+ '</label>');
					}
				} else {
					$("#" + name + "-success").remove();
				}
			});
	$.validator.addMethod("isNumOne",function(value,element){
		var number=/[^\d]/g;
		return this.optional(element) || (!number.test(value));
	},"只能输入数字");
	
	/*验证表格*/
	$("#form").validate({
		event:"submit",
	   	    rules: {
	   		   passageNo: {
		   	        required: true
		   	      },
		   	   interfaceType: {
		   	        required: true
		   	      },
		   	   interfaceName: {
	   			   required: true
		   	      },
//		   	   interfaceLimit: {
//		   		   required: true,
//		   		   maxlength:2
//		   	      },
//		   	   passagePriority: {
//		   		   required: true,
//		   		   maxlength:4,
//		   		   isNumOne:true
//		   	      },
		   	   userStatus: {
		   	        required: true
		   	      },
		   	   status: {
		   	        required: true
		   	      }	
	   	    },
	   	    messages: {
	   	     passageNo: {
		   	        required: "请输入通道编号"
		   	      },
		   	   interfaceType: {
		   	        required: "请输入接口类型"
		   	      },
		   	   interfaceName: {
	   			   required: "请输入接口名称"
		   	      },
//		   	   interfaceLimit: {
//		   		   required: "请输入接口限制",
//		   		   maxlength:"最大长度不能超过2"
//		   	      },
//		   	   passagePriority: {
//		   		   required: "请输入通道优先级",
//		   		   maxlength:"最大长度不能超过4"
//		   	      },
		   	   userStatus: {
		   	        required: "请选择使用中或者未使用"
		   	      },
		   	   status: {
		   	        required: "请选择正常或者关闭"
		   	      }		   	      
			},
   	    submitHandler:function(form){
   			var flag = 0;
   			var errMsg = '';

   			if(flag == 0){
//   				$("#save").attr("disabled","disabled");
   				var baseUrl = $("#baseUrl").text().trim();
   				var datajson = $('#form').serialize();
   				$.ajax({
   					url:baseUrl+"/adminManage/platfrompassageinterface/save",
   					data:datajson,
   					type:"POST",
   					success:function(msg)
   					{
   						var msg=JSON.parse(msg);
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
		
});
