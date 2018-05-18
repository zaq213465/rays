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
<title>支付方式设置编辑</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN PAGE LEVEL STYLES -->
<jsp:include page="../../include/commoncss.jsp"></jsp:include>
<style type="text/css">
.hiddenRow{
	display: none;
}
</style>
</head>
<body class="page-header-fixed page-quick-sidebar-over-content">
<%-- <jsp:include page="../../include/head.jsp"></jsp:include> --%>
<!-- BEGIN CONTAINER -->
<div class="page-container">
<%-- <jsp:include page="../../include/menu.jsp"></jsp:include> --%>
	<!-- BEGIN CONTENT -->
	<section id="ucenterSection">
			<%-- <div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="fa fa-home"></i>
						<a href="${path }/adminManage/index">首页</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="#" onClick="javascript:history.go(-1);">支付方式设置</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<c:if test="${Obj == null}"><a href="#">支付方式新增 </a></c:if>
						<c:if test="${Obj != null}"><a href="#">支付方式更新</a></c:if>
					</li>
				</ul>
			</div> --%>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN SEARCH CONDITION -->
			<div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form class="form-horizontal" id="form">
							<div class="form-body">
								<input type="hidden" id="id" name="id" value="${Obj.id}">
								<input type="hidden" id="channelNo"  name = "channelNo" value="${Obj.channelNo}">
								<input type="hidden" id="payCode"  name = "payCode" value="${Obj.payCode}">
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label class="control-label col-md-2"><span style="color: red">*</span>渠道名称</label>
											<div class="col-md-4">
												<%-- <input type="hidden" class="form-control channelNo" value="${Obj.channelNo}"> --%>
													<c:if test="${Obj == null}">
													<select  id="channelName" class="form-control" name="channelName">
														<option value="" selected = "selected">----请选择----</option>
															<c:forEach var="channel" items="${channelBaseList}">
																<option value = "${channel.channelName}" channelNo="${channel.channelNo}">${channel.channelName} </option>
															</c:forEach>
													</select>
													</c:if>
													<c:if test="${Obj != null}">
													<select  id="channelName" class="form-control" name="channelName" disabled="disabled">
														<option value="" selected = "selected">----请选择----</option>
															<c:forEach var="channel" items="${channelBaseList}">
																<option value = "${channel.channelName}" <c:if test="${Obj.channelNo==channel.channelNo}">selected="selected"</c:if> channelNo="${channel.channelNo}">${channel.channelName}</option>
															</c:forEach>
													</select>
													</c:if>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label class="control-label col-md-2"><span style="color: red">*</span>支付通道
											</label>
											<div class="col-md-4">
												<select  id="payName" class="form-control" name="payName" <c:if test="${Obj != null}"> disabled="disabled" </c:if>>
														<option value="" selected = "selected">----请选择----</option>
															<c:forEach var="item" items="${mappingDicionList}">
																<c:if test="${Obj == null}">
																	<option value = "${item.payDesc}" payCode="${item.payCode}">${item.payDesc}</option>
																</c:if>
																<c:if test="${Obj != null}">
																	<option value = "${item.payDesc}" <c:if test="${item.payCode==Obj.payCode}">selected="selected"</c:if> payCode="${item.payCode}">${item.payDesc}</option>
																</c:if>
															</c:forEach>
													</select>
											</div>
										</div>
									</div>
									</div>
								
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label class="control-label col-md-2"><span style="color: red">*</span>T1交易费率</label>
											<div class="col-md-4">
												<input type="text" class="form-control ajaxCheck"
													id="t1Rate" name="t1Rate" value="<fmt:formatNumber value="${Obj.t1Rate}" pattern="#0.#####"/>"
													placeholder="T1交易费率">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label class="control-label col-md-2"><span style="color: red">*</span>T0垫资成本</label>
											<div class="col-md-4">
												<input type="text" class="form-control ajaxCheck"
													id="t0Rate" name="t0Rate" value="<fmt:formatNumber value="${Obj.t0Rate}" pattern="#0.#####"/>"
													placeholder="T0垫资成本">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label class="control-label col-md-2"><span style="color: red">*</span>提现手续费(元)</label>
											<div class="col-md-4">
												<input type="text" class="form-control ajaxCheck" id="rate"
													name="rate" value="<fmt:formatNumber value="${Obj.rate}" pattern="#0.00"/>" placeholder="提现手续费(元)" maxlength="7">
											</div>
										</div>
									</div>
								</div>								
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<label class="control-label col-md-2"><span style="color: red">*</span>清算手续费(元)</label>
											<div class="col-md-4">
												<input type="text" class="form-control ajaxCheck" id="rateAmount"
													name="rateAmount" value="<fmt:formatNumber value="${Obj.rateAmount}" pattern="#0.00"/>" placeholder="清算手续费(元)">
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-12">
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
<jsp:include page="../../include/footerjs.jsp"></jsp:include>
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


<script type="text/javascript">
	var baseurl = "${path}";
</script>
<script src="${path}/resources/scripts/admin/channel/channelpayway/edit.js?rnd=${version}" type="text/javascript"></script>
<script src="${path}/resources/scripts/jquery.validate.js" type="text/javascript"></script>
<script src="${path}/resources/scripts/ajaxfileupload.js" type="text/javascript"></script>
<script src="${path}/resources/scripts/common.js" type="text/javascript"></script>
<div style="display: none;" id="baseUrl">${path}</div>
</body>
<!-- END BODY -->
</html>