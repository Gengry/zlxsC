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
	<title>订单列表</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>
</head>
<body>
<div id="main">
	<div id="toolbar" class="form-inline">
		<%--<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除信息</a>--%>
        <%--<button type="button" class="btn btn-default" onclick="javascript:$table.bootstrapTable('refresh');">刷新列表</button>--%>
	</div>
	<table id="table"></table>
</div>
<jsp:include page="/resources/inc/footer.jsp" flush="true"/>
<script>
var $table = $('#table');
$(function() {
	// bootstrap table初始化
	$table.bootstrapTable({
		url: '${basePath}/order/detail/list',
		height: getHeight(),
		striped: true,
		//showColumns: true,
		minimumCountColumns: 2,
		clickToSelect: true,
//		detailView: true,
//		detailFormatter: 'cableFormatter',
		pagination: true,
		paginationLoop: false,
		sidePagination: 'server',
		smartDisplay: false,
		escape: true,
		searchOnEnterKey: true,
		idField: 'roleId',
		maintainSelected: true,
		toolbar: '#toolbar',
        onRefresh:refreshInit,
        queryParams:queryParams,
		columns: [
			{field: 'ck', checkbox: true},
			{field: 'id', title: '编号', align: 'center', visible:false},
            {field: 'itemModel', title: '线缆型号', align: 'center'},
			{field: 'itemSpec', title: '线缆规格', align: 'center'},
            {field: 'itemQuality', title: '线缆质量', align: 'center'},
            {field: 'itemUnit', title: '单位', align: 'center'},
            {field: 'itemColor', title: '颜色', align: 'center'},
            {field: 'itemNumber', title: '数量', align: 'center'},
            {field: 'itemPrice', title: '单价', align: 'center'},
            {field: 'itemDiscount', title: '折扣', align: 'center'},
            {field: 'itemTotlePrice', title: '小计', align: 'center'},
            {field: 'itemHouse', title: '出库仓库地址', align: 'center'},
            //{field: 'orderDesc', title: '描述', align: 'center', width: '20%'},
		],

	});
});

function queryParams(params) {
    params["orderId"]=${id};
    return params;
}

function refreshInit(){
    $table.bootstrapTable("selectPage",1);
}
</script>
</body>
</html>