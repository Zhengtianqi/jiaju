<%@ page contentType="text/html;charset=UTF-8" %>
<nav id="nav_main" class="text_info">
    <span id="txt_home_title" class="nav_text">家具商场管理后台</span>
    <i id="i_nickname_slide"></i>
    <span id="txt_home_nickname"><c:choose><c:when test="${requestScope.admin.admin_nickname != ''}">${requestScope.admin.admin_nickname}</c:when><c:otherwise>${requestScope.admin.admin_name}</c:otherwise></c:choose></span>
    <input id="admin_id" type="hidden" value="${requestScope.admin.admin_id}"/>
    <ul id="nav_tools">
        <li id="nav_tools_admin_manage">账号管理</li>
        <li id="nav_tools_admin_logout">注销</li>
    </ul>
</nav>