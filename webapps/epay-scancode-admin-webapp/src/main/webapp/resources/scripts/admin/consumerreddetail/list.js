$(function(){
	
	$("#query").click(function(){
		toPage(1);
	});
	
	toPage(1);
});
function toPage(pageNumber){
	var datajson = $('#form').serialize();
	var doEle = "tablec";
	refreshData(doEle);
	var merchantNoCheck = $("#merchantNoCheck").text();
	console.info(merchantNoCheck);
	$.ajax({
		   type: "POST",
		   url: "consumerreddetail/content?pageNo="+pageNumber + "&merchantNoCheck=" + merchantNoCheck,
		   data:datajson,
		   success: function(msg){
			     $("#" + doEle).html(msg);
		   },
		   error: function(XMLHttpRequest, textStatus, errorThrown) {
			   hasError(XMLHttpRequest, textStatus, errorThrown,doEle);
		   }
		});
}
//更新状态
function updateStatus(btn){
	var $this = $(btn);
	var obj = $this.attr("value");
	var status = $this.attr("status");
	bootbox.setLocale("zh_CN");  //设置按钮为中文
    bootbox.confirm("确定执行该操作吗?", function(result) {
  	  if(result){
  		$.ajax({
 		   type: "POST",
 		   url: "consumerreddetail/updateStatus",
 		   data:{"id":obj,"status":status},
 		   success: function(msg){
 			  msg = $.parseJSON(msg);
 			  bootbox.alert(msg.values,function(){
 				 if(msg.executeStatus == 0){
	 				 status = status == 3 ? 5 : 3 ;
	 				 //修改状态
	 				 $this.parent().prev().prev().html($this.text().trim() == "启用" ? '平台审核通过' : $this.text().trim());
	 				 //修改按钮文本
	 				 var text = $this.text().trim() == "启用" ? '<span class="label label-danger">禁用</span>' : '<span class="label label-success">启用</span>';
	 				 //修改按钮状态属性
	 				 $this.attr("status",status);
	 				 $this.html(text);
 				 }
 			  });
 		   }
 		});
  	  }
    }); 
}
	



//删除
function del(obj){
	bootbox.setLocale("zh_CN");  //设置按钮为中文
    bootbox.confirm("确定执行该操作吗?", function(result) {
  	  if(result){
  		$.ajax({
 		   type: "POST",
 		   url: "consumerreddetail/del",
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