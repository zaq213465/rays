$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$("#cancle").click(function(){history.go(-1)});$(".ajaxCheck").blur(function(){var o=$(this);var m=o.attr("id");if($("#"+m+"-error").text()==""){o.parent().parent().find("label:gt(0)").remove();var q=o.val();var p=o.attr("placeholder");var i=0;var n="";if(q==null||q==""){i++;n="为空"}var j=/\w{0,32}$/;if(!j.test(q)){i++;n="需是数字、字母、下划线，且长度不可超过32"}j=/[@#\$%\^&\*]+/g;if(j.test(q)){i++;n="不能包含特殊字符"}if(i==0){$.ajax({type:"POST",url:"list",data:m+"="+q,async:false,success:function(t){t=$.parseJSON(t);if(t.objList.length>1){i++;n="已存在"}if(t.objList.length==1){var r=$("#id").val();if(r==null||r==""){i++;n="已存在"}else{var s=t.objList[0];if(r!=s.id){i++;n="已存在"}}}}})}if(i==0){o.parent().parent().append('<label id="'+m+'-success" class="success" for="'+m+'">'+p+"可用！</label>")}else{o.parent().parent().append('<label id="'+m+'-error" class="error" for="'+m+'">'+p+n+"，不可用！</label>")}}else{$("#"+m+"-success").remove()}});$.validator.addMethod("isNumChar",function(m,j){var i=/^[\w_]*$/;return this.optional(j)||(i.test(m))},"请输入字母、数字、下划线!");$.validator.addMethod("isIllegalString",function(m,j){var i=/[@#\$%\^&\*]+/g;return this.optional(j)||(!i.test(m))},"不能使用非法字符");$.validator.addMethod("isMobile",function(n,j){var m=n.length;var i=/(^\d{3,4}-?\d{3,4}-?\d{3,4}$)|(^1[34578]{1}[0-9]{9}$)/;return this.optional(j)||(i.test(n))},"请正确填写您的电话号码");$.validator.addMethod("isnotSpace",function(m,i){var j=m.trim().length;return this.optional(i)||(j!=0)},"不能是空白字符");$.validator.addMethod("isEmail",function(m,i){var j=m.length;var n=/([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})/;return this.optional(i)||(n.test(m))},"请正确填写您的邮箱");$("#form").validate({event:"blur",rules:{userName:{required:true,maxlength:25,isNumChar:true},shortName:{required:true,isIllegalString:true,isnotSpace:true,maxlength:25},email:{email:true,maxlength:50,isEmail:true},phone:{required:false,isIllegalString:true,maxlength:32,isMobile:true},password:{maxlength:25},passwordstr:{maxlength:25,}},messages:{userName:{required:"请输入【账户】",maxlength:"长度不能超过25"},shortName:{required:"请输入【账户简称】",maxlength:"长度不能超过25"},email:{email:"请输入正确的邮箱格式",maxlength:"长度不能超过50"},phone:{required:"请输入【联系电话】",maxlength:"长度不能超过32"},password:{maxlength:"长度不能超过25"},passwordstr:{maxlength:"长度不能超过25"}},submitHandler:function(j){$("#save").attr("disabled","disabled");var p=0;var n="";var i=$("#id").val();var r=$("#password").val();if((i==""||i==null)&&(r==""||r==null)){p++;n="请输入密码！"}if(r!=""&&r!=null){var m=/^[a-zA-Z]\w{5,17}$/;if(!m.test(r)){p++;n="密码以字母开头,长度在6~18之间,只能包含字母、数字和下划线!"}else{var s=$("#passwordstr").val();if(r.trim()!=s.trim()){p++;n="两次输入的密码需要一样!"}}}else{if((i==""||i==null)){p++;n="请输入密码！"}}if($("#id").val()==""){$.ajax({type:"POST",url:"list",data:"userName="+$("#userName").val(),async:false,success:function(t){t=$.parseJSON(t);if(t.objList.length>0){p++;n="账号已存在"}}})}if(p==0){var o=$("#baseUrl").text().trim();var q=$("#form").serialize();$.ajax({url:o+"/adminManage/sys/admin/save",data:q,type:"POST",success:function(t){t=$.parseJSON(t);bootbox.alert(t.values,function(){if(t.executeStatus=="0"){location.href=o+t.url}})}})}else{$("#save").removeAttr("disabled");bootbox.alert(n,function(){})}return false},errorPlacement:function(i,j){i.appendTo(j.parent().parent())}});var l=$("select.form-control");for(var f=0;f<l.size();f++){var h=$(l[f]);var a=h.attr("id");var c=$("."+a).val();var b=h.find("option");var g=0;for(var e=0;e<b.size();e++){var d=$(b[e]).val();var k=$(b[e]).attr("val");if(d==c||k==c){$(b[e]).attr("selected","selected");g++}else{$(b[e]).removeClass("selected")}}if(g==0&&c!=""){h.parent().parent().parent().parent().hide();h.attr("name","xxx")}}});