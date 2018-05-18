<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">

	<tr>
		<td class="col-md-2 td0">渠道编号</td><td class="col-md-4 parent_id_parse" >${item.channelNo}</td>
		<td class="col-md-2 td0">渠道名称</td><td class="col-md-4 parent_id_parse">${item.channelName}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">开户名</td><td class="col-md-4 parent_id_parse" >${item.name}</td>
		<td class="col-md-2 td0">身份证号码</td><td class="col-md-4 parent_id_parse" >${item.idCard}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">手机号码</td><td class="col-md-4 parent_id_parse">${item.mobile}</td>
		<td class="col-md-2 td0">联行号</td><td class="col-md-4 parent_id_parse">${item.bankCode}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">开户行名称</td><td class="col-md-4 parent_id_parse">${item.bankName}</td>
		<td class="col-md-2 td0">银行卡号码</td><td class="col-md-4 parent_id_parse">${item.bankCard}</td>
	</tr>
	
	<tr>
<!-- 		<td class="col-md-2 td0">实时到账</td><td class="col-md-4 parent_id_parse"> -->
<%-- 		<c:if test="${item.isRealAccount == 'Y'}">是</c:if> --%>
<%-- 		<c:if test="${item.isRealAccount == 'N'}">否</c:if> --%>
<!-- 		</td> -->
		<td class="col-md-2 td0">创建时间</td><td class="col-md-4 date_time_parse">${item.createTime}</td>
		<td class="col-md-2 td0">账户类型</td><td class="parent_id_parse" title="accountType">${item.accountType}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">状态</td><td class="parent_id_parse">
		<c:if test="${item.status == '1'}">有效</c:if>
		<c:if test="${item.status == '2'}">无效</c:if>
		</td>
		<td class="col-md-2 td0">操作人账号</td><td class="col-md-4 parent_id_parse">${item.operator}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">备注</td><td colspan="3" class="parent_id_parse">${item.remark}</td>
	</tr>
</table>
<script type="text/javascript">
dataOpr();
</script>
