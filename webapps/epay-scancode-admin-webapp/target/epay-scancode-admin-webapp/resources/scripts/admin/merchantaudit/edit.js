$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$(".date-picker").datepicker({rtl:Metronic.isRTL(),orientation:"left",autoclose:true});$("#cancle").click(function(){history.go(-1)});$.validator.addMethod("isMobile",function(l,j){var k=l.length;var i=/^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;return this.optional(j)||(k==11&&i.test(l))},"请正确填写您的手机号码");$.validator.addMethod("isLegalCard",function(k,j){var i=/^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;return this.optional(j)||(i.test(k))},"身份证格式错误");$("#form").validate({event:"blur",rules:{auditId:{required:true,maxlength:25},auditType:{required:true,maxlength:25},merchantNo:{required:true,maxlength:25},merchantName:{required:true,maxlength:25},auditStatus:{required:true,maxlength:25},reason:{required:true,maxlength:25},operatorOrganizations:{required:true,maxlength:25},operator:{required:true,maxlength:25},temp1:{required:true,maxlength:25},temp2:{required:true,maxlength:25}},messages:{auditId:{required:"请输入【审核记录ID】",maxlength:"长度不能超过25"},auditType:{required:"请输入【审核类型：0 商户入驻审核 (上级，平台)1：银行卡变更审核(平台)】",maxlength:"长度不能超过25"},merchantNo:{required:"请输入【商户编号】",maxlength:"长度不能超过25"},merchantName:{required:"请输入【商户名称】",maxlength:"长度不能超过25"},auditStatus:{required:"请输入【审核状态】",maxlength:"长度不能超过25"},reason:{required:"请输入【审核意见】",maxlength:"长度不能超过25"},operatorOrganizations:{required:"请输入【审核人机构】",maxlength:"长度不能超过25"},operator:{required:"请输入【操作人账号】",maxlength:"长度不能超过25"},temp1:{required:"请输入【temp1】",maxlength:"长度不能超过25"},temp2:{required:"请输入【temp2】",maxlength:"长度不能超过25"}}});$("#form").validate({event:"submit",rules:{reason:{maxlength:1000,isNumber:true},auditStatus:{required:true}},messages:{reason:{maxlength:"长度不能超过1000"},auditStatus:{maxlength:"请选择是否通过！"}},submitHandler:function(m){var i=0;var l="";if(i==0){var k=$("#baseUrl").text().trim();var j=$("#form").serialize();$.ajax({url:k+"/adminManage/platfromAuditlog/save",data:j,type:"POST",success:function(n){n=$.parseJSON(n);bootbox.alert(n.values,function(){if(n.executeStatus=="0"){location.href=k+n.url}})}})}else{bootbox.alert(l,function(){})}return false},errorPlacement:function(i,j){i.appendTo(j.parent().parent())}});var g=$("select.form-control");for(var b=0;b<g.size();b++){var d=$(g[b]);var h=d.attr("id");var f=$("."+h).val();var c=d.find("option");for(var a=0;a<c.size();a++){var e=$(c[a]).val();if(e==f){$(c[a]).attr("selected","selected")}else{$(c[a]).removeClass("selected")}}}});