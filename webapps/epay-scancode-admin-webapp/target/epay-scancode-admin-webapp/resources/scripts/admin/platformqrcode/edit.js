$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$("#channelName").change(function(b){var c=$("#channelName").find("option:selected").attr("channelNo");$("#payWayForm").find("#channelNo").val(c)});$("#payName").change(function(c){var b=$("#payName").find("option:selected").attr("payCode");$("#payWayForm").find("#payCode").val(b)});$("#payWayForm").find("#cancle").click(function(){history.go(-1)});$.validator.addMethod("isNumTwo",function(d,c){var b=/^[0-9]+(\.[0-9]{0,5})?$/;return this.optional(c)||(b.test(d))},"请输入整数、小数，且最多五位小数!");function a(){var d=$("#channelNo").val();var c=$("#payCode").val();var e=$("#id").val();var b=false;$.ajax({url:"check",data:{channelNo:d,payCode:c,id:e},type:"POST",async:false,success:function(f){f=$.parseJSON(f);b=f.check}});return b}$.validator.addMethod("isNumber",function(e,b){var d=e.length;var c=/^[0-9]*$/;return this.optional(b)||(c.test(e))},"只能输入数字");$("#payWayForm").validate({event:"submit",rules:{channelName:{required:true},payName:{required:true},t0Rate:{required:true,maxlength:10,isNumTwo:true},t1Rate:{required:true,maxlength:10,isNumTwo:true}},messages:{channelName:{required:"请选择【渠道编号】",},payName:{required:"请选择【支付通道】",},t0Rate:{required:"请输入【提现手续费率】",maxlength:"长度不能超过10"},t1Rate:{required:"请输入【交易手续费率】",maxlength:"长度不能超过10"}},submitHandler:function(b){var g=0;var e="";var k=$(".form-horizontal input[val='hidden']");for(var d=0;d<k.size();d++){var j=$(k[d]);var c=j.val();if(c==null||c==""){g++;e+=j.attr("name")+"不可为空!"}}if(a()!=true){g++;e+="渠道下已存在该支付方式"}if(g==0){var f=$("#baseUrl").text().trim();var h=$("#payWayForm").serialize();$.ajax({url:f+"/adminManage/channelpayway/save",data:h,type:"POST",success:function(i){i=$.parseJSON(i);bootbox.alert(i.values,function(){if(i.executeStatus=="0"){location.href=f+i.url}})}})}else{bootbox.alert(e,function(){})}return false},errorPlacement:function(b,c){b.appendTo(c.parent().parent())}})});