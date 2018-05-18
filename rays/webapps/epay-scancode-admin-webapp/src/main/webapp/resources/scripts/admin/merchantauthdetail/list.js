$(function(){
	
	$("#query").click(function(){
		var $startDate = $("#beginTimeStr");
		var $endDate = $("#endTimeStr");
		var startDate = $startDate.val();
		var endDate = $endDate.val();
		if((startDate != '' ||startDate !=null) && (endDate != '' || endDate != null)){
			var start=new Date(startDate.replace("-", "/").replace("-", "/"));  
		    var end=new Date(endDate.replace("-", "/").replace("-", "/"));  
			if(start > end){
				bootbox.alert("开始时间大于结束时间！");
				return;
			}
		}
		
		toPage(1);
	});
	
	toPage(1);
	
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
});


	


//删除
function del(obj){
	bootbox.setLocale("zh_CN");  //设置按钮为中文
    bootbox.confirm("确定执行该操作吗?", function(result) {
  	  if(result){
  		$.ajax({
 		   type: "POST",
 		   url: "merchantauthdetail/del",
 		   data:{"id":obj},
 		   success: function(msg){
 			  msg = $.parseJSON(msg);
 			 bootbox.alert(msg.values,function(){
				 if(msg.executeStatus == 0){
					 window.location.reload();
				 }
			 });
 		   }
 		});
  	  }
    }); 
}

function toPage(pageNumber){
	var datajson = $('#form').serialize();
	$.ajax({
		   type: "POST",
		   url: "merchantauthdetail/content?pageNo="+pageNumber,
		   data:datajson,
		   success: function(msg){
			     $("#tablec").html(msg);
		   }
		});
}