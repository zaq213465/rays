function submitForm(c,f,d,e){var b=document.getElementById(c);var a;if(e=="apifile"){a=/\.zip$|\.rar$/}else{a=/\.jpg$|\.png$|\.jpeg$|\.gif$|\.JPG$|\.PNG$|\.JPEG$|\.GIF$/}$("#"+d).parent().find("label").remove();$("#"+d).parent().append('<label class="loading">上传中...</label>');if(b.value!=null&&a.test(b.value)){$.ajaxFileUpload({url:baseurl+"/adminManage/file/upload",data:{typePath:e},type:"POST",secureuri:false,fileElementId:c,dataType:"json",success:function(i){if(i.executeStatus==0){var h=$("#"+f);var g=i.values;h.val(g);$("#"+d).parent().find("label").remove();if(e=="apifile"){$("#"+d).attr("href",g);$("#"+d).parent().append('<label class="success">上传成功！</label>')}else{$("#"+d).attr("src",g)}}else{bootbox.alert(i.values,function(){})}},error:function(h,g,i){bootbox.alert("上传失败,请稍后重试")}})}else{$("#"+d).parent().find("label").remove();if(e=="apifile"){bootbox.alert("选择压缩文件上传,格式要求【zip|rar】")}else{bootbox.alert("选择图片上传,格式要求【jpg|png|jpeg|gif|JPG|PNG|JPEG|GIF】")}}};