<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path =  request.getContextPath();
	request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered" id="sample_6">

	<%-- <tr>
		 <td class="col-md-2 td0">中信银行商户编号</td>
		<td>
				<input type="text" class="form-control" id="pway_merchant_no"  name = "pway_merchant_no" value="${pwayMerchantNo1}" >
		</td>	
	</tr>
	<tr>
		<td class="col-md-2 td0">光大银行商户编号</td>
		<td>
			<input type="text" class="form-control" id="pway_merchant_no_t"  name = "pway_merchant_no_t" value="${pwayMerchantNo2}" >
		</td>	
	</tr>  --%>
	<tr>
		 <td class="col-md-2 td0">支付宝子商户号</td>
		<td>
				<input type="text" class="form-control" id="pway_merchant_no"  name = "pway_merchant_no" value="${pwayMerchantNo1}" >
		</td>	
	</tr>
	<tr>
		<td class="col-md-2 td0">微信子商户号</td>
		<td>
			<input type="text" class="form-control" id="pway_merchant_no_t"  name = "pway_merchant_no_t" value="${pwayMerchantNo2}" >
		</td>	
	</tr> 
</table>
<script type="text/javascript">
dataOpr();
</script>
