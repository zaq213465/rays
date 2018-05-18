<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="page" uri="page" %> 
<%
   String path =  request.getContextPath();
   request.setAttribute("path", path);
%>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>平台通道信息</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN PAGE LEVEL STYLES -->
<jsp:include page="../include/commoncss.jsp"></jsp:include>
<link rel="shortcut icon" href="${currentChannelInfo.icon }"/>
<style type="text/css">
.hiddenRow{
	display: none;
}
</style>
</head>
<body class="page-header-fixed page-quick-sidebar-over-content">
<jsp:include page="../include/head.jsp"></jsp:include>
<!-- BEGIN CONTAINER -->
<div class="page-container">
<jsp:include page="../include/menu.jsp"></jsp:include>
	<!-- BEGIN CONTENT -->
	<section id="ucenterSection">
			
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN SEARCH CONDITION -->
			<div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form action="save" class="form-horizontal" id="form" method="post">
						<div class="form-body">
							<input type="hidden" id="id"  name = "id" value="${Obj.id}">
									
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<label class="control-label col-md-2"><span style="color: red">*</span>通道编号</label>
										<c:if test="${Obj == null}">
											<div class="col-md-4">
												<input type="text" class="form-control" id="passageNo"  name = "passageNo" value="${Obj.passageNo}" placeholder="通道编号">
											</div>
										</c:if>
										<c:if test="${Obj != null}">
											<div class="col-md-4" style="margin-top: 7px;">
												${Obj.passageNo}
												<input type="hidden" class="form-control" name = "passageNo" value="${Obj.passageNo}">
											</div>
										</c:if>
									</div>
								</div>
							</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2"><span style="color: red">*</span>通道名称</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="passageName"  name = "passageName"  value="${Obj.passageName }" placeholder="通道名称">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">通道描述</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="passageDesc"  name = "passageDesc"  value="${Obj.passageDesc }" placeholder="通道描述">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">通道参数</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="passageParams"  name = "passageParams"  value="${Obj.passageParams }" placeholder="通道参数">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">通道优先级</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="passagePriority"  name = "passagePriority"  value="${Obj.passagePriority }" placeholder="通道优先级">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">通道限制</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="passageLimit"  name = "passageLimit"  value="${Obj.passageLimit }" placeholder="通道限制">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2"><span style="color: red">*</span>是否支持T0</label>
												<div class="col-md-4">
													<c:if test="${Obj == null}">
													<select  id="isT0" class="form-control" name="isT0">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "Y">支持</option>
															<option value = "N">不支持</option>
													</select>
													</c:if>
													<c:if test="${Obj != null}">
													<select  id="isT0" class="form-control" name="isT0">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "Y" <c:if test="${Obj.isT0=='Y'}">selected="selected"</c:if>>支持</option>
															<option value = "N" <c:if test="${Obj.isT0=='N'}">selected="selected"</c:if>>不支持</option>
													</select>
													</c:if>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2"><span style="color: red">*</span>是否支持T1</label>
												<div class="col-md-4">
													<c:if test="${Obj == null}">
													<select  id="isT1" class="form-control" name="isT1">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "Y">支持</option>
															<option value = "N">不支持</option>
													</select>
													</c:if>
													<c:if test="${Obj != null}">
													<select  id="isT1" class="form-control" name="isT1">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "Y" <c:if test="${Obj.isT1=='Y'}">selected="selected"</c:if>>支持</option>
															<option value = "N" <c:if test="${Obj.isT1=='N'}">selected="selected"</c:if>>不支持</option>
													</select>
													</c:if>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2"><span style="color: red">*</span>商户信息是否同步入网</label>
												<div class="col-md-4">
													<c:if test="${Obj == null}">
													<select  id="merchantSynchronization" class="form-control" name="merchantSynchronization">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "Y">是</option>
															<option value = "N">否</option>
													</select>
													</c:if>
													<c:if test="${Obj != null}">
													<select  id="merchantSynchronization" class="form-control" name="merchantSynchronization">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "Y" <c:if test="${Obj.merchantSynchronization=='Y'}">selected="selected"</c:if>>是</option>
															<option value = "N" <c:if test="${Obj.merchantSynchronization=='N'}">selected="selected"</c:if>>否</option>
													</select>
													</c:if>
												</div>
											</div>
										</div>
									</div>
									
<!-- 									<div class="row"> -->
<!-- 										<div class="col-md-12"> -->
<!-- 											<div class="form-group"> -->
<!-- 												<label class="control-label col-md-2">默认类型</label> -->
<!-- 												<div class="col-md-4"> -->
<%-- 													<c:if test="${Obj == null}"> --%>
<!-- 													<select  id="defaultPassage" class="form-control" name="defaultPassage"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<!-- 															<option value = "T0">T0</option> -->
<!-- 															<option value = "T1">T1</option> -->
<!-- 													</select> -->
<%-- 													</c:if> --%>
<%-- 													<c:if test="${Obj != null}"> --%>
<!-- 													<select  id="defaultPassage" class="form-control" name="defaultPassage"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<%-- 															<option value = "T0" <c:if test="${Obj.defaultPassage=='T0'}">selected="selected"</c:if>>T0</option> --%>
<%-- 															<option value = "T1" <c:if test="${Obj.defaultPassage=='T1'}">selected="selected"</c:if>>T1</option> --%>
<!-- 													</select> -->
<%-- 													</c:if> --%>
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 									</div> -->
									
