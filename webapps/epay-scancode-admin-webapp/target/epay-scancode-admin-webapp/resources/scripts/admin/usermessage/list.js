$(function(){$("#query").click(function(){toPage(1)});$("#tablec").delegate("#allItem","click",function(){if($("#allItem").is(":checked")){$("input[name='item']").prop("checked","checked")}else{$("input[name='item']").removeAttr("checked")}});$("#tablec").delegate(".subItem","click",function(){var d=$("input:checkbox[name=item]:checked").size();var c=$("input:checkbox[name=item]").size();if(d==c){$("input[name='allItem']").prop("checked","checked")}else{$("input[name='allItem']").removeAttr("checked")}});$("#tablec").delegate("#delete","click",function(){del()});toPage(1)});function del(){var b=new Array();$.each($("input:checkbox[class=subItem]:checked"),function(c,d){var e=$(d).val();b[c]=e});if(b.length==0){bootbox.alert("请选择要删除的数据！");return}var a=JSON.stringify(b);bootbox.setLocale("zh_CN");bootbox.confirm("确定执行该操作吗?",function(c){if(c){$.ajax({type:"POST",url:"usermessage/del",data:{list:a},dataType:"json",success:function(d){bootbox.alert(d.values,function(){if(d.executeStatus==0){window.location.reload()}})}})}})}function toPage(a){var b=$("#form").serialize();$.ajax({type:"POST",url:"usermessage/content?pageNo="+a,data:b,success:function(c){$("#tablec").html(c)}})};