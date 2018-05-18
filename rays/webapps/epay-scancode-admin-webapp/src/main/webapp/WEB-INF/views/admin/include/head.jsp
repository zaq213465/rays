<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
   String path =  request.getContextPath();
   request.setAttribute("path", path);
%>
<header class="clearfix">
    <a href="${path }/adminManage/index" class="centerLogo"  style="position:relative;">
    	<img src="${path}/resources/images/logo.png" alt="${currentChannelInfo.nickName }数据">
    </a>
<!--     <div class="centerSearch"> -->
<!--         <input class="searchText" name="q" type="text" placeholder="搜索"> -->
<!--         <button id="searchBtn" type="button" class="searchBtn centerIcon"></button> -->
<!--     </div> -->
    <ul class="headerUl clearfix">
         <li class="headerLi1">
            <a class="headerFoucs" href="#" id="/adminManage/usermessage" url="usermessage" 
						addtabs="用户站内信" title="用户站内信">
						<img src="${path}/resources/images/message.png">
						<span id="message">
						</span>
						<%-- 站内信(${messageSize}) --%>
					</a>
        </li>
        <li class="headerLi2">
            <div class="headerFoucs"><span>${currentScanAdminUser.shortName }</span></div>
            <div class="centerLogout" ><span id="dealWithPwd">修改密码</span></div>
        </li>
        <li>
            <a class="headerInfo" href="${path }/index/logout">退出登录</a>
        </li>
    </ul>
</header>