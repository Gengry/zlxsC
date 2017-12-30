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
            <label for="providerNameCreate">供应商</label>
            <input id="providerNameCreate" type="text" class="form-control" name="providerName" maxlength="20">
        </div>
        <div class="form-group">
            <label for="providerContactCreate">联系人</label>
            <input id="providerContactCreate" type="text" class="form-control" name="providerContact" maxlength="20">
        </div>
        <div class="form-group">
            <label for="providerTeleCreate">联系电话</label>
            <input id="providerTeleCreate" type="text" class="form-control" name="providerTele" maxlength="300">
        </div>
        <div class="form-group">
            <label for="providerAddressCreate">地址</label>
            <input id="providerAddressCreate" type="text" class="form-control" name="providerAddress" maxlength="300">
        </div>
        <div class="form-group">
            <label for="providerWarehouseCreate">仓库地址</label>
            <input id="providerWarehouseCreate" type="text" class="form-control" name="providerWarehouse" maxlength="300">
        </div>
        <div class="form-group">
            <label for="providerDescCreate">描述</label>
            <input id="providerDescCreate" type="text" class="form-control" name="providerDesc" maxlength="300">
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
            url: '${basePath}/customer/provider/create',
            data: $('#createForm').serialize(),
            beforeSend: function() {
                if(isEmpty($("#providerNameCreate").val())){
                    failPrompt('供应商不能为空');
                    $('#providerNameCreate').focus();
                    return false;
                }
                if(isEmpty($("#providerContactCreate").val())){
                    failPrompt('联系人不能为空');
                    $('#providerContactCreate').focus();
                    return false;
                }
                if(isEmpty($("#providerTeleCreate").val())){
                    failPrompt('联系电话不能为空');
                    $('#providerTeleCreate').focus();
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