<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">
	<tr>
		<td class="col-md-2 td0">通道编号</td><td class="col-md-4 parent_id_parse">${item.passageNo}</td>
		<td class="col-md-2 td0">渠道编号</td><td class="col-md-4 parent_id_parse">${item.channelNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">渠道名称</td><td class="col-md-4 parent_id_parse">${item.channelName}</td>
		<td class="col-md-2 td0">代理商编号</td><td class="col-md-4 ">${item.agentNo}</td>
	</tr>	
	<tr>
		<td class="col-md-2 td0">代理商名称</td><td class="col-md-4 ">${item.agentName}</td>		
<%-- 		<td class="col-md-2 td0">代理机构</td><td class="col-md-4 " >${item.agency}</td> --%>
	<td class="col-md-2 td0">商户编号</td><td class="col-md-4" >${item.merchantNo}</td>
	</tr>
	<tr>
	<td class="col-md-2 td0">商户名称</td><td class="col-md-4" >${item.merchantName}</td>
		<td class="col-md-2 td0">支付通道编号</td>
		<td class="col-md-4" >
			<c:if test="${item.payCode=='zfb'}">支付宝</c:if>
			<c:if test="${item.payCode=='wechat'}">微信</c:if>
<%-- 			<c:if test="${item.payCode=='qqqb'}">qq钱包</c:if> --%>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">银行商户编号</td><td class="col-md-4" >${item.pwayMerchantNo}</td>
		<td class="col-md-2 td0">通道状态</td><td class="col-md-4" >
			<c:if test="${item.passageStatus=='Y' }">生效中</c:if>
			<c:if test="${item.passageStatus=='N' }">未生效</c:if>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0 ">入网时间</td><td class="col-md-4 date_time_parse" >${item.createTime}</td>
		<td class="col-md-2 td0 ">修改时间</td><td class="col-md-4 date_time_parse" >${item.updateTime}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">操作人</td><td class="col-md-4" >${item.operator}</td>
<%-- 		<td class="col-md-2 td0">记录状态</td><td class="col-md-4" >${item.recordStatus}</td> --%>
		<td class="col-md-2 td0">备注</td><td class="col-md-4" colspan="3" >${item.remark}</td>
	</tr>
</table>
<script type="text/javascript">
dataOpr();
</script>
