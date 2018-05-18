$(function(){
	Metronic.init(); // 初始化框架核心组件
	Layout.init(); // 初始化网格
	QuickSidebar.init(); // 初始化快捷操作栏
	Demo.init(); // 初始化项目
	/*验证表格*/
	$("#cancle").click(function(){
		history.go(-1);
	});
});


function submitForm(file,imgPath,preImg,data) {
	var filev = document.getElementById(file);
	/*alert(filev.value)
	alert(data)
	var patn;
	if(data == 'apifile'){
		 patn = /\.zip$|\.rar$/;
	}else{
		 patn = /\.jpg$|\.png$|\.jpeg$|\.gif$|\.JPG$|\.PNG$|\.JPEG$|\.GIF$/;
	}
	$('#'+preImg).parent().find("label").remove();
	$('#'+preImg).parent().append('<label class="loading">上传中...</label>');
	if (filev.value != null && patn.test(filev.value)) {*/
		$.ajaxFileUpload({
					url : baseurl+'/adminManage/orderpayment/upload',
					data:{"typePath":data},
					type:'POST',
					secureuri : false,
					fileElementId : file,
					dataType : 'json',
					success : function(msg) {
						if(msg.executeStatus == 0){
							 var img = $('#'+imgPath);
							 var result = msg.values;//.split(";"); //包含id与路径
							 img.val(result);
							 $('#'+preImg).parent().find("label").remove();
							 console.log(data)
							 if(data == 'idcardImg2'){
								 /*$('#'+preImg).attr("href",result);
								 $('#'+preImg).parent().append('<label class="success">上传成功！</label>');*/
								 bootbox.alert('上传成功');
							 }else{
								 $('#'+preImg).attr("src",result);
							 }
						 }else{
							 bootbox.alert(msg.values,function(){});
						 }
					},
					error : function(data, status, e) {
						bootbox.alert('上传失败,请稍后重试');
					}
				});
	/*} else {
		$('#'+preImg).parent().find("label").remove();
		if(data == 'apifile'){
			bootbox.alert('选择压缩文件上传,格式要求【zip|rar】');
		}else{
			bootbox.alert('选择图片上传,格式要求【jpg|png|jpeg|gif|JPG|PNG|JPEG|GIF】');
		}
	}*/
	
}