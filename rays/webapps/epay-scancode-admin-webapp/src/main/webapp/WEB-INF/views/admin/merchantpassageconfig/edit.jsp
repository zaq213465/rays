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
<title>商户通道信息</title>
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
										<label class="control-label col-md-2">通道编号</label>
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
												<label class="control-label col-md-2">渠道编号</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="channelNo"  name = "channelNo"  value="${Obj.channelNo }" placeholder="渠道编号" readonly="readonly">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">代理商编号</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="agentNo"  name = "agentNo"  value="${Obj.agentNo }" placeholder="代理商编号" readonly="readonly">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">代理机构</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="agency"  name = "agency"  value="${Obj.agency }" placeholder="代理机构" readonly="readonly">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">商户编号</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="merchantNo"  name = "merchantNo"  value="${Obj.merchantNo }" placeholder="商户编号" readonly="readonly">
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">支付通道编号</label>
												<div class="col-md-4">
													<c:if test="${Obj == null}">
													<select  id="payCode" class="form-control" name="payCode">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "zfb">支付宝</option>
															<option value = "wechat">微信</option>
<!-- 															<option value = "qqqb">qq钱包</option> -->
													</select>
													</c:if>
													<c:if test="${Obj != null}">
													<select  id="payCode" class="form-control" name="payCode">
														<option  selected = "selected" value="">----请选择----</option>
															<option value = "zfb" <c:if test="${Obj.payCode=='zfb'}">selected="selected"</c:if>>支付宝</option>
															<option value = "wechat" <c:if test="${Obj.payCode=='wechat'}">selected="selected"</c:if>>微信</option>
<%-- 															<option value = "qqqb" <c:if test="${Obj.payCode=='qqqb'}">selected="selected"</c:if>>qq钱包</option> --%>
													</select>
													</c:if>
												</div>
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label class="control-label col-md-2">银行商户编号</label>
												<div class="col-md-4">
													<input type="text" class="form-control" id="pwayMerchantNo"  name = "pwayMerchantNo"  value="${Obj.pwayMerchantNo }" placeholder="支付通道商户编号">
												</div>
											</div>
										</div>
									</div>
									
									
<!-- 									<div class="row"> -->
<!-- 										<div class="col-md-12"> -->
<!-- 											<div class="form-group"> -->
<!-- 												<label class="control-label col-md-2">通道状态</label> -->
<!-- 												<div class="col-md-4"> -->
<%-- 													<c:if test="${Obj == null}"> --%>
<!-- 													<select  id="passageStatus" class="form-control" name="passageStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<!-- 															<option value = "Y">生效中</option> -->
<!-- 															<option value = "N">未生效</option> -->
<!-- 													</select> -->
<%-- 													</c:if> --%>
<%-- 													<c:if test="${Obj != null}"> --%>
<!-- 													<select  id="passageStatus" class="form-control" name="passageStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<%-- 															<option value = "Y" <c:if test="${Obj.passageStatus=='Y'}">selected="selected"</c:if>>生效中</option> --%>
<%-- 															<option value = "N" <c:if test="${Obj.passageStatus=='N'}">selected="selected"</c:if>>未生效</option> --%>
<!-- 													</select> -->
<%-- 													</c:if> --%>
<!-- 												</div> -->
<!-- 											</div> -->
<!-- 										</div> -->
<!-- 									</div> -->
									
<!-- 									<div class="row"> -->
<!-- 										<div class="col-md-12"> -->
<!-- 											<div class="form-group"> -->
<!-- 												<label class="control-label col-md-2">记录状态</label> -->
<!-- 												<div class="col-md-4"> -->
<%-- 													<c:if test="${Obj == null}"> --%>
<!-- 													<select  id="recordStatus" class="form-control" name="recordStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<!-- 															<option value = "Y">正常</option> -->
<!-- 															<option value = "N">关闭</option> -->
<!-- 													</select> -->
<%-- 													</c:if> --%>
<%-- 													<c:if test="${Obj != null}"> --%>
<!-- 													<select  id="recordStatus" class="form-control" name="recordStatus"> -->
<!-- 														<option  selected = "selected" value="">----请选择----</option> -->
<%-- 															<option value = "Y" <c:if test="${Obj.recordStatus=='Y'}">selected="selected"</c:if>>正常</option> --%>
<%-- 															<option value = "N" <c:if test="${Obj.recordStatus=='N'}">selected="selected"</c:if>>关闭</option> --%>
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

<script src="${path}/resources/scripts/admin/merchantpassageconfig/edit.js?rnd=${version}" type="text/javascript"></script>
<script src="${path}/resources/scripts/jquery.validate.js" type="text/javascript"></script>
<div style="display: none;" id="baseUrl">${path}</div>
</body>
<!-- END BODY -->
</html>