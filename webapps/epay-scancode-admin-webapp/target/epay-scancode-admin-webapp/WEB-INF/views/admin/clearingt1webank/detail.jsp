<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">

	<tr>
		<td class="col-md-2 td0">交易日期</td><td class="col-md-4 parent_id_parse" >${item.tradeDate}</td>
		<td class="col-md-2 td0">代理商编号</td><td class="col-md-4 parent_id_parse" >${item.agencyNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">代理商名称</td><td class="col-md-4 parent_id_parse" >${item.agencyName}</td>
		<td class="col-md-2 td0">商户编号</td><td class="col-md-4 parent_id_parse" >${item.merchantNo}</td>
	</tr>
	<tr>
	    <td class="col-md-2 td0">商户名称</td><td class="col-md-4 parent_id_parse" >${item.merchantName}</td>
		<td class="col-md-2 td0">商户订单号</td><td class="col-md-4 parent_id_parse" >${item.tradeNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">微众订单号</td><td class="col-md-4 parent_id_parse" >${item.webankTradeNo}</td>
		<td class="col-md-2 td0">交易类型</td><td class="col-md-4 parent_id_parse" >${item.tradeType}</td>
	</tr>
	<tr>
	    <td class="col-md-2 td0">交易金额(元)</td><td class="col-md-4 parent_id_parse" ><fmt:formatNumber value="${item.tradeAmt}" pattern="#0.00"/></td>
		<td class="col-md-2 td0">商户手续费</td><td class="col-md-4 parent_id_parse" ><fmt:formatNumber value="${item.merchantFees}" pattern="#0.00"/></td>
	</tr>
	<tr>
	    <td class="col-md-2 td0">代理商手续费</td><td class="col-md-4 parent_id_parse" ><fmt:formatNumber value="${item.agencyFees}" pattern="#0.00"/></td>
		<td class="col-md-2 td0">清算金额</td><td class="col-md-4 parent_id_parse" ><fmt:formatNumber value="${item.clearAmt}" pattern="#0.00"/></td>
	</tr>
</table>
<script type="text/javascript">
dataOpr();
</script>
