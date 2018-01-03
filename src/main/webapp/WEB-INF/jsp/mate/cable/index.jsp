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
	<title>角色管理</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>
</head>
<body>
<div id="main">
	<div id="toolbar" class="form-inline">
		<a class="waves-effect waves-button" href="javascript:;" onclick="createAction()"><i class="zmdi zmdi-plus"></i> 新增线缆</a>
		<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除信息</a>
        <div class="form-group">
            <label class="sr-only" for="cableModel">线缆型号</label>
            <input type="text" class="form-control" id="cableModel" placeholder="线缆型号">
        </div>
        <div class="form-group">
            <label class="sr-only" for="cableSpec">线缆规格</label>
            <input type="text" class="form-control" id="cableSpec" placeholder="线缆规格">
        </div>
        <button type="button" class="btn btn-default" onclick="javascript:$table.bootstrapTable('refresh');">查找</button>
	</div>
	<table id="table"></table>
</div>
<jsp:include page="/resources/inc/footer.jsp" flush="true"/>
<script>
var $table = $('#table');
$(function() {
	// bootstrap table初始化
	$table.bootstrapTable({
		url: '${basePath}/mate/cable/list',
		height: getHeight(),
		striped: true,
		//showColumns: true,
		minimumCountColumns: 2,
		clickToSelect: true,
		detailView: true,
		detailFormatter: 'cableFormatter',
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
			{field: 'cableModel', title: '线缆型号', align: 'center'},
			{field: 'cableSpec', title: '线缆规格', align: 'center'},
            {field: 'cablePrice', title: '建议单价', align: 'center'},
            {field: 'cableTime', title: '创建时间', align: 'center' , formatter: 'timeFormatter'},
            //{field: 'cableDesc', title: '描述', align: 'center', width: '20%'},
			{field: 'action', title: '操作', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false,width:'150px' }
		],

	});
});

function refreshInit(){
    $table.bootstrapTable("selectPage",1);
}

function queryParams(params) {
    params["cableModel"]=$("#cableModel").val();
    params["cableSpec"]=$("#cableSpec").val();
    return params;
}

// 格式化操作按钮
function actionFormatter(value, row, index) {
    var cableInfoId = row.id;
    var cableModel = row.cableModel;
    return [
        '<a class="update" href="javascript:;" onclick="createSpecAction(\''+cableModel+'\')" data-toggle="tooltip" title="add"><i class="glyphicon glyphicon-plus-sign"></i></a>　',
		'<a class="update" href="javascript:;" onclick="updateAction('+cableInfoId+')" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
		'<a class="delete" href="javascript:;" onclick="deleteAction('+cableInfoId+')" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
    ].join('');
}

function timeFormatter(value, row, index){
    var timeStamp = row.cableTime;
    var date = new Date(timeStamp)
    return dateFtt("yyyy-MM-dd hh:mm:ss",date);
}

function cableFormatter(index, row) {
    return '描述：'+row.cableDesc;
//    var t = '仓库管理';
//    var x = '/mate/houseIndex';
//    return "<div type=''><table><tr><td>1</td><td>2</td><td>3</td></tr></table>" +
//        "<a href='javascript:parent.Tab.addTab(\""+t+"\", \""+x+"\");'>123123</a></div>";
}

// 新增
var createDialog;
function createAction() {
	createDialog = $.dialog({
		animationSpeed: 300,
		title: '新增线缆信息',
		content: 'url:${basePath}/mate/cable/create',
		onContentReady: function () {
			initMaterialInput();
		}
	});
}

function createSpecAction(cableModel) {
    createDialog = $.dialog({
        animationSpeed: 300,
        title: '新增线缆规格',
        content: 'url:${basePath}/mate/cable/create?cableModel='+cableModel,
        onContentReady: function () {
            initMaterialInput();
        }
    });
}

// 编辑
var updateDialog;
function updateAction(cableInfoId) {
    updateDialog = $.dialog({
        animationSpeed: 300,
        title: '编辑线缆信息',
        content: 'url:${basePath}/mate/cable/update/' + cableInfoId,
        onContentReady: function () {
            initMaterialInput();
        }
    });
	/*var rows = $table.bootstrapTable('getSelections');
	if (rows.length != 1) {
		$.confirm({
			title: false,
			content: '请选择一条记录！',
			autoClose: 'cancel|3000',
			backgroundDismiss: true,
			buttons: {
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	} else {
		updateDialog = $.dialog({
			animationSpeed: 300,
			title: '编辑角色',
			content: 'url:\${basePath}/manage/role/update/' + rows[0].roleId,
			onContentReady: function () {
				initMaterialInput();
			}
		});
	}*/
}
// 删除
var deleteDialog;
function deleteAction() {
	var rows = $table.bootstrapTable('getSelections');
	if (rows.length == 0) {
		$.confirm({
			title: false,
			content: '请至少选择一条记录！',
			autoClose: 'cancel|3000',
			backgroundDismiss: true,
			buttons: {
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	} else {
		deleteDialog = $.confirm({
			type: 'red',
			animationSpeed: 300,
			title: false,
			content: '确认删除该记录吗？',
			buttons: {
				confirm: {
					text: '确认',
					btnClass: 'waves-effect waves-button',
					action: function () {
						var ids = new Array();
						for (var i in rows) {
							ids.push(rows[i].id);
						}
						$.ajax({
							type: 'get',
							url: '${basePath}/mate/cable/delete/' + ids.join("-"),
							success: function(result) {
								if (result.code != 1) {
									if (result.data instanceof Array) {
										$.each(result.data, function(index, value) {
											$.confirm({
												theme: 'dark',
												animation: 'rotateX',
												closeAnimation: 'rotateX',
												title: false,
												content: value.errorMsg,
												buttons: {
													confirm: {
														text: '确认',
														btnClass: 'waves-effect waves-button waves-light'
													}
												}
											});
										});
									} else {
										$.confirm({
											theme: 'dark',
											animation: 'rotateX',
											closeAnimation: 'rotateX',
											title: false,
											content: result.data.errorMsg,
											buttons: {
												confirm: {
													text: '确认',
													btnClass: 'waves-effect waves-button waves-light'
												}
											}
										});
									}
								} else {
									deleteDialog.close();
									$table.bootstrapTable('refresh');
								}
							},
							error: function(XMLHttpRequest, textStatus, errorThrown) {
								$.confirm({
									theme: 'dark',
									animation: 'rotateX',
									closeAnimation: 'rotateX',
									title: false,
									content: textStatus,
									buttons: {
										confirm: {
											text: '确认',
											btnClass: 'waves-effect waves-button waves-light'
										}
									}
								});
							}
						});
					}
				},
				cancel: {
					text: '取消',
					btnClass: 'waves-effect waves-button'
				}
			}
		});
	}
}
</script>
</body>
</html>