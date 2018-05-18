<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">

	<tr>
		<td class="col-md-2 td0">渠道编号</td><td>${item.channelNo}</td>
		<td class="col-md-2 td0">渠道名称</td><td class="col-md-4 parent_id_parse" title="channelName">${item.channelName}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">代理商编号</td><td>${item.agentNo}</td>
		<td class="col-md-2 td0">代理商名称</td><td class="col-md-4 parent_id_parse" title="agentName">${item.agentName}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">商户编号</td><td>${item.merchantNo}</td>
		<td class="col-md-2 td0">商户简称</td><td class="col-md-4 parent_id_parse" title="shortName" >${item.shortName}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">商户名称</td><td class="col-md-4 parent_id_parse" title="merchantName" colspan="3">${item.merchantName}</td>
	</tr>

	<tr>
		<td class="col-md-2 td0">法人姓名</td><td class="col-md-4 parent_id_parse" title="name">${merchantDetail.name}</td>
		<td class="col-md-2 td0">法人身份证号码</td><td class="col-md-4 parent_id_parse" title="idCard">${merchantDetail.idCard}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">身份证正反面
		<c:if test="${not empty merchantDetail.idcardImg1}">
			<br><br><a style="cursor:pointer;" class="refreshImg" attr="/${item.merchantNo}/idcardImg1">刷新图片</a>
		</c:if>
		</td>
		<td class="col-md-4 parent_id_parse" title="idcardImg1">
		<c:if test="${not empty merchantDetail.idcardImg1}">
		<div class="small_pic">
			<a href="#pic_idcardImg1">
				<img style="max-width: 150px; max-height: 150px;" src="${merchantDetail.idcardImg1}">
				<div id="pic_idcardImg1" style="display:none;"><img style="max-width: 800px; max-height: 600px;" src="${merchantDetail.idcardImg1}"></div>
			</a>
		</div>
		
		</c:if>
		</td>
		<td class="col-md-2 td0">入网表正面
		<c:if test="${not empty merchantDetail.idcardImg2}">	
			<br><br><a style="cursor:pointer;" class="refreshImg" attr="/${item.merchantNo}/idcardImg2">刷新图片</a>
		</c:if>
		</td>
		<td class="col-md-4 parent_id_parse" title="idcardImg2">
		<c:if test="${not empty merchantDetail.idcardImg2}">		
		<div class="small_pic">
			<a href="#pic_idcardImg2">
				<img style="max-width: 150px; max-height: 150px;" src="${merchantDetail.idcardImg2}">
				<div id="pic_idcardImg2" style="display:none;"><img style="max-width: 800px; max-height: 600px;" src="${merchantDetail.idcardImg2}"></div>
			</a>
		</div>
		</c:if>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">入网表反面
		<c:if test="${not empty merchantDetail.idcardImg3}">	
			<br><br><a style="cursor:pointer;" class="refreshImg" attr="/${item.merchantNo}/idcardImg3">刷新图片</a>
		</c:if>
		</td>
		<td class="col-md-4 parent_id_parse" title="idcardImg3">
		<c:if test="${not empty merchantDetail.idcardImg3}">		
		<div class="small_pic">
			<a href="#pic_idcardImg3">
				<img style="max-width: 150px; max-height: 150px;" src="${merchantDetail.idcardImg3}">
				<div id="pic_idcardImg3" style="display:none;"><img style="max-width: 800px; max-height: 600px;" src="${merchantDetail.idcardImg3}"></div>
			</a>
		</div>
		</c:if>
		</td>
		<td class="col-md-2 td0">营业执照图片
		<c:if test="${not empty merchantDetail.merchantLicenseImg}">	
		<br><br><a style="cursor:pointer;" class="refreshImg" attr="/${item.merchantNo}/merchantLicenseImg">刷新图片</a>
		</c:if>
		</td>
		<td class="col-md-4 parent_id_parse" title="merchantLicenseImg">
		<c:if test="${not empty merchantDetail.merchantLicenseImg}">		
		<div class="small_pic">
			<a href="#pic_merchantLicenseImg">
				<img style="max-width: 150px; max-height: 150px;" src="${merchantDetail.merchantLicenseImg}">
				<div id="pic_merchantLicenseImg" style="display:none;"><img style="max-width: 800px; max-height: 600px;" src="${merchantDetail.merchantLicenseImg}"></div>
			</a>
		</div>
		</c:if>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">联系电话</td><td class="col-md-4 parent_id_parse" title="phone">${merchantDetail.phone}</td>
		<td class="col-md-2 td0">邮箱</td><td class="col-md-4 parent_id_parse" title="email">${merchantDetail.email}</td>
	</tr>
	
	<tr>
		<td class="col-md-2 td0">商户营业执照号</td><td class="col-md-4 parent_id_parse" title="merchantLicense">${merchantDetail.merchantLicense}</td>
		<td class="col-md-2 td0">手机号码</td><td class="col-md-4 parent_id_parse" title="mobile">${merchantDetail.mobile}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">税务登记证号码</td><td class="col-md-4 parent_id_parse" title="taxNo">${merchantDetail.taxNo}</td>
		<td class="col-md-2 td0">组织机构代码</td><td class="col-md-4 parent_id_parse" title="orgNo">${merchantDetail.orgNo}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">开户许可证/银行卡正反面</td><td class="col-md-4 parent_id_parse" title="taxImg">
		<c:if test="${not empty merchantDetail.taxImg}">
		<div class="small_pic">
			<a href="#pic_taxImg">
				<img style="max-width: 150px; max-height: 150px;" src="${merchantDetail.taxImg}">
				<div id="pic_taxImg" style="display:none;"><img style="max-width: 800px; max-height: 600px;" src="${merchantDetail.taxImg}"></div>
			</a>
		</div>
		</c:if>
		</td>
		<td class="col-md-2 td0">二维码编号</td><td class="col-md-4 parent_id_parse" title="qrCode">${item.qrCode}</td>
	</tr>
	
	<tr>
		<td class="col-md-2 td0">联系人姓名</td><td class="col-md-4 parent_id_parse" title="merchantLicense">${merchantDetail.contactName}</td>
		<td class="col-md-2 td0">经营年限</td><td class="col-md-4 parent_id_parse" title="openYear">${merchantDetail.openYear}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">合同编号</td><td class="col-md-4 parent_id_parse" title="contractNo">${merchantDetail.contractNo}</td>
		<td class="col-md-2 td0">执照开始时间</td><td class="col-md-4 parent_id_parse" title="businessStartDate">${merchantDetail.businessStartDate}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">执照结束时间</td><td class="col-md-4 parent_id_parse" title="businessEndDate">${merchantDetail.businessEndDate}</td>
		<td class="col-md-2 td0">组织机构代码</td><td class="col-md-4 parent_id_parse" title="orgNo">${merchantDetail.orgNo}</td>
	</tr>
	
	<tr>
		<td class="col-md-2 td0">注册地址</td><td class="col-md-4 parent_id_parse" title="registerAddr">${merchantDetail.registerAddr}</td>
		<td class="col-md-2 td0">主营业务</td><td class="col-md-4 parent_id_parse" title="mainBusiness">${merchantDetail.mainBusiness}</td>
	</tr>
	
	<tr>
		<td class="col-md-2 td0">实名认证</td><td class="col-md-4 parent_id_parse" title="authenStatus">${item.authenStatus}</td>
		<td class="col-md-2 td0">商户状态</td><td class="col-md-4 parent_id_parse" title="status">${item.status}</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">入网时间</td><td class="col-md-4 date_time_parse" title="createTime">${item.createTime}</td>
		<td class="col-md-2 td0">修改时间</td><td class="col-md-4 date_time_parse" title="updateTime">${item.updateTime}</td>
	</tr>
	<c:if test="${not empty item.qrCode }">
		<tr>
			<td class="col-md-2 td0">门店编号</td><td id="storeNoValue">${store.storeNo}</td>
			<td class="col-md-2 td0">门店名称</td><td>${store.storeName}</td>
		</tr>
	</c:if>
	<tr>
		<c:if test="${pageType==1}">
		<td class="col-md-2 td0">是否支持T0</td><td class="col-md-4 parent_id_parse" title="isT0">
			<c:if test="${item.isT0=='Y'}">
			支持
			</c:if>
			<c:if test="${item.isT0=='N'}">
			不支持
			</c:if>
		</td>
		</c:if>
		<c:if test="${pageType==2}">
		<td class="col-md-2 td0">是否支持T0</td><td class="col-md-4 parent_id_parse" >
		<div class="col-md-10 col-sm-8">
		<select id = "isT0" class="form-control" name="isT0">
			<option value = "N" <c:if test="${item.isT0=='N'}"> selected = "selected" </c:if>>不支持</option>
			<option value = "Y" <c:if test="${item.isT0=='Y'}"> selected = "selected" </c:if>>支持</option>
		</select>
		</div>
		</td>
		</c:if>
		
		<td class="col-md-2 td0">商户模式</td>
		<c:if test = "${pageType == 1}">
				<td class="col-md-4 parent_id_parse" title="registerType">${item.registerType}</td>
		</c:if>
		<c:if test = "${pageType == 2}">
			<td class="col-md-4">
					<div class="col-md-10 col-sm-4">
							<select  id="register" class="form-control" name="register" >
								<option value="">----请选择----</option>
									<c:forEach var="regType" items="${registerType}">
										<option value = "${regType.value}">${regType.desc}</option>
									</c:forEach>
							</select>
							<input type="hidden" class="form-control register" value="${item.registerType}">
					</div>
			</td>
		</c:if>
	</tr>
	<tr>
		<td class="col-md-2 td0">商户性质</td>
		<td class="col-md-4">
				<c:if test="${pageType == 1}">
						<c:if test="${merchantDetail.merchantNature == '0'}"> 国有企业</c:if>
						<c:if test="${merchantDetail.merchantNature == '1'}"> 三资企业</c:if>
						<c:if test="${merchantDetail.merchantNature == '2'}"> 私营企业</c:if>
						<c:if test="${merchantDetail.merchantNature == '3'}"> 集体企业</c:if>
						<input type="hidden" id="merchantNature"  name = "merchantNature" value="${merchantDetail.merchantNature}">
				</c:if>
				<c:if test="${pageType == 2}">
				<div class="col-md-10 col-sm-4">
						<select  id="merchantNature" class="form-control" name="merchantNature" >
							<option value="">----请选择----</option>
								<c:forEach var="merNature" items="${merchantNature}">
									<option value = "${merNature.value}">${merNature.desc}</option>
								</c:forEach>
						</select>
						<input type="hidden" class="form-control merchantNature" value="${merchantDetail.merchantNature}">
				</div>
				</c:if>
		</td>
		<td class="col-md-2 td0">经营范围</td>
		<td class="col-md-4">
			<c:if test="${pageType == 1}">
					${businessRangeStr}
			</c:if>
			<c:if test = "${pageType == 2}">
				<div class="col-md-10 col-sm-4">
					<select  id="businessRange" class="form-control" name="businessRange" >
						<option value="" selected = "selected">----请选择----</option>
							<c:forEach var="br" items="${businessRanges}">
								<option value = "${br.businessRangeCode}">${br.businessRange} </option>
							</c:forEach>
					</select>
					<input type="hidden" class="form-control businessRange" value="${merchantDetail.businessRange}">
				</div>
			</c:if>		
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">经营类型</td>
		<td class="col-md-4"title="busType" colspan="3">
		<input type="hidden" id="categoryNo"  name = "categoryNo" value="${merchantDetail.busType}">
		<c:if test="${pageType==1}">
		${busTypeStr}
		</c:if>
		<c:if test="${pageType==2}">
		<div class="col-md-12" id = "busTypeStr">${busTypeStr}</div>
		<div class="col-md-4">
			<select  id="categoryOne" class="form-control" name="categoryOne" >
				<option value="" selected = "selected">----请选择----</option>
					<c:forEach var="category" items="${categoryOne}">
						<option value = "${category.id}" categoryNo = "${category.categoryNo}">${category.name} </option>
					</c:forEach>
			</select>
		</div>
		<div class="col-md-4">
			<select  id="categoryTwo" class="form-control" name="categoryTwo" style="display:none;" ></select>
		</div>
		<div class="col-md-4">
			<select  id="categoryThree" class="form-control" name="categoryThree" style="display:none;"></select>
		</div>
		
		<label style="color:red;display:none;" id="categoryError">经营类目数据异常！</label>
		</c:if>
		
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">地区</td>
		<td class="col-md-4 parent_id_parse" title="merchantArea" colspan="3">
			<c:if test = "${pageType == 1}">
				${areaName}
			</c:if>
			<c:if test = "${pageType == 2}">
				<div class="col-md-4">
					<select class="form-control" id="province" name="province">
						<option value = "">  --  请选择  --  </option>
						<c:forEach var="pvc" items="${provinceList}">
							<option value = "${pvc.pid}">${pvc.pname}</option>
						</c:forEach>
			        </select>
			        <input type="hidden" class="form-control province" value="${province.pid}">
				</div>
				<div class="col-md-4">
					<select class="form-control" id="city" name="city">
						<option value = "">  --  请选择  --  </option>
						<c:forEach var="ct" items="${cityList}">
							<option value = "${ct.cid}">${ct.cname}</option>
						</c:forEach>
			        </select>
			        <input type="hidden" class="form-control city" value="${city.cid}">
				</div>
				<input type="hidden" id="merchantArea"  name = "merchantArea" value="${merchantDetail.merchantArea}">
			</c:if>
		</td>
	</tr>
	<tr>
		<td class="col-md-2 td0">地址</td>
		<td>
			<c:if test="${pageType==1}">
				<label id="addressLabel"  name = "addressLabel">${merchantDetail.address}</label>
			</c:if>
			<c:if test="${pageType==2}">
				<input type="text" class="form-control" id="address"  name = "address" value="${merchantDetail.address}" placeholder="地址">
			</c:if>
			
		</td>
		<td class="col-md-2 td0">操作人</td><td class="col-md-4 parent_id_parse" title="operator">${item.operator}</td>
	</tr>
	
	<tr>
		<td class="col-md-2 td0">商户APPID</td>
		<td>
			<c:if test="${pageType==1}">
				<label id="temp2"  name = "temp2" >${item.temp2}</label>
			</c:if>
			<c:if test="${pageType==2 && item.registerType != '2'}">
				<input type="text" class="form-control" id="temp2"  name = "temp2" value="${item.temp2}" placeholder="商户APPID" readonly="readonly">
			</c:if>
			<c:if test="${pageType==2 && item.registerType == '2'}">
				<input type="text" class="form-control" id="temp2"  name = "temp2" value="${item.temp2}" placeholder="商户APPID">
			</c:if>
		</td>	
		<td class="col-md-2 td0">秘钥</td>
		<td>
			<c:if test="${pageType==1}">
				<label id="temp3"  name = "temp3" >${item.temp3}</label>
			</c:if>
			<c:if test="${pageType==2 && item.registerType != '2'}">
				<input type="text" class="form-control" id="temp3"  name = "temp3" value="${item.temp3}" placeholder="秘钥" readonly="readonly">
			</c:if>
			<c:if test="${pageType==2 && item.registerType == '2'}">
				<input type="text" class="form-control" id="temp3"  name = "temp3" value="${item.temp3}" placeholder="秘钥">
			</c:if>
		</td>		
	</tr>
	
	<c:if test="${pageType==1}">
	<tr>
		<td class="col-md-2 td0">备注</td><td class="col-md-4 parent_id_parse">${item.remark}</td>
		<td class="col-md-2 td0">支付授权目录</td><td class="col-md-4 parent_id_parse">${item.jsapiPath}</td>		
	</tr>
	<tr>
		<td class="col-md-2 td0">子商户SubAPPID</td><td class="col-md-4 parent_id_parse">${item.subAppid}</td>
		<td class="col-md-2 td0">子商户推荐关注公众账号APPID</td><td class="col-md-4 parent_id_parse">${item.subscribeAppid}</td>		
	</tr>
	<tr>
	    <c:forEach var="pwayMerchantNo" items="${pwayMerchantNos}">
			<td class="col-md-2 td0">银行商户编号</td><td class="col-md-4 parent_id_parse">${pwayMerchantNo.pwayMerchantNo}</td>
		</c:forEach>
	</tr>
	</c:if>
	
