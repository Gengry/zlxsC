﻿<%@ page contentType="text/html; charset=utf-8"%>
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
		<a class="waves-effect waves-button" href="javascript:;" onclick="createAction()"><i class="zmdi zmdi-plus"></i> 新增</a>
		<a class="waves-effect waves-button" href="javascript:;" onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除</a>
        <select id="selectCustomer" style="width: 150px;" data-placeholder="请选择一个客户" onchange="getCustomerByid()">
            <option></option>
            <c:forEach items="${cableCustomer}" var="item">
                <option value="${item.id}">${item.customerName}</option>
            </c:forEach>
        </select>
	</div>
	<table id="tableAdd" >
		<thead>
        <tr>
            <th data-field="ck" data-checkbox="true"></th>
            <th data-field="id" data-visible="false">id</th>
            <th data-field="storageId" data-visible="false">storageId</th>
            <th data-field="model">线缆型号</th>
            <th data-field="spec">线缆规格</th>
            <th data-field="quality">线缆质量</th>
            <th data-field="unit">线缆单位</th>
            <th data-field="color">线缆颜色</th>
            <th data-field="num">数量</th>
            <th data-field="price">单价</th>
            <th data-field="discount">折扣</th>
            <th data-field="count">小计</th>
            <th data-field="house">入库仓库地址</th>
            <%--<th data-field="cz" data-formatter="actionFormatter" data-click-to-select="false">操作</th>--%>
        </tr>
        </thead>
        <tbody>
        <%--<tr>--%>
            <%--<td></td>--%>
            <%--<td>1</td>--%>
            <%--<td>1</td>--%>
            <%--<td>$100</td>--%>
            <%--<td>January</td>--%>
            <%--<td>$100</td>--%>
            <%--<td>January</td>--%>
            <%--<td>$100</td>--%>
            <%--<td>January</td>--%>
            <%--<td>$100</td>--%>
            <%--<td>January</td>--%>
            <%--<td>$100</td>--%>
            <%--<td></td>--%>
        <%--</tr>--%>
        </tbody>
	</table>
    <div>
        <div class="form-group form-inline">
            <input type="text" class="form-control" id="customerContact" placeholder="联系人">
            <input type="text" class="form-control" id="customerTele" placeholder="联系电话">
            <input type="text" class="form-control" id="customerAddress" placeholder="公司地址">
            <input type="text" class="form-control" id="customerHouse" placeholder="客户仓库地址">
            <input type="number" class="form-control" id="orderPrice" placeholder="订单总金额" min="0" value="0">
        </div>
        <div class="form-group">
            <textarea id = "orderDesc" class="form-control" placeholder="订单备注信息" rows="3"></textarea>
        </div>
        <div style="align-content: center">
            <a class="waves-effect waves-button" href="javascript:;" onclick="submitOrder()"><i class="zmdi zmdi-plus"></i> 提交订单</a>
        </div>
    </div>
</div>
<jsp:include page="/resources/inc/footer.jsp" flush="true"/>
<script>

    var addIndex = 0;
    function addRow(){
        if(parseFloat($("#numStorage option:selected").text())<parseFloat($("#numCreate").val())){
            failPrompt("数量不能超过库存");
            return false;
        }
        if(isEmpty($("#numStorage").val())||isEmpty($("#modelCreate").val())||isEmpty($("#specCreate").val())||isEmpty($("#qualityCreate").val())||isEmpty($("#unitCreate").val())||isEmpty($("#colorCreate").val())||
            isEmpty($("#numCreate").val())||isEmpty($("#priceCreate").val())||isEmpty($("#discountCreate").val())||isEmpty($("#countPriceCreate").val())||isEmpty($("#houseCreate").val())){
            failPrompt("请将信息填写完整。");
        }else{
            $table.bootstrapTable('append',
                {
                    ck:"",
                    id:addIndex++,
                    storageId:$("#numStorage").val(),
                    model:$("#modelCreate").val(),
                    spec:$("#specCreate").val(),
                    quality:$("#qualityCreate").val(),
                    unit:$("#unitCreate").val(),
                    color:$("#colorCreate").val(),
                    num:$("#numCreate").val(),
                    price:$("#priceCreate").val(),
                    discount:$("#discountCreate").val(),
                    count:$("#countPriceCreate").val(),
                    house:$("#houseCreate").val(),
    //                cz:""
                });
            createDialog.close();
            setOrderPrice();
        }
    }

    function setOrderPrice(){
        var datas = $table.bootstrapTable('getData');
        var orderPrice = 0;
        for(var key in datas){
            orderPrice += Number(datas[key].count);
        }
        $("#orderPrice").val(orderPrice);
    }

