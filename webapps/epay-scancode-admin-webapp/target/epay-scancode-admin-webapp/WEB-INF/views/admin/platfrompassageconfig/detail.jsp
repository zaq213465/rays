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
		<td class="col-md-2 td0">通道名称</td><td class="col-md-4 parent_id_parse">${item.passageName}</td>	
	</tr>
	<tr>
		<td class="col-md-2 td0">通道描述</td><td class="col-md-4 ">${item.passageDesc}</td>		
		<td class="col-md-2 td0">通道参数</td><td class="col-md-4 " >${item.passageParams}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">通道优先级</td><td class="col-md-4" >${item.passagePriority}</td>
		<td class="col-md-2 td0">通道限制</td><td class="col-md-4" >${item.passageLimit}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">是否支持T0</td><td class="col-md-4" >
			<c:if test="${item.isT0=='Y'}">支持</c:if>
			<c:if test="${item.isT0=='N'}">不支持</c:if>
		</td>
		<td class="col-md-2 td0">是否支持T1</td><td class="col-md-4" >
			<c:if test="${item.isT1=='Y'}">支持</c:if>
			<c:if test="${item.isT1=='N'}">不支持</c:if>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">商户信息是否同步入网</td><td class="col-md-4" >
			<c:if test="${item.merchantSynchronization=='Y'}">是</c:if>
			<c:if test="${item.merchantSynchronization=='N'}">否</c:if>
		</td>
		<td class="col-md-2 td0">默认类型</td><td class="col-md-4" >${item.defaultPassage}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">使用状态</td><td class="col-md-4" >
			<c:if test="${item.userStatus=='Y'}">使用中</c:if>
			<c:if test="${item.userStatus=='N'}">未使用</c:if>
		</td>
		<td class="col-md-2 td0">状态</td><td class="col-md-4" >
			<c:if test="${item.status=='1'}">正常</c:if>
			<c:if test="${item.status=='2'}">关闭</c:if>
		</td>
	</tr>
	<tr>
<!-- 		<td class="col-md-2 td0">记录状态</td><td class="col-md-4" > -->
<%-- 			<c:if test="${item.recordStatus=='Y'}">正常</c:if> --%>
<%-- 			<c:if test="${item.recordStatus=='N'}">删除</c:if> --%>
<!-- 		</td> -->
		<td class="col-md-2 td0">创建时间</td><td class="col-md-4 date_time_parse" >${item.createTime}</td>
		<td class="col-md-2 td0">修改时间</td><td class="col-md-4 date_time_parse" >${item.updateTime}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">操作人</td><td class="col-md-4" >${item.operator}</td>
		<td class="col-md-2 td0">备注</td><td class="col-md-4"  colspan="3">${item.remark}</td>
	</tr>
</table>
<script type="text/javascript">
dataOpr();
</script>