</table>
<script type="text/javascript">
dataOpr();
$('div.small_pic a').fancyZoom({scaleImg: true, closeOnClick: true});
function setCategory(obj,level){
	var baseUrl = $("#baseUrl").text().trim();
	var categoryNo = $(obj).find("option:selected").attr("categoryNo");	
	var categoryName = $(obj).find("option:selected").text();
	var busTypeStr = categoryName + '(' + categoryNo + ')';
	if(categoryNo == "null" || categoryNo == ''){
		var id = $(obj).val();
		$.ajax({
			url:baseUrl+"/adminManage/passageCategoryCmbc/list",
			data:{"parentId":id,"level":level},
			type:"POST",
			success:function(data)
			{
				var json = JSON.parse(data); 
				var objList = json.objList;
				var item = "<option  value='' selected = 'selected'>----请选择----</option>"
				for(var i in objList){ 
					var option = "<option value='" + objList[i].id + "' categoryNo = '" + objList[i].categoryNo + "'>" + objList[i].name + "</option>"
					if(level == 2){
						if(i==0){
							$("#categoryTwo").css("display","block");
							$("#categoryTwo").empty();
							$("#categoryTwo").append(item); 
						}
						$("#categoryTwo").append(option); 
					}else if(level == 3){
						if(i==0){
							$("#categoryThree").css("display","block");
							$("#categoryThree").empty();
							$("#categoryThree").append(item); 
						}
						$("#categoryThree").append(option); 
					}
					
				}
				if(objList.length == 0){
					$('#categoryError').css("display","block");
					if(level == 2){
						$("#categoryTwo").empty();
					}else if(level == 3){
						$("#categoryThree").empty();
					}
				}else{
					$('#categoryError').css("display","none");
				}
			}
		});
	}else{
		$("#categoryNo").val(categoryNo);
		$("#busTypeStr").text(busTypeStr);
		if(level == 2){
			$("#categoryTwo").css("display","none");
			$("#categoryThree").css("display","none");
		}else if(level == 3){
			$("#categoryThree").css("display","none");
		}
	}
}
$("#categoryOne").change(function(){
	setCategory(this,2);
});
$("#categoryTwo").change(function(){
	setCategory(this,3);
});
$("#categoryThree").change(function(){
	var categoryNo = $(this).find("option:selected").attr("categoryNo");	
	var categoryName = $(this).find("option:selected").text();
	var busTypeStr = categoryName + '(' + categoryNo + ')';
	if(categoryNo == null || categoryNo == ''){
		$('#categoryError').css("display","block");
	}else{
		$("#categoryNo").val(categoryNo);
		$("#busTypeStr").text(busTypeStr);
	}
});