var $table = $('#tableAdd');
$(function() {
	$table.bootstrapTable({
		striped: true,
		clickToSelect: true,
        uniqueId:"id"
	});

	$("#selectCustomer").select2();

});


// 新增
var createDialog;
function createAction() {
	createDialog = $.dialog({
		animationSpeed: 300,
		title: '新增线缆信息',
		content: 'url:${basePath}/order/orderOut/create',
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
        for (var i in rows) {
            $table.bootstrapTable("removeByUniqueId",rows[i].id);
        }
        setOrderPrice();
    }

}

function getCustomerByid(){
    $.ajax({
        url: BASE_PATH + '/order/getCustomerInfoById',
        type: 'GET',
        data: {
            id: $("#selectCustomer").val(),
        },
        success: function(json){
            if (json.code == 1) {
                $("#specCreate").html("");
                var cableCustomer = json.data;
                $("#customerContact").val(cableCustomer.customerContact);
                $("#customerTele").val(cableCustomer.customerTele);
                $("#customerAddress").val(cableCustomer.customerAddress);
                $("#customerHouse").val(cableCustomer.customerWarehouse);
            } else {

            }

        }
    });
}

function submitOrder(){
    var orderObj = {};
    if(isEmpty($("#selectCustomer  option:selected").val())){
        failPrompt("请填写完整。");
        return false;
    }
    if($table.bootstrapTable("getData").length==0){
        failPrompt("至少需要一条记录。");
        return false;
    }
    orderObj['items'] = $table.bootstrapTable("getData");
    orderObj['customerId'] = $("#selectCustomer  option:selected").val();
    orderObj['customerName'] = $("#selectCustomer  option:selected").text();
    orderObj['customerContact'] = $("#customerContact").val();
    orderObj['customerTele'] = $("#customerTele").val();
    orderObj['customerAddress'] = $("#customerAddress").val();
    orderObj['customerHouse'] = $("#customerHouse").val();
    orderObj['orderPrice'] = $("#orderPrice").val();
    orderObj['orderDesc'] = $("#orderDesc").val();
    $.ajax({
        type: 'post',
        url: '${basePath}/order/orderOut/create',
        data: orderObj,
        success: function(result) {
            if (result.code != 1) {
                if (result.data instanceof Array) {
                    $.each(result.data, function(index, value) {
                        $.confirm({
                            theme: 'dark',
                            animation: 'rotateX',
                            closeAnimation: 'rotateX',
                            title: false,
                            content: value.message,
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
                        content: result.message,
                        buttons: {
                            confirm: {
                                text: '确认',
                                btnClass: 'waves-effect waves-button waves-light'
                            }
                        }
                    });
                }
            } else {
                $.confirm({
                    theme: 'dark',
                    animation: 'rotateX',
                    closeAnimation: 'rotateX',
                    title: false,
                    content: "保存成功。",
                    confirm: function(){
                        alert('confirmed');
                    },
                    buttons: {
                        confirm: {
                            text: '确认',
                            btnClass: 'waves-effect waves-button waves-light',
                            action: function(){
                                parent.Tab.closeTab(parent.$("#tab__order_inIndex"));
                                //跳转到订单列表
                            }
                        }
                    }

                });
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

function closeOrderIn(){
    parent.Tab.closeTab(parent.$("#tab__order_inIndex"));
}
</script>
</body>
</html>