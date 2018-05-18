<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	request.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${path}/resources/assets/global/plugins/select2/select2.css" />
<link rel="stylesheet" type="text/css"
	href="${path}/resources/assets/global/plugins/datatables/extensions/Scroller/css/dataTables.scroller.min.css" />
<link rel="stylesheet" type="text/css"
	href="${path}/resources/assets/global/plugins/datatables/extensions/ColReorder/css/dataTables.colReorder.min.css" />
<link rel="stylesheet" type="text/css"
	href="${path}/resources/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="${path}/resources/styles/bootstrap-select.css" />
<title>选择要切换的通道类型</title>
</head>
<body>
	<form id="checkForm" action="" method="post">
		<input id="id" name="id" value="${id}" type="hidden" />
		<table class="table table-striped table-bordered table-hover"
			id="sample_6">
			<thead>
				<tr>
					<th>通道编号</th>
					<th>通道名称</th>
					<th>通道描述</th>
					<th>默认通道</th>
				</tr>
			</thead>
			<tbody id="tableContent">
			<tr>
				<td>${item.passageNo}</td>
				<td>${item.passageName}</td>
				<td>${item.passageDesc}</td>
				<td colspan="2">
					<select id="passageType" name="passageType" class="form-control">
						<option value="N">-- 请选择 --</option>
						<c:forEach items="${passageType}" var="type">
							<c:if test="${type=='T0'}">
								<option value='T0'>T0</option>
							</c:if>
							<c:if test="${type=='T1'}">
								<option value='T1'>T1</option>
							</c:if>
							<c:if test="${type=='T01'}">
								<option value='T01'>通用</option>
							</c:if>
						</c:forEach>
					</select>
				</td>
				<tr>
				<tr>
					<td align="right" colspan="2">
						<button type="button" class="btn btn-default"
							onClick="javascript:choose()">确定</button>
					</td>
					<td align="left" colspan="2">
						<button type="button" class="btn default" id="cancel">取消</button>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
<script type="text/javascript">
dataOpr();
function choose(){
	var baseUrl = '${path}';
	var passageType=$("#passageType").val();
	if(passageType=='N'){
		window.location.href= baseUrl + "/adminManage/platfrompassageconfig";
		return;
	}
	var id=$("#id").val();
	$.ajax({
				data : $("#changeForm").serialize(),
				url : baseUrl + "/adminManage/platfrompassageconfig/change?passageType="+passageType+"&id="+id,
				success : function(msg) {
					msg = $.parseJSON(msg);
					bootbox.alert(msg.values, function() {
						window.location.href = baseUrl
								+ "/adminManage/platfrompassageconfig";
					});
				}
			});
}
$(function(){
	var baseUrl = '${path}';
// 	if(${empty passageType}){
// 		bootbox.alert("无其他通道可切换！",function(){
// 		window.location.href = baseUrl
// 		+ "/adminManage/platfrompassageconfig";
// 		});
// // 		这里有问题
		
// 		this.window.close();
// 	}
	$("#checkForm").find("#cancel").click(function(){
		window.location.href= baseUrl + "/adminManage/platfrompassageconfig";
	});	
})
</script>
</html>