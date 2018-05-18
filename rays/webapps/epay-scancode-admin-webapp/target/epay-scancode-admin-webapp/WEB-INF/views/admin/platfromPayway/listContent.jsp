<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="page" uri="page" %> 
<%
   String path =  request.getContextPath();
request.setAttribute("path", path);
%>
<table class="table table-striped table-bordered table-hover" id="sample_6">
							<thead>
							<tr>
								<th>支付通道代码</th>
								<th>支付通道名称</th>
								<th>通道类型</th>
								<th>T1交易费率</th>
								<th>T0垫资成本</th>
								<th>提现手续费(元)</th>
								<th>创建时间</th>
								<th>
									 操作
								</th>
							</tr>
							</thead>
							<tbody id="tableContent">
							
						  <c:forEach var="item" items="${pager.result}"> 
						   <tr>
									<td>${item.payCode}</td>
									<td>${item.payName}</td>
									<td>
									<c:if test="${item.payType=='1'}">
										商户入驻
									</c:if>
									<c:if test="${item.payType=='2' }">
										支付通道
									</c:if>	
									</td>
									<td><fmt:formatNumber value="${item.t1Rate}" pattern="#0.#####"/></td>
									<td><fmt:formatNumber value="${item.t0Rate}" pattern="#0.#####"/></td>
									<td><fmt:formatNumber value="${item.rate}" pattern="#0.00"/></td>
									<td class="date_time_parse">${item.createTime}</td>

							<td>
								<a onclick="javascript:todetail('${item.id}');"><span class="label label-default">查看详情</span></a>
								<a href="${path}/adminManage/platfromPayway/${item.id}"><span class="label label-info">修改</span></a>
								<a onclick="javascript:del('${item.id}');"><span class="label label-danger">删除</span></a>
							</td> 
						 </tr>
					</c:forEach>
					<c:if test="${pager.result.size() == 0}">
								<tr>
									<td class="page-nodata" colspan="8">查无数据！</td>
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
								   url: "platfromPayway/detail/"+id,
								   success: function(msg){
									   var btn = {success:{   
									       label: "关闭",
									       className: "btn-default",
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
						
						$(function(){
							var text = $(".date_time_parse");
							for(var i = 0; i < text.size();i++){
								var parse = dateTimeParse($(text[i]).text());
								$(text[i]).attr("title",$(text[i]).text());
								$(text[i]).attr("class","date_time_parsed");
								$(text[i]).html(parse);
							}
							
							text = $(".parent_id_parse");
							for(var i = 0; i < text.size();i++){
								var parse = $(text[i]).attr("title");
								var val = $(text[i]).text().trim();
								var ops=$("#"+parse).find("option");
								for(var k = 0; k < ops.size();k++){
									var opval = $(ops[k]).val();
									$(text[i]).attr("title",val);
									if(opval == val){
										$(text[i]).html($(ops[k]).text());
									}
								}
							}
						});
						
						//日期处理（结合时区函数）
						function dateTimeParse(fmt) {
							if(fmt.length == 17 || fmt.trim() == ''){
								return "";
							}
						    var now = timeOffset(fmt);
						    var year = now.getFullYear(); //getFullYear getYear
						    var month = now.getMonth();
						    var date = now.getDate();
						    var day = now.getDay();
						    var hour = now.getHours();
						    var minu = now.getMinutes();
						    var sec = now.getSeconds();
						    var week;
						    month = month + 1;
						    if (month < 10) month = "0" + month;
						    if (date < 10) date = "0" + date;
						    if (hour < 10) hour = "0" + hour;
						    if (minu < 10) minu = "0" + minu;
						    if (sec < 10) sec = "0" + sec;
						    var arr_week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
						    week = arr_week[day];
						    var time = "";
						    time = year + "-" + month + "-" + date + "" + " " + hour + ":" + minu + ":" + sec + " " + week;
						    return time;
						}
						
						//时区处理
						function timeOffset(fmt) {
						    var now = new Date(fmt);
						    //先将时间格式化到格林威治时区，正常来说是在中国区（GMT）打开界面
						    //getTimezoneOffset是-480（分钟为单位），负数是中国在东边，比格林威治早，中国更早见到太阳
						    var timeval = now.getTime()+now.getTimezoneOffset()*60*1000;
						    if(fmt.indexOf("CST")>0){
						    	//服务器时区是CST，比格林威治晚了6个小时，所以获取格式化之后的毫秒数减去6个小时的毫秒数，即为正确时间
						    	timeval -= 6*60*60*1000;
						    }
					    	now = new Date(timeval);
						    return now;
						}
			</script>
			<page:page curPage="${pager.pageNo}" totalPages="${pager.totalPages}"/><b class="totalCountInPage">共&nbsp;&nbsp;${pager.totalCount}&nbsp;&nbsp;条</b>				