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
		<td class="col-md-2 td0">商户编号</td><td class="col-md-4 parent_id_parse" >${item.merchantNo}</td>
		<td class="col-md-2 td0">支付宝交易号</td><td class="col-md-4 parent_id_parse" >${item.alipayTradeNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">交易类型</td><td class="col-md-4 parent_id_parse" >
            <c:if test="${item.tradeType=='01' }">
					支付
			</c:if>	
			<c:if test="${item.tradeType=='02'}">
					退款
			</c:if>
			<c:if test="${item.tradeType=='03' }">
					撤销
		    </c:if>	
        </td>
		<td class="col-md-2 td0">商户订单号</td><td class="col-md-4 parent_id_parse" >${item.merchantOrderNo}</td>
	</tr>
	<tr>
	    <td class="col-md-2 td0">交易金额(元)</td><td class="col-md-4 parent_id_parse" ><fmt:formatNumber value="${item.tradeAmt}" pattern="#0.00"/></td>
		<td class="col-md-2 td0">交易时间</td><td class="col-md-4 date_time_parse" >${item.tradeTime}</td>
	</tr>
	<tr>
	    <td class="col-md-2 td0">商品名称</td><td class="col-md-4 parent_id_parse" >${item.productName}</td>
		<td class="col-md-2 td0">商户手续费</td><td class="col-md-4 parent_id_parse" ><fmt:formatNumber value="${item.merchantFees}" pattern="#0.00"/></td>
	</tr>
	<tr>
     	<td class="col-md-2 td0">商户收款金额</td><td class="col-md-4 parent_id_parse" ><fmt:formatNumber value="${item.merchantAmt}" pattern="#0.00"/></td>
		<td class="col-md-2 td0">支付类型</td><td class="col-md-4 parent_id_parse" >
     	    <c:if test="${item.payType=='scan_code' }">
					扫码支付
			</c:if>	
			<c:if test="${item.payType=='bar_code'}">
					条码支付
			</c:if>
        </td>
	</tr>
</table>
<script type="text/javascript">
dataOpr();
</script>
