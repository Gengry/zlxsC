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
	<title>客户管理</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>
</head>
<body>
<div id="main">
	<div id="toolbar" class="form-inline">
		<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除信息</a>
        <div class="form-group">
            <label class="sr-only" for="searchModel">线缆型号</label>
            <input type="text" class="form-control" id="searchModel" placeholder="线缆型号">
        </div>
        <div class="form-group">
            <label class="sr-only" for="searchSpec">线缆规格</label>
            <input type="text" class="form-control" id="searchSpec" placeholder="线缆规格">
        </div>
        <select id="searchUnit" style="width: 150px;" data-placeholder="请选择单位">
            <option value="NULL">请选择单位</option>
            <c:forEach items="${units}" var="item" >
                <option value="${item}">${item}</option>
            </c:forEach>
        </select>
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
		url: '${basePath}/storage/storage/list',
		height: getHeight(),
		striped: true,
		//showColumns: true,
		minimumCountColumns: 2,
		clickToSelect: true,
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
			{field: 'storageModel', title: '线缆型号', align: 'center'},
			{field: 'storageSpec', title: '线缆规格', align: 'center'},
            {field: 'storageQuality', title: '质量标准', align: 'center'},
            {field: 'storageColor', title: '颜色', align: 'center'},
            {field: 'storageNumber', title: '库存数量', align: 'center'},
            {field: 'storageUnit', title: '计量单位', align: 'center'},
            {field: 'storageProvider', title: '供应商', align: 'center'},
            {field: 'storageHouse', title: '仓库地址', align: 'center'},
            {field: 'storageUpdateTime', title: '创建时间', align: 'center' , formatter: 'timeFormatter'},
            //{field: 'storageDesc', title: '描述', align: 'center', width: '20%'},
			{field: 'action', title: '操作', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false,width:'150px' }
		],

	});
	$("select").select2();
});

function refreshInit(){
    $table.bootstrapTable("selectPage",1);
}

function queryParams(params) {
    params["searchModel"]=$("#searchModel").val();
    params["searchSpec"]=$("#searchSpec").val();
    params["searchUnit"]=$("#searchUnit").val();
    return params;
}

// 格式化操作按钮
function actionFormatter(value, row, index) {
    var id = row.id;
    var num = row.storageNumber;
    return [
		'<a class="update" href="javascript:;" onclick="updateAction('+id+','+num+')" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
		'<a class="delete" href="javascript:;" onclick="deleteAction('+id+')" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
    ].join('');
}

function timeFormatter(value, row, index){
    var timeStamp = row.storageUpdateTime;
    var date = new Date(timeStamp)
    return dateFtt("yyyy-MM-dd hh:mm:ss",date);
}


// 编辑
var updateDialog;
function updateAction(id,num) {
    updateDialog = $.dialog({
        animationSpeed: 300,
        title: '编辑信息',
        content: '<div id="updateDialog" class="crudDialog" style="padding-top:10px;"><div class="form-group">' +
        '<label for="updateNum" class="active">库存</label>' +
        '<input id="updateNum" type="number" class="form-control" name="customerName" maxlength="20" value="'+num+'" min="0">' +
        '</div>' +
        '<div class="form-group text-right dialog-buttons">' +
        '<a class="waves-effect waves-button" href="javascript:;" onclick="updateNum('+id+');">保存</a>' +
        '<a class="waves-effect waves-button" href="javascript:;" onclick="updateDialog.close();">取消</a>' +
        '</div>' +
        '</div>',
        onContentReady: function () {
            initMaterialInput();
        }
    });

}

function updateNum(id){
    if(isEmpty($("#updateNum").val())){
        failPrompt("库存不能为空。")
        return false;
    }
    if(parseFloat($("#updateNum").val())<0){
        failPrompt("库存不能小于零。")
        return false;
    }
    $.ajax({
        type: 'post',
        url: '${basePath}/storage/storage/updateNum/'+id,
        data: {"num":$("#updateNum").val()},
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
                updateDialog.close();
                $table.bootstrapTable('refresh');
            }
        }
    });
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
							url: '${basePath}/storage/storage/delete/' + ids.join("-"),
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