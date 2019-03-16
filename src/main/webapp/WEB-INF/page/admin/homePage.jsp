<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<head>
    <script src="${pageContext.request.contextPath}/res/layer/layer.js"></script>
    <script src="${pageContext.request.contextPath}/res/js/admin/admin_home.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/admin/admin_home.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/admin/admin_main.css"/>
    <title>家具商场管理后台 - 首页</title>
</head>
<body>
<div id="div_home_main">
    <%@ include file="include/nav.jsp"%>
    <ul id="ul_home_menu" class="text_info">
       
        <li class="menu_li" data-toggle="product">
            <span>家具管理</span>
        </li>
        <li class="menu_li" data-toggle="category">
            <span>家具分类</span>
        </li>
        <li class="menu_li" data-toggle="user">
            <span>用户管理</span>
        </li>
        <li class="menu_li" data-toggle="order">
            <span>订单管理</span>
        </li>
         <li class="menu_li" data-toggle="home">
            <span>数据分析</span>
        </li>
        <li class="menu_li" data-toggle="account">
            <span>修改密码</span>
        </li>
    </ul>
    <div id="div_home_title" class="text_info">
        <span>欢迎页面</span>
    </div>
    <div id="div_home_context">
        <div id="div_home_context_main">
            <%@include file="indexPage.jsp" %>
        </div>
    </div>
</div>
</body>