$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$(".date-picker").datetimepicker({format:"yyyy-mm-dd hh:ii",weekStart:0,autoclose:true,todayHighlight:true,defaultDate:new Date(),startDate:new Date(),keyboardNavigation:true,todayBtn:"linked",clearBtn:"linked",language:"zh-CN"});$("#form").find("#cancle").click(function(){var i=$("#baseUrl").text().trim();window.location.href=i+"/adminManage/platfromAdviertisement"});$("#organNo").selectpicker({noneSelectedText:"  --  请选择  --  ",noneResultsText:"查无数据！ {0}",style:"btn-select"}).init(function(){$("#organNo").next().find("input").on("input",function(l){$("#organNo").empty();$("#organNo").append("<option value=''>  --  请选择  --  </option>");var i=$("#organNo").next().find("input").val().trim();var j=$("#baseUrl").text().trim();if(i!=""){$.ajax({url:j+"/adminManage/platfromAdviertisement/getorganlist",data:{organName:i},async:false,type:"POST",success:function(o){var o=JSON.parse(o);var p=o.objList;for(var m in p){var n="<option value='"+p[m].organNo+"'>"+p[m].organName+"</option>";$("#organNo").append(n)}}})}$("#organNo").selectpicker("refresh")});$(".selectpicker").selectpicker("val",$(".organNo").val())});$("#province").change(function(j){var i=$("#province").val();$("#adviertScope").val(i);var l=$("#baseUrl").text().trim();$("#city").empty();if(i!=""){$.ajax({url:l+"/adminManage/platfromAdviertisement/getcitylist",data:{pid:i},async:false,type:"POST",success:function(p){var p=JSON.parse(p);var o=p.cityList;if(o.length!=1){$("#city").append("<option value=''>  --  请选择  --  </option>")}else{$("#adviertScope").val(o[0].cid)}var n="";for(var m in o){n+="<option value='"+o[m].cid+"'>"+o[m].cname+"</option>"}$("#city").append(n)}})}});$("#city").change(function(i){var j=$("#city").val();if(j!=""){$("#adviertScope").val(j)}else{$("#adviertScope").val($("#province").val())}});function g(){var i=0;var j="";if($("#imgUrl").val()==""){i++;j="请上传广告图片<br>"}if(!!$("#imgUrlFile")[0].files[0]){if($("#imgUrlFile")[0].files[0].size>500*1024){i++;j+="广告图片不大于500kb<br>"}}if(i==0){return true}else{bootbox.alert(j,function(){});return false}}var k=$("select.form-control");for(var f=0;f<k.size();f++){var h=$(k[f]);var a=h.attr("id");var c=$("."+a).val();var b=h.find("option");for(var e=0;e<b.size();e++){var d=$(b[e]).val();if(d==c){$(b[e]).attr("selected","selected")}else{$(b[e]).removeClass("selected")}}}$("#form").validate({event:"submit",rules:{beginTimeStr:{required:true},endTimeStr:{required:true},province:{required:false},preImgUrl:{required:true},adviertLink:{required:true}},messages:{beginTimeStr:{required:"请选择【生效日期】",},endTimeStr:{required:"请选择【结束日期】",},province:{required:"请选择【推广范围】"},preImgUrl:{required:"请上传【广告图片】"},adviertLink:{required:"请输入【广告链接】"}},submitHandler:function(j){var s=$("#beginTimeStr");var t=$("#endTimeStr");var l=s.val();var n=t.val();if((l!=""||l!=null)&&(n!=""||n!=null)){var i=new Date(l.replace("-","/").replace("-","/"));var m=new Date(n.replace("-","/").replace("-","/"));if(i>m){bootbox.alert("开始时间大于结束时间！");return}}var q=0;var p="";if(!g()){return false}if(q==0){var o=$("#baseUrl").text().trim();var r=$("#form").serialize();$.ajax({url:o+"/adminManage/platfromAdviertisement/save",data:r,type:"POST",success:function(u){u=$.parseJSON(u);bootbox.alert(u.values,function(){if(u.executeStatus=="0"){location.href=o+u.url}})}})}else{bootbox.alert(p,function(){})}return false},errorPlacement:function(i,j){i.appendTo(j.parent().parent())}})});