<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">

	<tr>
		<td class="col-md-2 td0">渠道编号</td><td class="col-md-4 parent_id_parse" title="channelNo">${item.channelNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">代理商编号</td><td class="col-md-4 parent_id_parse" title="agentNo">${item.agentNo}</td>
	</tr>
	<tr> 
		<td class="col-md-2 td0">商户编号</td><td class="col-md-4 parent_id_parse" title="merchantNo">${item.merchantNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">认证接口</td><td class="col-md-4 parent_id_parse" title="authInterface">${item.authInterface}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">认证参数</td><td class="col-md-4 parent_id_parse" title="authParams"  id="rzcs">
		${item.authParams} 
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">认证描述</td><td class="col-md-4 parent_id_parse" title="returnAuthMsg">${item.returnAuthMsg}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">认证时间</td><td class="col-md-4 date_time_parse" title="createTime">${item.createTime}</td>
	</tr>
</table>
<script type="text/javascript">
dataOpr();
// function getRZCS(){
// var obj=${item.authParams} || "{}";
// $("#rzcs").html("<span>身份证："+obj.idCard+"   真实姓名："+obj.realName+"</span>"+"<span>手机号码："+obj.mobile+"   银行卡："+obj.bankCard+"</span>");
// }
// getRZCS();
</script>