$(".refreshImg").click(function(){
	var tail = $(this).attr("attr");//图片的刷新路径
	var baseUrl = $("#baseUrl").text().trim();
	var title = tail.split("/")[2]
	var imgs = $('td[title="'+title+'"]').find('img');
	$.ajax({
		url:baseUrl+"/adminManage/merchantinfo/freshImg/"+tail,
		type:"POST",
		dataType:'json'
		})
		.done(function(msg){
			if(msg.executeStatus=='0'){
				var img =msg.img;
				$.each(imgs,function(i,item){
					$(item).attr('src',img)
				});
			}
		}).error(function(msg){
			console.log(msg);
		});
});

$(function(){
	$("#province").change(function(t){
		var pid = $("#province").val();
		var baseUrl = $("#baseUrl").text().trim();
		$("#city").empty();
		
		if(pid != ''){
			$.ajax({
				url:baseUrl + "/adminManage/merchantinfo/getcityareacode",
				data:{"pid":pid},
				async: false,
				type:"POST",
				success:function(data)
				{
					var data = JSON.parse(data);
					var cityList = data.cityList;
					if(cityList.length != 1){
						$("#city").append("<option value=''>  --  请选择  --  </option>"); 
					}else{
						$("#merchantArea").val(cityList[0].areacode);
					}
					var option="";
					for(var i in cityList){
						option += "<option value='" + cityList[i].areacode + "'>" + cityList[i].cname + "</option>";						
					}
					$("#city").append(option); 
				}
			});
			
		}		
	});
	
	$("#city").change(function(t){
		var areacode = $("#city").val();
		if(areacode != ''){
			$("#merchantArea").val(areacode);	
		}				
	});
	
	$("#register").change(function(t){
		var registerType = $("#register").val();
		if(registerType == '2'){
			$("#temp2").removeAttr('readonly');
			$("#temp3").removeAttr('readonly');	
		}else{
			$("#temp2").val("");
			$("#temp2").attr('readonly','readonly');
			$("#temp3").val("");
			$("#temp3").attr('readonly','readonly');
		}				
	});
});



</script>
