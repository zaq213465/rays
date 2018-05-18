<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">

	<tr>
		<%-- <td class="col-md-2 td0">支付授权目录</td>
		<td>
				<input type="text" class="form-control" id="temp2"  name = "temp2" value="${item.temp2}" placeholder="商户APPID">
		</td>	 --%>
		<%-- <td class="col-md-2 td0">SubAPPID</td>
		<td>
			<c:if test="${pageType==1}">
				<label id="temp3"  name = "temp3" >${item.temp3}</label>
			</c:if>
			<c:if test="${pageType==2 && item.registerType != '2'}">
				<input type="text" class="form-control" id="temp3"  name = "temp3" value="${item.temp3}" placeholder="秘钥" readonly="readonly">
			</c:if>
			<c:if test="${pageType==2 && item.registerType == '2'}">
				<input type="text" class="form-control" id="temp3"  name = "temp3" value="${item.temp3}" placeholder="秘钥">
			</c:if>
		</td>	 --%>	
	</tr>
	<%-- <tr>
		<td class="col-md-2 td0">推荐关注公众账号APPID</td>
		<td>
			<c:if test="${pageType==1}">
				<label id="temp2"  name = "temp2" >${item.temp2}</label>
			</c:if>
			<c:if test="${pageType==2 && item.registerType != '2'}">
				<input type="text" class="form-control" id="temp2"  name = "temp2" value="${item.temp2}" placeholder="商户APPID" readonly="readonly">
			</c:if>
			<c:if test="${pageType==2 && item.registerType == '2'}">
				<input type="text" class="form-control" id="temp2"  name = "temp2" value="${item.temp2}" placeholder="商户APPID">
			</c:if>
		</td>	
	</tr> --%>
</table>
<script type="text/javascript">
dataOpr();
</script>
