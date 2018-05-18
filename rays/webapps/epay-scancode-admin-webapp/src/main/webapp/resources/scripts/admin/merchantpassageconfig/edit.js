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
		window.location.href= baseUrl + "/adminManage/merchantpassageconfig";
	});	
		
//	$('#organNo').selectpicker({
//    	noneSelectedText:"  --  请选择  --  ",
//		noneResultsText:"查无数据！ {0}",
//		style: 'btn-select'
//    }).init(function () {
//		$("#organNo").next().find("input").on('input', function (e) {
//			$("#organNo").empty();
//			$("#organNo").append("<option value=''>  --  请选择  --  </option>"); 
//			var organName = $("#organNo").next().find("input").val().trim();
//			var baseUrl = $("#baseUrl").text().trim();
//			if(organName != ''){
//				$.ajax({
//					url:baseUrl + "/adminManage/merchantpassageconfig/getorganlist",
//					data:{"organName":organName},
//					async: false,
//					type:"POST",
//					success:function(data)
//					{
//						var data = JSON.parse(data);
//						var organlist = data.objList;
//						for(var i in organlist){
//							var option = "<option value='" + organlist[i].organNo + "'>" + organlist[i].organName + "</option>"
//							$("#organNo").append(option); 
//						}
//					}
//				});
//				
//			}
//	        $("#organNo").selectpicker('refresh');
//		});
//		$('.selectpicker').selectpicker('val', $(".organNo").val());
//	});
		
	
	/*验证表格*/
	$("#form").validate({
		event:"submit",
	   	    rules: {
	   		   beginTimeStr: {
		   	        required: true
		   	      },
		   	   endTimeStr: {
		   	        required: true
		   	      },
		   	   province: {
	   			   required: false
		   	      },
		   	   preImgUrl: {
		   		   required: true
		   	      },
		   	   adviertLink: {
		   	        required: false
		   	      }		   	  
	   	    },
	   	    messages: {
	   	    	beginTimeStr: {
	   	    		required: "请选择【生效日期】",
		   	      },
		   	   endTimeStr: {
		   	    	required: "请选择【结束日期】",
		   	      },
		   	   province: {
	   	    		required: "请选择【推广范围】"
		   	      },
		   	   preImgUrl: {
		   	    	required: "请上传【广告图片】"
		   	      },
		   	   adviertLink: {
		   	        required: "请输入【广告链接】"
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
   					url:baseUrl+"/adminManage/merchantpassageconfig/save",
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
