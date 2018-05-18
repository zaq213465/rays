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
								<th>账号</th>
								<th>姓名</th>
								<th>电话</th>
								<th>角色</th>
								<!-- <th>
									 渠道名称
								</th> -->
								<th>创建时间</th>
								<th>状态</th>
								<th>
									 操作
								</th>
							</tr>
							</thead>
							<tbody id="tableContent">
							
						  <c:forEach var="item" items="${pager.result}"> 
						   <tr>
									<td class="parent_id_parse" title="userName">${item.userName}</td>
									<td class="parent_id_parse" title="shortName">${item.shortName}</td>
									<td class="parent_id_parse" title="phone">${item.phone}</td>
									<td class="parent_id_parse" title="roleName">${item.roleName}</td>
									<%-- <td title="${item.channelCode}">${item.channelName}</td> --%>
									<td class="date_time_parse">${item.createTime}</td>
									<td class="parent_id_parse" title="status">${item.status}</td>
							<td>
								<a onclick="javascript:todetail('${item.id}');"><span class="label label-default">查看详情</span></a>
								<%-- <c:if test="${not empty item.channelCode && item.channelCode != ' '}"><a href="${path}/adminManage/accountuserralation/accountId/${item.id}"><span class="label label-success">分配商户</span></a></c:if> --%>
								<a href="${path}/adminManage/sys/admin/${item.id}"><span class="label label-info">修改</span></a>
<%-- 								<a onclick="javascript:del('${item.id}');"><span class="label label-danger">删除</span></a> --%>
						   			<c:if test="${item.status == 0}"><a onclick="javascript:updateStatus(this);" status="1" value="${item.id}"><span class="label label-success">启用</span></a></c:if>
									<c:if test="${item.status == 1}"><a onclick="javascript:updateStatus(this);" status="0" value="${item.id}"><span class="label label-danger">禁用</span></a></c:if>
								<a onclick="javascript:toreset('${item.id}','${item.userName }');"><span class="label label-default">重置密码</span></a>										
							</td> 
						 </tr>
					</c:forEach>
					<c:if test="${pager.result.size() == 0}">
						<tr>
							<td class="page-nodata" colspan="7">查无数据！</td>
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
								   url: "admin/detail/"+id,
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
						
				// 重置密码
			
				function toreset(id,name) {
					bootbox.setLocale("zh_CN"); // 设置按钮为中文
					var flag = 0;
					var box = '<form class="form-horizontal"><div class="form-body row">'
							+ '<div class="form-group col-md-7">'
							+ '<label class="control-label col-md-4">密码</label>'
							+ '<div class="col-md-8">'
							+ '<input type="password" class="form-control" id="password" name="password" placeholder="密码">'
							+ '</div>'
							+ '</div>'
							+ '<div class="form-group col-md-7">'
							+ '<label class="control-label col-md-4">重复密码</label>'
							+ '<div class="col-md-8">'
							+ '<input type="password" class="form-control" id="passwordstr" name="passwordstr" placeholder="重复密码">'
							+ '</div>' + '</div>' + '</div></form>';
					var btn = {
						success : {
							label : "重置",
							className : "btn-success",
							callback : function() {
								var password = $('#password').val();
								var passwordstr = $('#passwordstr').val();
								//密码大于6位
								if (password == '') {
									flag++;
									bootbox.alert("密码不能为空！");
								}else if (passwordstr == '') {
									flag++;
									bootbox.alert("重复密码不能为空！");
								}else{
									if(passwordstr != password){
										flag++;
										bootbox.alert("两次输入的密码不相同！");
									}
								}
								
								var tel =  /^[a-zA-Z]\w{5,17}$/;
				   			    if(!tel.test(password)){
				   				    flag++;
				   					bootbox.alert("密码以字母开头,长度在6~18之间,只能包含字母、数字和下划线!");
				   			    }

								if (flag == 0) {
									var baseUrl = $("#baseUrl").text().trim();
									$.ajax({
											type : "POST",
											 url : "admin/reset/"+ id+"/"+name,
											data : {"password" : password},
										 success : function(msg) {
												msg = $.parseJSON(msg);
												bootbox.alert(msg.values,function() {
													if (msg.executeStatus == '0') {
														location.href = baseUrl+ msg.url;
														}
													});
												}
									});
								}
							}
						},
						"取消" : {
							className : "btn-danger",
							callback : function() {
							}
						}
					}
					bootbox.dialog({
						message : box,
						title : "重置密码",
						onEscape : function() {
						},
						className : "green-haze",
						buttons : btn
					});
				}
			</script>
			<page:page curPage="${pager.pageNo}" totalPages="${pager.totalPages}"/><b class="totalCountInPage">共&nbsp;&nbsp;${pager.totalCount}&nbsp;&nbsp;条</b>				