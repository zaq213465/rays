$(function(){$("#query").click(function(){var d=$("#transDateBegin");var c=$("#transDateEnd");var a=d.val();var e=c.val();if((a!=""||a!=null)&&(e!=""||e!=null)){var f=new Date(a.replace("-","/").replace("-","/"));var b=new Date(e.replace("-","/").replace("-","/"));if(f>b){bootbox.alert("开始时间大于结束时间！");return}}toPage(1)});toPage(1);$(".date-picker").datepicker({format:"yyyy-mm-dd",weekStart:0,autoclose:true,todayHighlight:true,defaultDate:new Date(),keyboardNavigation:true,todayBtn:"linked",clearBtn:"linked",language:"zh-CN"});$(".export").click(function(){var a=$("#form").serialize();var b=$("#baseUrl").text().trim();$.ajax({url:b+"/adminManage/organprofit/export/check?"+a,type:"GET",success:function(c){c=$.parseJSON(c);if(c.errorCode=="1"){bootbox.alert(c.errorMsg,function(){})}else{window.open(b+"/adminManage/organprofit/export/excel?"+a)}}})})});function toPage(b){var h=$.trim($("#transDate").val());var a=$.trim($("#organNo").val());var e=$.trim($("#type").val());var d=$.trim($("#payCode").val());var f=$.trim($("#orgName").val());var g=$.trim($("#identityFlag").val());var c=$("#form").serialize();$.ajax({type:"POST",url:"organprofit/content?pageNo="+b,data:c,success:function(i){$("#tablec").html(i)}})};