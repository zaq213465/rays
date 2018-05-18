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
<title>商户更新</title>
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
<%-- <jsp:include page="../include/head.jsp"></jsp:include> --%>
<!-- BEGIN CONTAINER -->
<div class="page-container">
<%-- <jsp:include page="../include/menu.jsp"></jsp:include> --%>
	<!-- BEGIN CONTENT -->
	<section id="ucenterSection">
			<%-- <div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="fa fa-home"></i>
						<a href="${path}/adminManage/index">首页</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="" onclick="javascript:history.go(-1);">商户管理</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<c:if test="${Obj == null}"><a href="#">商户新增 </a></c:if>
						<c:if test="${Obj != null}"><a href="#">商户更新</a></c:if>
					</li>
				</ul>
			</div> --%>
			<!-- END PAGE HEADER-->
			
			<!-- BEGIN SEARCH CONDITION -->
			<div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form action="save" class="form-horizontal" id="form" method="post">
						<div class="form-body">
							<input type="hidden" id="id"  name = "id" value="${Obj.id}">
							<input type="hidden" id="status"  name = "status" value="${Obj.status}">
							<c:if test="${channelNo != null}">
							<input type="hidden" id="channelNo"  name = "channelNo" value="${channelNo}">
							</c:if>
							<c:if test="${agentNo != null}">
							<input type="hidden" id="agentNo"  name = "agentNo" value="${agentNo}">
							</c:if>
							<input type="hidden" id="isT0"  name = "isT0" value="${Obj.isT0}">
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>渠道名称</label>
										<div class="col-md-4 col-sm-4">
											<input type="hidden" class="form-control channelNo" value="${channelNo}">
											<select id = "channelNo" class="form-control" name="channelNo" <c:if test="${channelNo != null}"> disabled="disabled" </c:if>>
												<option value = "">---   请选择   ---</option>
												<c:forEach var="obj" items="${channels}">
													<option value = "${obj.channelNo}" <c:if test = "${obj.channelNo == channelNo}">selected = "selected" </c:if>>${obj.channelName}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>代理商名称</label>
										<div class="col-md-4 col-sm-4">
											<input type="hidden" class="form-control agentNo" value="${agentNo}">
											<select id = "agentNo" class="form-control" name="agentNo" <c:if test="${agentNo != null}"> disabled="disabled" </c:if>>
												<option value = "">---   请选择   ---</option>
												<c:forEach var="obj" items="${agents}">													
													<option val ="${obj.channelNo}" value = "${obj.agentNo}" <c:if test = "${obj.agentNo == agentNo}">selected = "selected" </c:if> >${obj.agentName}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<c:if test="${Obj != null}">
									<div class="col-lg-5 col-sm-6">
										<div class="form-group">
											<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>商户编号</label>
											<div class="col-md-4 col-sm-4" style="margin-top: 7px;">
												${Obj.merchantNo}
												<input type="hidden" id="merchantNo"  name = "merchantNo" value="${Obj.merchantNo}">
											</div>
										</div>
									</div>
								</c:if>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>商户名称</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="merchantName"  name = "merchantName" value="${Obj.merchantName}" placeholder="商户名称">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>商户简称</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="shortName"  name = "shortName" value="${Obj.shortName}" placeholder="商户简称">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>商户模式</label>
										<div class="col-md-4 col-sm-4">
											<select  id="registerType" class="form-control" name="registerType" <c:if test="${not empty Obj.registerType}">disabled = "disabled"</c:if> >
												<option value="">----请选择----</option>
													<c:forEach var="item" items="${registerType}">
														<option value = "${item.value}" <c:if test = "${item.value == Obj.registerType}">selected = "selected"</c:if> >${item.desc}</option>
													</c:forEach>
											</select>
											<input type="hidden" class="form-control registerType" value="${Obj.registerType}">
										</div>
									</div>
								</div>
							</div>
							<div class="page-bar" style="margin-top: 20px;">
								<h3>资质信息</h3>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>经营类型</label>
										<div class="col-md-8 col-sm-8" style="margin-top: 7px;">
											<div id= "busTypeStr">${busTypeStr}</div>
											<input type="hidden" class="form-control" id="busType"  name = "busType" value="${merchantDetail.busType}" placeholder="经营类型">
											<table>
												<tr>
													<td>
														<select  id="categoryOne" class="form-control" name="categoryOne" >
															<option value="" selected = "selected">----请选择----</option>
																<c:forEach var="category" items="${categoryOne}">
																	<option value = "${category.id}" categoryNo = "${category.categoryNo}" >${category.name} </option>
																</c:forEach>
														</select>
													</td>
													<td>
														<select  id="categoryTwo" class="form-control" name="categoryTwo"  style="display:none; margin-left: 10px;" ></select>
													</td>
													
												</tr>
												<tr>
													<td>
														<select  id="categoryThree" class="form-control" name="categoryThree" style="display:none;"></select>
													</td>
													<td>
														
													</td>
												</tr>
											</table>
											<label style="color:red;display:none;" id="categoryError">经营类目数据异常！</label>
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>法人姓名</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="name"  name = "name" value="${merchantDetail.name}" <c:if test="${Obj != null}"> disabled="disabled" </c:if> placeholder="法人姓名">
										</div>
									</div>
								</div>
							</div>
							<div class=
							"row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>法人身份证号码</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="idCard"  name = "idCard" value="${merchantDetail.idCard}" <c:if test="${Obj != null}"> disabled="disabled" </c:if> placeholder="法人身份证号码">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>身份证正反面</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="file" name="file" id="idcardImg1_1" class="form-control fileInput" 
													onchange="submitForm('idcardImg1_1','idcardImg1','idcardImg1_2','idcardImg1')"/>
										</div>
										<div class="col-md-4 col-xs-4 col-sm-4" id="" style="margin-top: 7px;">
											<img id="idcardImg1_2" src="${merchantDetail.idcardImg1}" style="max-width: 100%;"/>
											<input type="hidden" val="hidden" title="身份证正反面" id="idcardImg1"  name = "idcardImg1" value="${merchantDetail.idcardImg1}">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>入网表正面</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="file" name="file" id="idcardImg2_1" class="form-control fileInput" 
													onchange="submitForm('idcardImg2_1','idcardImg2','idcardImg2_2','idcardImg2')"/>
										</div>
										<div class="col-md-4 col-xs-4 col-sm-4" id="" style="margin-top: 7px;">
											<img id="idcardImg2_2" src="${merchantDetail.idcardImg2}" style="max-width: 100%;"/>
											<input type="hidden" val="hidden" title="入网表正面" id="idcardImg2"  name = "idcardImg2" value="${merchantDetail.idcardImg2}">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>入网表反面</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="file" name="file" id="idcardImg3_1" class="form-control fileInput" 
													onchange="submitForm('idcardImg3_1','idcardImg3','idcardImg3_2','idcardImg3')"/>
										</div>
										<div class="col-md-4 col-xs-4 col-sm-4" id="" style="margin-top: 7px;">
											<img id="idcardImg3_2" src="${merchantDetail.idcardImg3}" style="max-width: 100%;"/>
											<input type="hidden" val="hidden" title="入网表反面" id="idcardImg3"  name = "idcardImg3" value="${merchantDetail.idcardImg3}">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>手机号码</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="mobile"  name = "mobile" value="${merchantDetail.mobile}" placeholder="手机号码">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>联系人姓名</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="contactName"  name = "contactName" value="${merchantDetail.contactName}" placeholder="联系人姓名">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>联系电话</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="phone"  name = "phone" value="${merchantDetail.phone}" placeholder="联系电话">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">邮箱</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="email"  name = "email" value="${merchantDetail.email}" placeholder="邮箱">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>地址</label>
										<div class="col-md-6 col-sm-4">
											<input type="text" class="form-control" id="address"  name = "address" value="${merchantDetail.address}" placeholder="地址">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>商户营业执照号</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="merchantLicense"  name = "merchantLicense" value="${merchantDetail.merchantLicense}" placeholder="商户营业执照号">
										</div>
									</div>
								</div>
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
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>商户性质</label>
										<div class="col-md-4 col-sm-4">
											<select  id="merchantNature" class="form-control" name="merchantNature" >
												<option value="">----请选择----</option>
													<c:forEach var="item" items="${merchantNature}">
														<option value = "${item.value}" <c:if test = "${item.value == merchantDetail.merchantNature}">selected = "selected"</c:if>  >${item.desc}</option>
													</c:forEach>
											</select>
											<input type="hidden" class="form-control merchantNature" value="${merchantDetail.merchantNature}">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">经营年限</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="text" class="form-control" id="openYear"  name = "openYear" value="${merchantDetail.openYear}" placeholder="经营年限">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">合同编号</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="text" class="form-control" id="contractNo"  name = "contractNo" value="${merchantDetail.contractNo}" placeholder="合同编号">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">执照开始时间</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control date-picker" id="businessStartDate"  name = "businessStartDate" value="${merchantDetail.businessStartDate}" placeholder="执照开始时间">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">执照结束时间</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="text" class="form-control date-picker" id="businessEndDate"  name = "businessEndDate" value="${merchantDetail.businessEndDate}" placeholder="执照结束时间">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">税务登记证号码</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="taxNo"  name = "taxNo" value="${merchantDetail.taxNo}" placeholder="税务登记证号码">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">开户许可证/银行卡正反面</label>
										<div class="col-md-4 col-xs-4 col-sm-4">
											<input type="file" name="file" id="taxImg_1" class="form-control fileInput" 
													onchange="submitForm('taxImg_1','taxImg','taxImg_2','taxImg')"/>
										</div>
										<div class="col-md-4 col-xs-4 col-sm-4" id="" style="margin-top: 7px;">
											<img id="taxImg_2" src="${merchantDetail.taxImg}" style="max-width: 100%;"/>
											<input type="hidden" id="taxImg"  name = "taxImg" value="${merchantDetail.taxImg}" title="开户许可证/银行卡正反面">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">组织机构代码</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="orgNo"  name = "orgNo" value="${merchantDetail.orgNo}" placeholder="组织机构代码">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">主营业务</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="mainBusiness"  name = "mainBusiness" value="${merchantDetail.mainBusiness}" placeholder="主营业务">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>经营范围</label>
										<div class="col-md-4 col-sm-4">
											<select  id="businessRange" class="form-control" name="businessRange" >
												<option value="" selected = "selected">----请选择----</option>
													<c:forEach var="businessRange" items="${businessRanges}">
														<option value = "${businessRange.businessRangeCode}" <c:if test = "${businessRange.businessRangeCode == merchantDetail.businessRange}">selected = "selected"</c:if> >${businessRange.businessRange} </option>
													</c:forEach>
											</select>
											<input type="hidden" class="form-control businessRange" value="${merchantDetail.businessRange}">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">注册地址</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="registerAddr"  name = "registerAddr" value="${merchantDetail.registerAddr}" placeholder="注册地址">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>地区</label>
										<div class="col-md-3">
											<select class="form-control" id="province" name="province">
												<option value = "">  --  请选择  --  </option>
												<c:forEach var="item" items="${provinceList}">
													<option value = "${item.pid}" <c:if test = "${item.pid == province.pid}">selected = "selected"</c:if>>${item.pname}</option>
												</c:forEach>
									        </select>
									        <input type="hidden" class="form-control province" value="${province.pid}">
										</div>
										<div class="col-md-3">
											<select class="form-control" id="city" name="city">
												<option value = "">  --  请选择  --  </option>
												<c:forEach var="item" items="${cityList}">
													<option value = "${item.cid}" <c:if test = "${item.cid == city.cid}">selected = "selected"</c:if>>${item.cname}</option>
												</c:forEach>
									        </select>
									        <input type="hidden" class="form-control city" value="${city.cid}">
										</div>
										<input type="hidden" id="merchantArea"  name = "merchantArea" value="${merchantDetail.merchantArea}">
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">备注</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="remark"  name = "remark" value="${Obj.remark}" placeholder="备注">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4">秘钥</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="temp3"  name = "temp3" value="${Obj.temp3}" placeholder="秘钥">
										</div>
									</div>
								</div>
							</div>
							<c:if test="${Obj == null}">
							<div class="page-bar" style="margin-top: 20px;">
								<h3>门店信息</h3>
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>门店名称</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="storeName"  name = "storeName" value="${Obj.storeName}" placeholder="门店名称">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-4"><span style="color: red">*</span>服务电话</label>
										<div class="col-md-4 col-sm-4">
											<input type="text" class="form-control" id="servicePhone"  name = "servicePhone" value="${Obj.servicePhone}" placeholder="服务电话">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3">门店地址</label>
										<div class="col-md-6">
											<input type="text" class="form-control" id="storeAddress"  name = "storeAddress" value="${Obj.storeAddress}" placeholder="门店地址">
										</div>
									</div>
								</div>
							</div>
							
							<div class="page-bar" style="margin-top: 20px;">
								<h3>银行账户信息</h3>
							</div>
							
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3"><span style="color: red">*</span>账户类型
										</label>
										<div class="col-md-4">
											<select  id="accountType" class="form-control" name="accountType">													
													<option value = "0">个人</option>
													<option value = "1">公司 </option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3"><span style="color: red">*</span>银行卡号码</label>
										<div class="col-md-4">
											<input type="text" class="form-control"
												id="bankCard" name="bankCard" 
												placeholder="银行卡号码">
										</div>
									</div>
								</div>								
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3"><span style="color: red">*</span>联行号</label>
										<div class="col-md-4">
											<input type="text" class="form-control" readonly="readonly"
												id="bankCode" name="bankCode" 
												placeholder="联行号 ">
										</div>
									</div>
								</div>								
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3"><span style="color: red">*</span>开户行名称</label>
										<div class="col-md-4">
											<input type="text" class="form-control" readonly="readonly"
												id="bankName" name="bankName"
												placeholder="开户行名称">
										</div>
									</div>
								</div>
								
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3"><span style="color: red">*</span>身份证号码</label>
										<div class="col-md-4">
											<input type="text" class="form-control"
												id="myIdCard" name="myIdCard" readonly="readonly"
												placeholder="身份证号码">
										</div>
									</div>
								</div>
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3"><span style="color: red">*</span>账户名称</label>
										<div class="col-md-4">
											<input type="text" class="form-control" id="myName" readonly="readonly"
												name="myName" placeholder="账户名称">
										</div>
									</div>
								</div>
								
							</div>
							<div class="row">
								<div class="col-lg-5 col-sm-6">
									<div class="form-group">
										<label class="control-label col-md-3"><span style="color: red">*</span>手机号码</label>
										<div class="col-md-4">
											<input type="text" class="form-control"
												id="myMobile" name="myMobile" "
												placeholder="手机号码">
										</div>
									</div>
								</div>
							</div>
							</c:if>
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