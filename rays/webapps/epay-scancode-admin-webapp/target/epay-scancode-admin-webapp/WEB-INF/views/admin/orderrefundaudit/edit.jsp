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
<title>退款申请</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN PAGE LEVEL STYLES -->
<jsp:include page="../include/commoncss.jsp"></jsp:include>
<link rel="shortcut icon" href="${currentChannelInfo.icon }"/>
<link rel="stylesheet" type="text/css" href="${path}/resources/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css"/>
<style type="text/css">
.hiddenRow{
	display: none;
}
</style>
</head>
<body class="page-header-fixed page-quick-sidebar-over-content">
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN CONTENT -->
	<section id="ucenterSection">
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN SEARCH CONDITION -->
			<div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form action="save" class="form-horizontal" id="form" method="post">
						<div class="form-body">
						     <div class="row">
								<div class="col-lg-5 col-sm-6">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-4">交易订单编号</label>
											<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
												${item.tradeNo}
											</div>
										</div>
								</div>
								<div class="col-lg-5 col-sm-6">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-4">商户编号</label>
											<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
												${item.merchantNo}
											</div>
										</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-4">支付通道</label>
											<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
												${item.payCode}
											</div>
										</div>
								</div>
								<div class="col-lg-5 col-sm-6">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-4">订单金额</label>
											<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
												<fmt:formatNumber pattern="#0.00">${item.orderAmt}</fmt:formatNumber>
											</div>
										</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-4">商品名称</label>
											<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
												${item.productName}
											</div>
										</div>
								</div>
								<div class="col-lg-5 col-sm-6">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-4">支付方式</label>
											<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
												<c:if test="${item.paymentType=='00'}">
													帐务支付
												</c:if>
												<c:if test="${item.paymentType=='01' }">
													网关支付
												</c:if>	
												<c:if test="${item.paymentType=='02' }">
													快捷支付
												</c:if>
												<c:if test="${item.paymentType=='03' }">
													扫码支付
												</c:if>
											</div>
										</div>
								</div>
								<div class="row">
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">支付账号id</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
													${item.buyerId}
												</div>
											</div>
									</div>
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">支付账号</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
													${item.buyerAccount}
												</div>
											</div>
								 	</div>
						    	</div>
						    	<div class="row">
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">支付通道流水号</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
													${item.payTradeNo}
												</div>
											</div>
									</div>
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">交易结束时间</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
													${item.endTime}
												</div>
											</div>
								 	</div>
						    	</div>
						    	<div class="row">
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">退款状态</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
														<c:if test="${item.refundStatus=='Y'}">
															已退款
														</c:if>
														<c:if test="${item.refundStatus=='N' }">
															未退款
														</c:if>	
												</div>
											</div>
									</div>
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">订单状态</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
													<c:if test="${item.orderStatus=='00'}">
														订单创建
													</c:if>
													<c:if test="${item.orderStatus=='01' }">
														支付中
													</c:if>	
													<c:if test="${item.orderStatus=='02' }">
														交易成功
													</c:if>	
													<c:if test="${item.orderStatus=='03' }">
														交易失败
													</c:if>	
												</div>
											</div>
								 	</div>
						    	</div>
						    	<div class="row">
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">收银员</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
													${item.cashierName}
												</div>
											</div>
									</div>
									<div class="col-lg-5 col-sm-6">
											<div class="form-group">
												<label class="control-label col-md-3 col-sm-4">操作人</label>
												<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
													${item.operator}
												</div>
											</div>
								 	</div>
						    	</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">营业执照图片</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="file" name="file" id="merchantLicenseImg_1" class="form-control fileInput" 
													onchange="submitForm('merchantLicenseImg_1','merchantLicenseImg','merchantLicenseImg_2','merchantLicenseImg')"/>
										</div>
										<div class="col-md-4 col-xs-4 col-sm-4" id="" style="margin-top: 7px;">
											<img id="merchantLicenseImg_2" src="${merchantDetail.merchantLicenseImg}" style="max-width: 100%;"/>
											<input type="hidden" title="营业执照图片"  id="merchantLicenseImg"  name = "merchantLicenseImg" value="${merchantDetail.merchantLicenseImg}">
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
<jsp:include page="../include/footerjs.jsp"></jsp:include>
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

<script src="${path}/resources/scripts/admin/merchantinfo/edit.js?rnd=${version}" type="text/javascript"></script>
<script src="${path}/resources/scripts/jquery.validate.js" type="text/javascript"></script>
<script type="text/javascript">
	var baseurl = "${path}";
</script>
<script src="${path}/resources/scripts/ajaxfileupload.js" type="text/javascript"></script>
<script src="${path}/resources/scripts/common.js" type="text/javascript"></script>
<script type="text/javascript" src="${path}/resources/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="${path}/resources/assets/global/plugins/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min.js" charset="UTF-8"></script>
<div style="display: none;" id="baseUrl">${path}</div>
</body>
<!-- END BODY -->
</html>