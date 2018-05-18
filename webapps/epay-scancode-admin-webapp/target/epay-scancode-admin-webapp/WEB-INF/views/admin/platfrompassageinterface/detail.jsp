<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">
	<tr>
		<td class="col-md-2 td0">通道编号</td><td class="col-md-4 parent_id_parse">${item.passageNo}</td>
		<td class="col-md-2 td0">通道接口类型</td>
		<td>
			<c:if test="${item.interfaceType == '0'}">商户入驻</c:if>
			<c:if test="${item.interfaceType == '1'}">支付类</c:if>
			<c:if test="${item.interfaceType == '2'}">查询类</c:if>
			<c:if test="${item.interfaceType == '3'}">信息修改</c:if>
			<c:if test="${item.interfaceType == '4'}">回调类</c:if>
		</td>	
	</tr>
	<tr>
		<td class="col-md-2 td0">通道接口编号</td><td class="col-md-4 ">${item.interfaceCode}</td>		
		<td class="col-md-2 td0">通道接口名称</td><td class="col-md-4 " >${item.interfaceName}</td>
	</tr>
<!-- 	<tr> -->
<%-- 		<td class="col-md-2 td0">通道支付类型</td><td class="col-md-4" >${item.payCode}</td> --%>
<%-- 		<td class="col-md-2 td0">通道优先级</td><td class="col-md-4" >${item.passagePriority}</td> --%>
<!-- 	</tr> -->
	<tr>
		<td class="col-md-2 td0">通道参数</td><td class="col-md-4 big-word" colspan="3" style="word-break: break-all; max-width: 600px;" val='${item.passageParams}'  >
			<c:choose>  
			    <c:when test="${fn:length(item.passageParams) > 50}">  
			        <c:out value="${fn:substring(item.passageParams, 0, 50)}" /><b title="点击展开全部" class="clicktoall">......</b>
			    </c:when>  
			   <c:otherwise>  
			      <c:out value="${item.passageParams}" />  
			    </c:otherwise>  
			</c:choose>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">接口限制</td><td class="col-md-4" >${item.interfaceLimit}</td>
		<td class="col-md-2 td0">使用状态</td><td class="col-md-4" >
			<c:if test="${item.userStatus=='Y'}">使用中</c:if>
			<c:if test="${item.userStatus=='N'}">未使用</c:if>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">状态</td><td class="col-md-4" >
			<c:if test="${item.status=='1'}">正常</c:if>
			<c:if test="${item.status=='0'}">关闭</c:if>
		</td>
<!-- 		<td class="col-md-2 td0">记录状态</td><td class="col-md-4" > -->
<%-- 			<c:if test="${item.recordStatus=='Y'}">正常</c:if> --%>
<%-- 			<c:if test="${item.recordStatus=='N'}">删除</c:if> --%>
<!-- 		</td> -->
		<td class="col-md-2 td0">创建时间</td><td class="col-md-4 date_time_parse" >${item.createTime}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">修改时间</td><td class="col-md-4 date_time_parse" >${item.updateTime}</td>
		<td class="col-md-2 td0">操作人</td><td class="col-md-4" >${item.operator}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">备注</td><td class="col-md-4"  colspan="3">${item.remark}</td>
	</tr>
</table>
<script type="text/javascript">
dataOpr();
$(".clicktoall").click(function(){
	$(this).parent().text($(this).parent().attr("val"));
});
</script>
