<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="page" uri="page" %> 
<%
   String path =  request.getContextPath();
request.setAttribute("path", path);
%>

<table class="table table-striped table-bordered table-hover" id="sample_6">
							<thead>
							<tr>
								<!-- <th>渠道编号</th> -->
								<th>代理商编号</th>
								<th>代理商名称</th>
								<th>代理商级别</th>
								<!-- <th>所属机构编号</th> -->
								<th>所属机构</th>
								<th>总二维码</th>
								<th>已使用二维码</th>
								<th>剩余二维码</th>
								<!-- <th>编码抬头</th>
								<th>代理商类型</th>
								<th>联系人姓名</th>
								<th>联系人手机号码</th> -->
								<th>状态</th>
								<th>
									 操作
								</th>
							</tr>
							</thead>
							<tbody id="tableContent">
							
						  <c:forEach var="item" items="${pager.result}"> 
						   <tr>
						   			<%-- <td class="parent_id_parse" title="channelNo">${item.channelNo}</td> --%>
									<td class="parent_id_parse" title="agentNo">${item.agentNo}</td>
									<td class="parent_id_parse" title="agentName">${item.agentName}</td>
						   			<td class="parent_id_parse" title="agentLevel">${item.agentLevel}</td>
						   			<%-- <td class="parent_id_parse" title="parentNo">${item.parentNo}</td> --%>
						   			<td class="parent_id_parse" title="parentName">
							   			<c:choose>
							   				<c:when test="${item.agentLevel=='1'}">
							   					${item.channelName}
							   				</c:when>
							   				<c:otherwise>   
											    ${item.parentName}
											</c:otherwise> 
							   			</c:choose>
						   			</td>
									<td class="parent_id_parse" title="agentName">${item.qrTotal}</td>
									<td class="parent_id_parse" title="agentName">${item.useTotal}</td>
									<td class="parent_id_parse" title="agentName">${item.lessTotal}</td>
									<%-- <td class="parent_id_parse" title="agentPreCode">${item.agentPreCode}</td>
									<c:if test="${item.agentType=='0'}">
										<td class="parent_id_parse">个人</td>
									</c:if>
									<c:if test="${item.agentType=='1'}">
										<td class="parent_id_parse">机构</td>
									</c:if>
									<td class="parent_id_parse" title="agentType">${item.agentType}</td>
									<td class="parent_id_parse" title="name">${item.name}</td>
									<td class="parent_id_parse" title="mobile">${item.mobile}</td> --%>
									<c:if test="${item.status=='1'}">
										<td class="parent_id_parse">启用</td>
									</c:if>
									<c:if test="${item.status=='2'}">
										<td class="parent_id_parse">禁用</td>
									</c:if>
									<%-- <td class="parent_id_parse" title="status">${item.status}</td> --%>

							<td>
								<a onclick="javascript:todetail('${item.id}');"><span class="label label-default">查看详情</span></a>
								<a href="${path}/adminManage/agentbase/${item.id}"><span class="label label-info">修改</span></a>
								<%-- <a onclick="javascript:del('${item.id}');"><span class="label label-danger">删除</span></a> --%>
						   		<c:if test="${item.status == 2}"><a onclick="javascript:updateStatus(this);" status="1" value="${item.id}"><span class="label label-success">启用</span></a></c:if>
								<c:if test="${item.status == 1}"><a onclick="javascript:updateStatus(this);" status="2" value="${item.id}"><span class="label label-danger">禁用</span></a></c:if>
								<c:if test="${item.status == 1}"><a href="javascript:assign('${item.id}','${item.agentName}');"><span class="label label-info">分配二维码</span></a></c:if>
								<c:if test="${item.status == 1}"><a onclick="javascript:agentPromotion('${item.agentNo}','${item.agentName}');"><span class="label label-success">推广码</span></a></c:if>
								<%-- <a href="${path}/adminManage/agentbase/setpublicno/${item.agentNo}"><span class="label label-info">设置公众号</span></a>		 --%>
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
								   url: "agentbase/detail/"+id,
								   success: function(msg){
									   var btn = {success:{   
									       label: "关闭",
									       className: "btn-success",
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
						
						
						//显示推广码
						function agentPromotion(agentNo,agentName){
							$.ajax({
								   type: "POST",
								   url: "agentbase/promotion/"+agentNo,
								   success: function(msg){
									   console.log(msg);
									   /* msg = $.parseJSON(msg);
									   var box = '<div class="form-body row">'+
										  '<div class="form-group col-md-12" style="text-align:center;"><h1>'+agentName+'</h1></div>'+
								          '<div class="form-group col-md-12" style="text-align:center;">'+
									      '<img src="' + msg.agentPromotion.qrImgAddress+ '" />'+
								          '</div>'+
							              '</div>'; */
									   var btn = {success:{
									       label: "关闭",
									       className: "btn-success",
									       callback: function() {
									       }
									     }};
									   bootbox.dialog({
										   message: msg,
										   title: "推广码信息",
										   onEscape: function() {},
										   className: "green-haze",
										   buttons: btn
										});
								   }
							});
						}
						
						
						// 分配二维码
						function assign(id,agentName) {
							bootbox.setLocale("zh_CN"); // 设置按钮为中文
							var flag = 0;
							var box = '<form class="form-horizontal"><div class="form-body row">'+
									  '<div class="form-group col-md-7">'+
									  '<label class="control-label col-md-4">代理商名称</label>'+
								      '<div class="col-md-8">'+
									  '<input type="text" class="form-control" id="agentName" value="'+agentName+'" placeholder="代理商名称">'+
								      '</div>'+
								      '</div>'+
							          '<div class="form-group col-md-7">'+
								      '<label class="control-label col-md-4">二维码数量</label>'+
								      '<div class="col-md-8">'+
									  '<input type="text" class="form-control" id="qrTotal" name="qrTotal" placeholder="二维码数量">'+
								      '</div>'+
							          '</div>'+
						              '</div></form>';
			    			var btn = {
					    		success:{   
							       label: "分配",
							       className: "btn-success",
							       callback: function() {
							    	    var qrTotal = $('#qrTotal').val();
							    	   	if(qrTotal == '') {
							    	   		flag++;
							    	   		bootbox.alert("二维码数量不可为空！",function(){});
							    	   	}else{
							    	   		var number = /^[0-9]*$/; 
							    	   		if(!number.test(qrTotal)){
							    	   			flag++;
							    	   			bootbox.alert("只能输入数字！",function(){});
							    	   		}
							    	   	}
					    	   	
					    	   	if(flag == 0){
						    	    if(agentName != null && agentName != ''){
						    	    	var baseUrl = $("#baseUrl").text().trim();
						    	    	$.ajax({
											   type: "POST",
											   url: "agentbase/assign/"+id,
											   data:{"qrTotal":qrTotal},
											   success: function(msg){
												   	msg = $.parseJSON(msg);
												   	bootbox.alert(msg.values,function(){
							 			 				 if(msg.executeStatus == '0'){
							 			 					location.href=baseUrl+msg.url;
							 			 				 }
							 			 			  });
											   }
										});
					            	}
					    	   	}
					       }
					     },
					     "取消": {
					        className: "btn-danger",
					        callback: function() {
					        }
					     }
					 }
			    bootbox.dialog({
				   message: box,
				   title: "分配二维码",
				   onEscape: function() {},
				   className: "green-haze",
				   buttons: btn
				 });
						}
			</script>
			<page:page curPage="${pager.pageNo}" totalPages="${pager.totalPages}"/><b class="totalCountInPage">共&nbsp;&nbsp;${pager.totalCount}&nbsp;&nbsp;条				