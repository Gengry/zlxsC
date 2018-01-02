<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>线缆管理系统</title>

	<link href="${basePath}/plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet"/>
	<link href="${basePath}/plugins/material-design-iconic-font-2.2.0/css/material-design-iconic-font.min.css" rel="stylesheet"/>
	<link href="${basePath}/plugins/waves-0.7.5/waves.min.css" rel="stylesheet"/>
	<link href="${basePath}/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.min.css" rel="stylesheet"/>
	<link href="${basePath}/css/admin.css" rel="stylesheet"/>
	<style>
		#header {background: #29A176;}
		.content_tab{background: #29A176;}
		.s-profile>a{background: url(${basePath}/images/zheng-upms.png) left top no-repeat;}
	</style>
</head>
<body>
<header id="header">
	<ul id="menu">
		<li id="guide" class="line-trigger">
			<div class="line-wrap">
				<div class="line top"></div>
				<div class="line center"></div>
				<div class="line bottom"></div>
			</div>
		</li>
		<li id="logo" class="hidden-xs">
			<a href="">
				<img src="${basePath}/images/logo.png"/>
			</a>
			<span id="system_title">线缆管理系统</span>
		</li>
		<li class="pull-right">
			<ul class="hi-menu">
				<li class="dropdown">
					<a class="waves-effect waves-light" data-toggle="dropdown" href="javascript:;">
						<i class="him-icon zmdi zmdi-more-vert"></i>
					</a>
					<ul class="dropdown-menu dm-icon pull-right">
						<li>
							<a class="waves-effect" href="${basePath}/logout"><i class="zmdi zmdi-run"></i> 修改密码</a>
						</li>
						<li>
							<a class="waves-effect" href="${basePath}/logout"><i class="zmdi zmdi-run"></i> 退出登录</a>
						</li>
					</ul>
				</li>
			</ul>
		</li>
	</ul>
</header>
<section id="main">
	<!-- 左侧导航区 -->
	<aside id="sidebar">
		<!-- 个人资料区 -->
		<div class="s-profile">
			<a class="waves-effect waves-light" href="javascript:;">
				<div class="sp-pic">
					<img src="${basePath}/images/avatar.jpg"/>
				</div>
				<div class="sp-info">
					您好！
					<i class="zmdi zmdi-caret-down"></i>
				</div>
			</a>
		</div>
		<!-- /个人资料区 -->
		<!-- 菜单区 -->
		<ul class="main-menu">
			<li>
				<a class="waves-effect" href="javascript:Tab.addTab('首页', 'home');"><i class="zmdi zmdi-home"></i> 首页</a>
			</li>
			<li class="sub-menu system_menus system_1 0" style="display: list-item;">
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 订单管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('订购', '/order/inIndex');">订购</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('销售', '/order/outIndex');">销售</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('订单列表', '/order/order/index');">订单列表</a></li>
				</ul>
			</li>
			<li class="sub-menu system_menus system_1 0" style="display: list-item;">
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 库存管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('库存盘点', '/storage/index');">库存盘点</a></li>
				</ul>
			</li>
			<li class="sub-menu system_menus system_1 0" style="display: list-item;">
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 客户管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('供应商管理', '/customer/providerIndex');">供应商管理</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('客户管理', '/customer/customerIndex');">客户管理</a></li>
				</ul>
			</li>
			<li class="sub-menu system_menus system_1 0" style="display: list-item;">
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 元数据管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('线缆信息', '/mate/cableIndex');">线缆信息</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('颜色信息', '/mate/colorIndex');">颜色信息</a></li>
					<%--<li><a class="waves-effect" href="javascript:Tab.addTab('计量单位', '/mate/unitIndex');"> </a></li>--%>
					<li><a class="waves-effect" href="javascript:Tab.addTab('质量标准', '/mate/qualityIndex');">质量标准</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('仓库管理', '/mate/houseIndex');">仓库管理</a></li>
				</ul>
			</li>
			<li>
				<div class="upms-version">&copy; ZLXS-CAO V1.0.0</div>
			</li>
		</ul>
		<!-- /菜单区 -->
	</aside>
	<!-- /左侧导航区 -->
	<section id="content">
		<div class="content_tab">
			<div class="tab_left">
				<a class="waves-effect waves-light" href="javascript:;"><i class="zmdi zmdi-chevron-left"></i></a>
			</div>
			<div class="tab_right">
				<a class="waves-effect waves-light" href="javascript:;"><i class="zmdi zmdi-chevron-right"></i></a>
			</div>
			<ul id="tabs" class="tabs">
				<li id="tab_home" data-index="home" data-closeable="false" class="cur">
					<a class="waves-effect waves-light" href="javascript:;">首页</a>
				</li>
			</ul>
		</div>
		<div class="content_main">
			<div id="iframe_home" class="iframe cur">
				<p><h3>众联芯实 线缆管理系统</h3></p>
				<p><b>演示地址</b>：<a href="http://www.zhangshuzheng.cn/zhengAdmin" target="_blank">http://www.zhangshuzheng.cn/zhengAdmin</a></p>
				<p><b>系统简介</b>：本系统是基于zheng框架adminUI和common,实现对线缆商品的库存管理功能。</p><br/>
				<p><h4>系统功能概述：</h4></p>
				<p><b>订单管理</b>：提供生成订货单和销售单、订单列表查看、订单详情功能。</p>
				<p><b>库存管理</b>：提供库存盘点、库存修改、库存删除功能。</p>
				<p><b>客户管理</b>：提供供应商信息和客户信息的增加、修改、删除功能。</p>
				<p><b>元数据管理</b>：提供线缆信息、颜色信息、质量标准、仓库的增加、修改、删除功能。</p>
				<br/><br/><br/><br/>
				<%--<p><h4>使用指南：</h4></p>--%>
				<%--<p></p>--%>
				<%--<p><b>系统组织数据接口</b>、<b>用户角色数据接口</b>、<b>资源权限数据接口</b>、<b>单点登录(SSO)接口</b>、<b>用户鉴权接口</b></p><br/>--%>
				<p><h4>关于作者</h4></p>
				<p><b>姓　　名</b>：耿瑞阳</p>
				<p><b>电子邮箱</b>：545620701@qq.com</p>
				<p><b>使    用</b>：zheng admin ui，zheng common</p>
			</div>
		</div>
	</section>
</section>
<footer id="footer"></footer>
<script>var BASE_PATH = '${basePath}';</script>
<script src="${basePath}/plugins/jquery.1.12.4.min.js"></script>
<script src="${basePath}/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script src="${basePath}/plugins/waves-0.7.5/waves.min.js"></script>
<script src="${basePath}/plugins/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="${basePath}/plugins/BootstrapMenu.min.js"></script>
<script src="${basePath}/plugins/device.min.js"></script>
<script src="${basePath}/plugins/jquery.cookie.js"></script>
<script src="${basePath}/js/admin.js"></script>
<script src="${basePath}/plugins/fullPage/jquery.fullPage.min.js"></script>
<script src="${basePath}/plugins/fullPage/jquery.jdirk.min.js"></script>
<script>
	$(function(){
        Tab.addTab('库存盘点', '/storage/index');
	});
</script>
</body>
</html>