<!-- 									<div class="row"> -->
<!-- 										<div class="col-md-12"> -->
<!-- 											<div class="form-group"> -->
<!-- 												<label class="control-label col-md-2">使用状态</label> -->
<!-- 												<div class="col-md-4"> -->
<%-- 													<c:if test="${Obj == null}"> --%>
<!-- 													<select  id="userStatus" class="form-control" name="userStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<!-- 															<option value = "Y">使用中</option> -->
<!-- 															<option value = "N">未使用</option> -->
<!-- 													</select> -->
<%-- 													</c:if> --%>
<%-- 													<c:if test="${Obj != null}"> --%>
<!-- 													<select  id="userStatus" class="form-control" name="userStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<%-- 															<option value = "Y" <c:if test="${Obj.userStatus=='Y'}">selected="selected"</c:if>>使用中</option> --%>
<%-- 															<option value = "N" <c:if test="${Obj.userStatus=='N'}">selected="selected"</c:if>>未使用</option> --%>
<!-- 													</select> -->
<%-- 													</c:if> --%>
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 									</div> -->
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2"><span style="color: red">*</span>状态</label>
												<div class="col-md-4">
													<c:if test="${Obj == null}">
													<select  id="status" class="form-control" name="status">
															<option value = "1" selected = "selected">正常</option>
															<option value = "0">关闭</option>
													</select>
													</c:if>
													<c:if test="${Obj != null}">
													<select  id="status" class="form-control" name="status">
															<option value = "1" <c:if test="${Obj.status=='1'}">selected="selected"</c:if>>正常</option>
															<option value = "0" <c:if test="${Obj.status=='0'}">selected="selected"</c:if>>关闭</option>
													</select>
													</c:if>
												</div>
											</div>
										</div>
									</div>
									
<!-- 									<div class="row"> -->
<!-- 										<div class="col-md-12"> -->
<!-- 											<div class="form-group"> -->
<!-- 												<label class="control-label col-md-2">记录状态</label> -->
<!-- 												<div class="col-md-4"> -->
<%-- 													<c:if test="${Obj == null}"> --%>
<!-- 													<select  id="recordStatus" class="form-control" name="recordStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<!-- 															<option value = "Y">正常</option> -->
<!-- 															<option value = "N">删除</option> -->
<!-- 													</select> -->
<%-- 													</c:if> --%>
<%-- 													<c:if test="${Obj != null}"> --%>
<!-- 													<select  id="recordStatus" class="form-control" name="recordStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<%-- 															<option value = "Y" <c:if test="${Obj.recordStatus=='Y'}">selected="selected"</c:if>>正常</option> --%>
<%-- 															<option value = "N" <c:if test="${Obj.recordStatus=='N'}">selected="selected"</c:if>>删除</option> --%>
<!-- 													</select> -->
<%-- 													</c:if> --%>
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 									</div> -->
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">备注</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="remark"  name = "remark"  value="${Obj.remark }" placeholder="备注">
												</div>
											</div>
										</div>
									</div>
									
							<div class="row">
								<div class="col-md-12">
									<!-- BEGIN EXAMPLE TABLE PORTLET-->
									<div class="portlet box green-haze"></div>
									<div class="form-group">
										<label class="control-label col-md-2"></label>
										<div class="col-md-10">
											<button type="submit" class="btn green" id="save">保存</button>
											<button type="button" class="btn default" id="cancle">取消</button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form>
					<!-- END FORM-->
				</div>
			</div>
			<!-- END SEARCH CONDITION -->
	</section>
</div>
<!-- END CONTENT -->
<jsp:include page="../include/footer.jsp"></jsp:include>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<!-- 四级菜单不提供选中和三级菜单紧密绑定，在获取三级ID的时候相应的四级资源必须获取 -->
<div class="fade hide">
<c:forEach var="forth" items="${forthMap}" varStatus="statusforth">
	<div id="forth${forth.key}">
	<c:forEach var="forthMenu" items="${forth.value}" varStatus="statusFF"> 
		<input type="hidden" id="text${forthMenu.id}" value="${forthMenu.id}"/>
	</c:forEach>
	</div>
</c:forEach>
</div>

<script src="${path}/resources/assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="${path}/resources/assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
<script src="${path}/resources/assets/admin/layout/scripts/quick-sidebar.js" type="text/javascript"></script>
<script src="${path}/resources/assets/admin/layout/scripts/demo.js" type="text/javascript"></script>

<script src="${path}/resources/scripts/admin/platfrompassageconfig/edit.js?rnd=${version}" type="text/javascript"></script>
<script src="${path}/resources/scripts/jquery.validate.js" type="text/javascript"></script>
<div style="display: none;" id="baseUrl">${path}</div>
</body>
<!-- END BODY -->
</html>