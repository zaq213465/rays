$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$("#cancle").click(function(){history.go(-1)});$("#channelCode").change(function(){var a=$(this).val();var b=$("#baseUrl").text().trim();if(a!=""){$.ajax({url:b+"/adminManage/channel/role/roleList/findRoleByChannelCode",data:{channelCode:a,roleLevel:1},type:"POST",success:function(g){var d=JSON.parse(g);var f=d.roles;if(d.executeStatus=="0"){$("#roleId").empty();$("#roleId").val("");for(var c in d.roles){var e="<option value='"+f[c].id+"'>"+f[c].roleName+"</option>";$("#roleId").append(e)}if(d.roles.length==0){$("#roleError").css("display","block")}else{$("#roleError").css("display","none")}}}})}});$(".ajaxCheck").blur(function(){var e=$(this);var c=e.attr("id");if($("#"+c+"-error").text()==""){e.parent().parent().find("label:gt(0)").remove();var g=e.val();var f=e.attr("placeholder");var a=0;var d="";if(g==null||g==""){a++;d="为空"}var b=/\w{0,32}$/;if(!b.test(g)){a++;d="需是数字、字母、下划线，且长度不可超过32"}b=/[@#\$%\^&\*]+/g;if(b.test(g)){a++;d="不能包含特殊字符"}if(a==0){$.ajax({type:"POST",url:"list",data:c+"="+g,async:false,success:function(j){e.parent().parent().find("label:gt(0)").remove();j=$.parseJSON(j);if(j.objList.length>1){a++;d="已存在"}if(j.objList.length==1){var h=$("#id").val();if(h==null||h==""){a++;d="已存在"}else{var i=j.objList[0];if(h!=i.id){a++;d="已存在"}}}}})}if(a==0){e.parent().parent().append('<label id="'+c+'-success" class="success" for="'+c+'">'+f+"可用！</label>")}else{e.parent().parent().append('<label id="'+c+'-error" class="error" for="'+c+'">'+f+d+"，不可用！</label>")}}else{$("#"+c+"-success").remove()}});$.validator.addMethod("isNumChar",function(c,b){var a=/^[\w_]*$/;return this.optional(b)||(a.test(c))},"请输入字母、数字、下划线!");$.validator.addMethod("isIllegalString",function(c,b){var a=/[@#\$%\^&\*]+/g;return this.optional(b)||(!a.test(c))},"不能使用非法字符");$.validator.addMethod("isMobile",function(d,b){var c=d.length;var a=/(^\d{3,4}-?\d{3,4}-?\d{3,4}$)|(^1[34578]{1}[0-9]{9}$)/;return this.optional(b)||(a.test(d))},"请正确填写您的电话号码");$.validator.addMethod("isnotSpace",function(c,a){var b=c.trim().length;return this.optional(a)||(b!=0)},"不能是空白字符");$("#form").validate({event:"blur",rules:{userName:{required:true,maxlength:25,isNumChar:true},shortName:{required:true,isnotSpace:true,isIllegalString:true,maxlength:25},email:{email:true,maxlength:50},phone:{required:false,isIllegalString:true,maxlength:32,isMobile:true},password:{maxlength:25},passwordstr:{maxlength:25,}},messages:{userName:{required:"请输入【账户】",maxlength:"长度不能超过25"},shortName:{required:"请输入【账户简称】",maxlength:"长度不能超过25"},email:{email:"请输入正确的邮箱格式",maxlength:"长度不能超过50"},phone:{required:"请输入【联系电话】",maxlength:"长度不能超过32"},password:{maxlength:"长度不能超过25"},passwordstr:{maxlength:"长度不能超过25"}},submitHandler:function(b){var g=0;var f="";var a=$("#id").val();var j=$("#password").val();if((a==""||a==null)&&(j==""||j==null)){g++;f="请输入密码！"}if(j!=""&&j!=null){var d=/^[a-zA-Z]\w{5,17}$/;if(!d.test(j)){g++;f="密码以字母开头,长度在6~18之间,只能包含字母、数字和下划线!"}else{var k=$("#passwordstr").val();if(j.trim()!=k.trim()){g++;f="两次输入的密码需要一样!"}}}var i=$("#channelCode").val();if(i==""){g++;f="请选择渠道编号！"}var c=$("#roleId").val();if(c==""||c==null){g++;f="请选择账户角色！"}if($("#id").val()==""){$.ajax({type:"POST",url:"list",data:"userName="+$("#userName").val(),async:false,success:function(l){l=$.parseJSON(l);if(l.objList.length>0){g++;f="账号已存在"}}})}if(g==0){$("#save").attr("disable","disable");var e=$("#baseUrl").text().trim();var h=$("#form").serialize();$.ajax({url:e+"/adminManage/channel/sys/admin/save",data:h,type:"POST",success:function(l){l=$.parseJSON(l);bootbox.alert(l.values,function(){if(l.executeStatus=="0"){location.href=e+l.url}})}})}else{$("#save").removeAttr("disabled");bootbox.alert(f,function(){})}return false},errorPlacement:function(a,b){a.appendTo(b.parent().parent())}})});