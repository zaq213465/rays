$(function(){$("#query").click(function(){toPage(1)});toPage(1)});function del(a){bootbox.setLocale("zh_CN");bootbox.confirm("确定执行该操作吗?",function(b){if(b){$.ajax({type:"POST",url:"config/del",data:{id:a},success:function(c){c=$.parseJSON(c);bootbox.alert(c.values,function(){if(c.executeStatus==0){window.location.reload()}})}})}})}function toPage(a){var b=$("#form").serialize();$.ajax({type:"POST",url:"config/content?pageNo="+a,data:b,success:function(c){$("#tablec").html(c)}})};