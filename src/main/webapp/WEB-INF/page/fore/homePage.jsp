<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="include/header.jsp" %>
<head>
    <script src="${pageContext.request.contextPath}/res/js/jquery-color-2.1.2.js"></script>
    <script src="${pageContext.request.contextPath}/res/js/fore/fore_home.js"></script>
    <script src="${pageContext.request.contextPath}/res/layui/layui.js"></script>
    <link href="${pageContext.request.contextPath}/res/css/fore/fore_home.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/res/layui/css/layui.css" rel="stylesheet">
    <title>家具商场</title>
</head>
<body>
<nav>
    <%@ include file="include/navigator.jsp" %>
    <div class="header">
       <img src="${pageContext.request.contextPath}/res/images/fore/WebsiteImage/Hlogo.png">
        <div class="mallSearch">
            <form action="${pageContext.request.contextPath}/product" method="get">
                <div class="mallSearch-input">
                    <input class="header_search_input" type="text" name="product_name" placeholder="搜索家具"
                           maxlength="50">
                    <input class="header_search_button" type="submit" value="搜索">
                </div>
            </form>
            <ul>
                <c:forEach items="${requestScope.categoryList}" var="category" varStatus="i">
                    <c:if test="${i.index<9}">
                        <li><a href="${pageContext.request.contextPath}/product?category_id=${category.category_id}" style="color: #d9bc94">${fn:substring(category.category_name,0,fn:indexOf(category.category_name,' /'))}</a>
                        </li>
                    </c:if>
                </c:forEach>
            </ul>
        </div>
    </div>
    <div class="home_nav">
    </div>
</nav>

    <c:forEach var="product" items="${requestScope.specialProductList}" varStatus="i">
        <img src="${pageContext.request.contextPath}/res/images/fore/WebsiteImage/banner/${product.product_id}.jpg"
             name="${product.product_id}" id="banner${i.count}"
             <c:if test="${i.count == 1}">style="display: block;"</c:if> />
    </c:forEach>
		<div class="layui-carousel" id="huodong">
			<div carousel-item>
				<div><img src="${pageContext.request.contextPath}/res/images/homePicture/jiaju1.png" width="100%" height="100%"></div>
				<div><img src="${pageContext.request.contextPath}/res/images/homePicture/jiaju2.png" width="100%" height="100%"></div>
			</div>
		</div>
		<!-- 条目中可以是任意内容，如：<img src=""> -->

	<div class="banner_do">
    <div class="banner_goods">
        <c:forEach items="${requestScope.categoryList}" var="category">
            <c:if test="${fn:length(category.productList)>0}">
                <div class="banner_goods_type">
                    <div class="banner_goods_items">
                        <c:forEach items="${category.productList}" var="product" varStatus="i">
                            <c:if test="${i.index<4}">
                                <div class="banner_goods_item">
                                    <a href="product/${product.product_id}" class="goods_link"></a>
                                    <img src="${pageContext.request.contextPath}/res/images/item/productSinglePicture/${product.singleProductImageList[0].productImage_src}">
                                    <a href="product/${product.product_id}"
                                       class="goods_name">${product.product_name}</a>
                                    <span class="goods_price">￥${product.product_sale_price}</span>
                                </div>
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
            </c:if>
        </c:forEach>
    </div>
</div>
	<script>
		layui.use('carousel', function() {
			var carousel = layui.carousel;
			//建造实例
			carousel.render({
				elem : '#huodong',
				width : '100%',//设置容器宽度
				height : '500' ,//设置容器高度
				arrow : 'always' ,//始终显示箭头
				interval : '10000'
			//,anim: 'updown' //切换动画方式
			});
		});
	</script>
	<script src="https://www.sobot.com/chat/frame/js/entrance.js?sysNum=1e3c071841084d2a902e0c6e1f0eaa33" class="zhiCustomBtn" id="zhichiScript" data-args="属性名1=属性值1&属性名2=属性值2"></script>
	<%-- <%@ include file="include/footer_two.jsp" %> --%>
<%@ include file="include/footer.jsp" %>
</body>
