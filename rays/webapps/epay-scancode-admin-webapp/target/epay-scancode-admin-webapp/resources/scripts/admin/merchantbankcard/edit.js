$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$(".date-picker").datepicker({rtl:Metronic.isRTL(),orientation:"left",autoclose:true});$("#cancle").click(function(){history.go(-1)});$.validator.addMethod("isMobile",function(l,j){var k=l.length;var i=/^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;return this.optional(j)||(k==11&&i.test(l))},"请正确填写您的手机号码");$.validator.addMethod("isLegalCard",function(k,j){var i=/^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;return this.optional(j)||(i.test(k))},"身份证格式错误");$("#configRemitBank").change(function(){var i=$(this).children("option:selected").attr("bankChannelNo");if(i!=""){$("#bankCode").val(i);$("#bankCode").attr("readonly","readonly")}else{$("#bankCode").removeAttr("readonly");$("#bankCode").val("")}});$("#bankCard").on("keyup afterpaste",function(){var i=$(this).val();$(this).val(i.replace(/\D/g,""));if(i.length<2){$("#bankName").val("");$("#bankCode").val("")}if(i.length>=2){$.ajax({type:"POST",url:"getBankInfo",data:{bankCard:i},success:function(k){if(k&&k!=""&&k!=null){var j=JSON.parse(k);$("#bankName").val(j.bankName);if(j.clearBankChannelNo==null){$("#bankCode").removeAttr("readonly")}else{$("#bankCode").val(j.clearBankChannelNo)}$("#accountType").val("0");$("#accountType").attr("disabled","disabled")}else{$("#bankName").val("");$("#bankCode").val("");$("#accountType").val("");$("#bankCode").removeAttr("readonly");$("#bankName").removeAttr("readonly");$("#accountType").removeAttr("disabled")}}})}});$("#form").validate({event:"blur",rules:{merchantNo:{required:true,maxlength:25},merchantName:{required:true,maxlength:25},idCard:{required:true,maxlength:25},name:{required:true,maxlength:25},bankCode:{required:true,maxlength:25},bankName:{required:true,maxlength:25},bankCard:{required:true,maxlength:25},mobile:{required:true,maxlength:25},isRealAccount:{required:true,maxlength:25},accountType:{required:true},operator:{required:true,maxlength:25},temp1:{required:true,maxlength:25},temp2:{required:true,maxlength:25}},messages:{merchantNo:{required:"请输入【商户编号】",maxlength:"长度不能超过25"},merchantName:{required:"请输入【商户名称】",maxlength:"长度不能超过25"},idCard:{required:"请输入【身份证号码】",maxlength:"长度不能超过25"},name:{required:"请输入【姓名】",maxlength:"长度不能超过25"},bankCode:{required:"请输入【银行开户行代码】",maxlength:"长度不能超过25"},bankName:{required:"请输入【银行名称】",maxlength:"长度不能超过25"},bankCard:{required:"请输入【银行卡号】",maxlength:"长度不能超过25"},mobile:{required:"请输入【手机号码】",maxlength:"长度不能超过25"},isRealAccount:{required:"请输入【是否开通提现】",maxlength:"长度不能超过25"},accountType:{required:"请输入【账户类型】"},operator:{required:"请输入【操作人账号】",maxlength:"长度不能超过25"},temp1:{required:"请输入【temp1】",maxlength:"长度不能超过25"},temp2:{required:"请输入【temp2】",maxlength:"长度不能超过25"}},submitHandler:function(n){$("#save").attr("disabled","disabled");var j=0;var m="";if(j==0){var l=$("#baseUrl").text().trim();var i=$("#accountType").attr("disabled");$("#accountType").removeAttr("disabled");var k=$("#form").serialize();$("#accountType").attr("disabled",i);$.ajax({url:l+"/adminManage/merchantbankcard/save",data:k,type:"POST",success:function(o){o=$.parseJSON(o);bootbox.alert(o.values,function(){if(o.executeStatus=="0"){location.href=l+o.url}})}})}else{bootbox.alert(m,function(){})}return false},errorPlacement:function(i,j){i.appendTo(j.parent().parent())}});var g=$("select.form-control");for(var b=0;b<g.size();b++){var d=$(g[b]);var h=d.attr("id");var f=$("."+h).val();var c=d.find("option");for(var a=0;a<c.size();a++){var e=$(c[a]).val();if(e==f){$(c[a]).attr("selected","selected")}else{$(c[a]).removeClass("selected")}}}});