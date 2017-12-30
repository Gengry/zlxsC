<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<div id="createDialog" class="crudDialog">
    <form id="createForm" method="post">
        <div class="form-group">
            <label for="customerNameCreate">客户</label>
            <input id="customerNameCreate" type="text" class="form-control" name="customerName" maxlength="20">
        </div>
        <div class="form-group">
            <label for="customerContactCreate">联系人</label>
            <input id="customerContactCreate" type="text" class="form-control" name="customerContact" maxlength="20">
        </div>
        <div class="form-group">
            <label for="customerTeleCreate">联系电话</label>
            <input id="customerTeleCreate" type="text" class="form-control" name="customerTele" maxlength="300">
        </div>
        <div class="form-group">
            <label for="customerAddressCreate">地址</label>
            <input id="customerAddressCreate" type="text" class="form-control" name="customerAddress" maxlength="300">
        </div>
        <div class="form-group">
            <label for="customerWarehouseCreate">仓库地址</label>
            <input id="customerWarehouseCreate" type="text" class="form-control" name="customerWarehouse" maxlength="300">
        </div>
        <div class="form-group">
            <label for="customerDescCreate">描述</label>
            <input id="customerDescCreate" type="text" class="form-control" name="customerDesc" maxlength="300">
        </div>
        <div class="form-group text-right dialog-buttons">
            <a class="waves-effect waves-button" href="javascript:;" onclick="createSubmit();">保存</a>
            <a class="waves-effect waves-button" href="javascript:;" onclick="createDialog.close();">取消</a>
        </div>
    </form>
</div>
<script>
    function createSubmit() {
        $.ajax({
            type: 'post',
            url: '${basePath}/customer/customer/create',
            data: $('#createForm').serialize(),
            beforeSend: function() {
                if(isEmpty($("#customerNameCreate").val())){
                    failPrompt('供应商不能为空');
                    $('#customerNameCreate').focus();
                    return false;
                }
                if(isEmpty($("#customerContactCreate").val())){
                    failPrompt('联系人不能为空');
                    $('#customerContactCreate').focus();
                    return false;
                }
                if(isEmpty($("#customerTeleCreate").val())){
                    failPrompt('联系电话不能为空');
                    $('#customerTeleCreate').focus();
                    return false;
                }
            },
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
                    createDialog.close();
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
</script>