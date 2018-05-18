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
	
	var nowDate = new Date();
	var startDate = nowDate.getFullYear()+"-"+(nowDate.getMonth() + 1)+"-"+nowDate.getDate();
	var endDate = nowDate.getFullYear()+"-"+(nowDate.getMonth() + 1)+"-"+nowDate.getDate();
//	$("#beginTimeStr").val(startDate);
//	$("#endTimeStr").val(endDate);
	
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

function toPage(pageNumber){
	var datajson = $('#form').serialize();
	$.ajax({
		   type: "POST",
		   url: "withdrawals/content?pageNo="+pageNumber,
		   data:datajson,
		   success: function(msg){
			     $("#tablec").html(msg);
		   }
		});
}