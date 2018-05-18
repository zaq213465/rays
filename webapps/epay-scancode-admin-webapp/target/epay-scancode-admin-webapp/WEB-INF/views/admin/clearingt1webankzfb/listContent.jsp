<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="page" uri="page"%>
<%
   String path =  request.getContextPath();
request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered table-hover"
	id="sample_6">
	<thead>
		<tr>
			<th>交易日期</th>
			<th>代理商编号</th>
			<th>商户编号</th>
			<th>商户订单号</th>
			<th>支付宝交易号</th>
			<th>商品名称</th>
			<th>交易金额</th>
			<th>交易类型</th>
			<th>交易时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody id="tableContent">

		<c:forEach var="item" items="${pager.result}">
			<tr>
				<td>${item.tradeDate}</td>
				<td>${item.agencyNo}</td>
				<td>${item.merchantNo}</td>
				<td>${item.merchantOrderNo}</td>
				<td>${item.alipayTradeNo}</td>
				<td>${item.productName}</td>
				<td>${item.tradeAmt}</td>
				<td>
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
				<td class="date_time_parse">${item.tradeTime}</td>
				<td>
				    <a onclick="javascript:todetail('${item.id}');"> <span class="label label-default">查看详情</span></a>
				</td>
			</tr>
		</c:forEach>
		<c:if test="${pager.result.size() == 0}">
			<tr>
				<td class="page-nodata" colspan="12">查无数据！</td>
			</tr>
		</c:if>
	</tbody>
</table>
<script type="text/javascript">
dataOpr();
						//显示详情
						function todetail(id){
							$.ajax({
								   type: "POST",
								   url: "clearingt1webankzfb/detail/"+id,
								   success: function(msg){
									   var btn = {success:{   
									       label: "关闭",
									       className: "btn-default",
									       callback: function() {
									       }
									     }};
									   bootbox.dialog({
										   message: msg,
										   title: "详情列表",
										   onEscape: function() {},
										   className: "green-haze",
										   buttons: btn
										 });
								   }
							});
						}
			</script>
<page:page curPage="${pager.pageNo}" totalPages="${pager.totalPages}" />
<b class="totalCountInPage">共&nbsp;&nbsp;${pager.totalCount}&nbsp;&nbsp;条</b>
