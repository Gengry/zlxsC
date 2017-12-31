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
	<title>采购订单</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>
</head>
<body>
<div id="main">
	<div id="toolbar">
		<a class="waves-effect waves-button" href="javascript:;" onclick="createAction()"><i class="zmdi zmdi-plus"></i> 新增线缆</a>
		<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除信息</a>
        <select id="selectCustomer" style="width: 150px;" data-placeholder="请选择一个客户">
            <option></option>
            <c:forEach items="${cableProviders}" var="item">
                <option value="${item.id}">${item.providerName}</option>
            </c:forEach>
        </select>
	</div>
	<table id="tableAdd" >
		<thead>
        <tr>
            <th data-checkbox="true"></th>
            <th data-field="id">线缆型号</th>
            <th>线缆规格</th>
            <th>线缆质量</th>
            <th>线缆单位</th>
            <th>线缆颜色</th>
            <th>数量</th>
            <th>单价</th>
            <th>折扣</th>
            <th>小计</th>
            <th>出库仓库地址</th>
            <th data-formatter="actionFormatter" data-click-to-select="false">操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td></td>
            <td>1</td>
            <td>$100</td>
            <td>January</td>
            <td>$100</td>
            <td>January</td>
            <td>$100</td>
            <td>January</td>
            <td>$100</td>
            <td>January</td>
            <td>$100</td>
            <td></td>
        </tr>
        </tbody>
	</table>
    <div>
        <div class="form-group form-inline">
            <input type="text" class="form-control" id="exampleInputName2" placeholder="联系人">
            <input type="text" class="form-control" id="exampleInputEmail3" placeholder="联系电话">
            <input type="text" class="form-control" id="exampleInputEmail4" placeholder="公司地址">
            <input type="text" class="form-control" id="exampleInputEmail5" placeholder="客户仓库地址">
            <input type="text" class="form-control" id="exampleInputName6" placeholder="订单总金额">
        </div>
        <div class="form-group">
            <textarea class="form-control" placeholder="订单备注信息" rows="3"></textarea>
        </div>
        <div style="align-content: center">
            <a class="waves-effect waves-button" href="javascript:;" onclick="createAction()"><i class="zmdi zmdi-plus"></i> 提交订单</a>
        </div>
    </div>
</div>
<jsp:include page="/resources/inc/footer.jsp" flush="true"/>
<script>

    function addRow(){
        var row = $table.bootstrapTable('getRowByUniqueId',1)
        $table.bootstrapTable('append',row);
    }

var $table = $('#tableAdd');
$(function() {
	$table.bootstrapTable({
		striped: true,
		clickToSelect: true,
        uniqueId: 'id',
	});

	$("#selectCustomer").select2();

});

function refreshInit(){
    $table.bootstrapTable("selectPage",1);
}


// 格式化操作按钮
function actionFormatter(value, row, index) {
    return [
		'<a class="update" href="javascript:;" onclick="updateAction()" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
		'<a class="delete" href="javascript:;" onclick="deleteAction()" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
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
		content: 'url:${basePath}/order/orderIn/create',
		onContentReady: function () {
			initMaterialInput();
		}
	});
}
function getc(){
    return $("#createNone").html();
}
// 编辑
var updateDialog;
function updateAction(cableInfoId) {
    updateDialog = $.dialog({
        animationSpeed: 300,
        title: '编辑角色',
        content: 'url:${basePath}/mate/cable/update/' + cableInfoId,
        onContentReady: function () {
            initMaterialInput();
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