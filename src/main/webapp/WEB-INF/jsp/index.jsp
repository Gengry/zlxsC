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
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 元数据管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('线缆信息', '/mate/cableIndex');">线缆信息</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('颜色信息', 'crud2.html');">颜色信息</a></li>
                    <li><a class="waves-effect" href="javascript:Tab.addTab('计量单位', 'crud3.html');">计量单位</a></li>
                    <li><a class="waves-effect" href="javascript:Tab.addTab('质量标准', 'crud4.html');">质量标准</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('仓库管理', '/mate/houseIndex');">仓库管理</a></li>
				</ul>
			</li>
			<li class="sub-menu system_menus system_1 0" style="display: list-item;">
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 客户管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('线缆信息', 'crud6.html');">供应商管理</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('颜色信息', 'crud7.html');">客户管理</a></li>
				</ul>
			</li>
			<li class="sub-menu system_menus system_1 0" style="display: list-item;">
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 订单管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('订购', 'crud8.html');">订购</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('销售', 'crud9.html');">销售</a></li>
					<li><a class="waves-effect" href="javascript:Tab.addTab('订单列表', 'crud10.html');">订单列表</a></li>
				</ul>
			</li>
			<li class="sub-menu system_menus system_1 0" style="display: list-item;">
				<a class="waves-effect" href="javascript:;"><i class="zmdi zmdi-accounts-list"></i> 库存管理</a>
				<ul>
					<li><a class="waves-effect" href="javascript:Tab.addTab('库存盘点', 'crud11.html');">库存盘点</a></li>
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
				<p><h4>通用用户权限管理系统</h4></p>
				<p><b>演示地址</b>：<a href="http://www.zhangshuzheng.cn/zhengAdmin" target="_blank">http://www.zhangshuzheng.cn/zhengAdmin</a></p>
				<p><b>系统简介</b>：本系统是基于RBAC授权和基于用户授权的细粒度权限控制通用平台，并提供单点登录、会话管理和日志管理。接入的系统可自由定义组织、角色、权限、资源等。</p><br/>
				<p><h4>系统功能概述：</h4></p>
				<p><b>系统组织管理</b>：系统和组织增加、删除、修改、查询功能。</p>
				<p><b>用户角色管理</b>：用户和角色增加、删除、修改、查询功能。</p>
				<p><b>资源权限管理</b>：菜单和按钮增加、删除、修改、查询功能。</p>
				<p><b>权限分配管理</b>：提供给角色和用户的权限增加、删除、修改、查询功能。</p>
				<p><b>单点登录(SSO)</b>：提供统一用户单点登录认证、用户鉴权功能。</p>
				<p><b>用户会话管理</b>：提供分布式用户会话管理</p>
				<p><b>操作日志管理</b>：提供记录用户登录、操作等日志。</p><br/>
				<p><h4>对外接口概述：</h4></p>
				<p><b>系统组织数据接口</b>、<b>用户角色数据接口</b>、<b>资源权限数据接口</b>、<b>单点登录(SSO)接口</b>、<b>用户鉴权接口</b></p><br/>
				<p><h4>关于作者</h4></p>
				<p><b>姓　　名</b>：张恕征</p>
				<p><b>电子邮箱</b>：469741414@qq.com</p>
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
</body>
</html>