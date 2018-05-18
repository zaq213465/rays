<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">
	<tr>
		<td class="col-md-2 td0">名称</td><td>${item.name}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">KEY</td><td>${item.keyNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">参数名称</td><td>${item.paraName}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">参数值</td>
		<td class="big-word" style="word-break: break-all; max-width: 600px;" val='${item.paraVal}'  >
				<c:choose>  
				    <c:when test="${fn:length(item.paraVal) > 10}">  
				        <c:out value="${fn:substring(item.paraVal, 0, 10)}" /><b title="点击展开全部" class="clicktoall">......</b>
				    </c:when>  
				   <c:otherwise>  
				      <c:out value="${item.paraVal}" />  
				    </c:otherwise>  
				</c:choose>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">创建时间</td><td class ="date_time_parse">${item.createTime}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">修改时间</td><td class ="date_time_parse">${item.updateTime}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">操作人</td><td>${item.operator}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">备注</td><td>${item.remark}</td>
	</tr>
<!-- 	<tr> -->
<%-- 		<td class="col-md-2 td0">创建时间</td><td class="col-md-4 date_time_parse" title="createTime">${item.createTime}</td> --%>
<!-- 	</tr> -->
</table>
<script type="text/javascript">
dataOpr();
$(function(){
	$(".clicktoall").click(function(){
		$(this).parent().text($(this).parent().attr("val"));
	});
});
</script>
