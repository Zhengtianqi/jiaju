<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<head>
	<script src="${pageContext.request.contextPath}/res/layer/layer.js"></script>
    <script src="${pageContext.request.contextPath}/res/js/admin/admin_login.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/admin/admin_login.css"/>
    <title>后台管理登录</title>
</head>
<body>
<div id="div_background" style="background-image: url('${pageContext.request.contextPath}/res/images/admin/loginPage/adminbg.jpg');">
    <div id="div_nav">
        <ul id="div_peelPanel">
            <li value="url(${pageContext.request.contextPath}/res/images/admin/loginPage/adminbg.jpg)">
                <img src="${pageContext.request.contextPath}/res/images/admin/loginPage/adminbg.jpg"/>
            </li>
        </ul>
    </div>
    <div id="div_main">
        <div id="div_head"><p>家具商场 <span>管理后台</span></p></div>
        <div id="div_content">
            <form id="form_login">
                <input type="text" class="form-control form_control" placeholder="用户名" id="input_username" title="请输入用户名"/>
                <input type="password" class="form-control form_control" placeholder="密码" id="input_password" title="请输入密码" autocomplete="on">
                <span id="txt_error_msg"></span>
                <input type="button" class="btn btn-danger" id="btn_login" value="登录"/>
            </form>
        </div>
    </div>
</div>
</body>