<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="page" uri="page" %> 
<%
   String path =  request.getContextPath();
request.setAttribute("path", path);
%>			
		
<div class="portlet-title">
	<div class="caption">
		<i class="fa fa-globe"></i>交易订单列表
	</div>
</div>
						
<table class="table table-striped table-bordered table-hover" id="sample_6">
							<thead>
							<tr>
								<th>交易订单编号</th>
								<!-- <th>渠道编号</th> -->
								<th>渠道名称</th>
								<!-- <th>代理商编号</th> -->
								<th>代理商名称</th>
								<!-- <th>商户编号</th> -->
								<th>商户名称</th>
								<th>门店名称</th>
								<!-- <th>支付二维码编号</th> -->
								<th>支付通道</th>
								<th>订单金额(元)</th>
								<!-- <th>商品名称</th> -->
								<th>交易时间</th>
								<!-- <th>结束时间</th> -->
								<th>订单状态</th>
								<th>
									 操作
								</th>
							</tr>
							</thead>
							<tbody id="tableContent">
							
						  <c:forEach var="item" items="${pager.result}"> 
						   <tr>
									<td>${item.tradeNo}</td>
									<%-- <td>${item.channelNo}</td> --%>
									<td>${item.channelName}</td>
									<%-- <td>${item.agentNo}</td> --%>
									<td>${item.agentName}</td>
									<%-- <td>${item.merchantNo}</td> --%>
									<td>${item.merchantName}</td>
									<td>${item.storeName}</td>
									<%-- <td>${item.qrCode}</td> --%>
									<td class="parent_id_parse" title="payCode">${item.payCode}</td>
									<td><fmt:formatNumber pattern="#0.00">${item.orderAmt}</fmt:formatNumber></td>
									<%-- <td>${item.productName}</td> --%>
									<td class="date_time_parse">${item.beginTime}</td>
									<%-- <td class="date_time_parse">${item.endTime}</td> --%>
									<td>
									<c:if test="${item.orderStatus=='00'}">
										订单创建
									</c:if>
									<c:if test="${item.orderStatus=='01' }">
										支付中
									</c:if>	
									<c:if test="${item.orderStatus=='02' }">
										交易成功
									</c:if>	
									<c:if test="${item.orderStatus=='03'}">
										交易失败
									</c:if>
									<c:if test="${item.orderStatus=='04' }">
										已退款
									</c:if>	
									<c:if test="${item.orderStatus=='05' }">
										已撤销
									</c:if>	
									</td>
							<td>
								<a onclick="javascript:todetail('${item.id}');"><span class="label label-default">查看详情</span></a>
   							    <a href="${path}/adminManage/orderrefund/${item.id}"><span class="label label-info">退款申请</span></a>
							</td>               
						 </tr>
					</c:forEach>
					<c:if test="${pager.result.size() == 0}">
								<tr>
									<td class="page-nodata" colspan="10">查无数据！</td>
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
								   url: "orderrefund/detail/"+id,
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
			<page:page curPage="${pager.pageNo}" totalPages="${pager.totalPages}"/><b class="totalCountInPage">共&nbsp;&nbsp;${pager.totalCount}&nbsp;&nbsp;条				