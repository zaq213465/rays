$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$(".date-picker").datepicker({rtl:Metronic.isRTL(),orientation:"left",autoclose:true});$("#query").click(function(){var a=$("#form").serialize();$.ajax({type:"POST",url:"clearingt0err/content",data:a,success:function(b){$("#tablec").html(b)}})});$("#cancle").click(function(){$(".form-horizontal input").val("");$(".form-horizontal select").val("")});toPage(1)});function update(b,a){bootbox.setLocale("zh_CN");bootbox.confirm("确定执行调账吗?",function(c){if(c){$.ajax({type:"POST",url:"clearingt0err/update",data:{id:b,checkFlag:a},success:function(d){d=$.parseJSON(d);bootbox.alert(d.message,function(){if(d.status==1){window.location.reload()}})}})}})}function toPage(a){var b=$("#form").serialize();$.ajax({type:"POST",url:"clearingt0err/content?pageNo="+a,data:b,success:function(c){$("#tablec").html(c)}})};