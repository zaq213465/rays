$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$("#cancle").click(function(){history.go(-1)});$("#form").validate({event:"submit",submitHandler:function(f){var a=0;var e="";var b=$("#idcardImg2").val();if(b==""){a++;e+="请上传调账表!"}if(a==0){var d=$("#baseUrl").text().trim();var c=$("#form").serialize();$.ajax({url:d+"/adminManage/orderrefund/save",data:c,type:"POST",success:function(g){g=$.parseJSON(g);bootbox.alert(g.values,function(){if(g.executeStatus=="0"){location.href=d+g.url}})}})}else{bootbox.alert(e,function(){})}return false},errorPlacement:function(a,b){a.appendTo(b.parent().parent())}})});