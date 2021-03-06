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
            <label for="cableHouseNameCreate">仓库名</label>
            <input id="cableHouseNameCreate" type="text" class="form-control" name="cableHouseName" maxlength="20">
        </div>
        <div class="form-group">
            <label for="cableHouseAddressCreate">仓库地址</label>
            <input id="cableHouseAddressCreate" type="text" class="form-control" name="cableHouseAddress" maxlength="20">
        </div>
        <div class="form-group">
            <label for="cableHouseContactCreate">仓库管理员</label>
            <input id="cableHouseContactCreate" type="text" class="form-control" name="cableHouseContact" maxlength="300">
        </div>
        <div class="form-group">
            <label for="cableHouseTeleCreate">仓库电话</label>
            <input id="cableHouseTeleCreate" type="text" class="form-control" name="cableHouseTele" maxlength="300">
        </div>
        <div class="form-group">
            <label for="cableHouseDescCreate">描述</label>
            <input id="cableHouseDescCreate" type="text" class="form-control" name="cableHouseDesc" maxlength="300">
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
            url: '${basePath}/mate/house/create',
            data: $('#createForm').serialize(),
            beforeSend: function() {
                if(isEmpty($("#cableHouseNameCreate").val())){
                    failPrompt('仓库名不能为空');
                    $('#cableModelCreate').focus();
                    return false;
                }
                if(isEmpty($("#cableHouseAddressCreate").val())){
                    failPrompt('仓库地址不能为空');
                    $('#cableSpecCreate').focus();
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