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
            <label for="cableModelCreate">线缆型号</label>
            <input id="cableModelCreate" type="text" class="form-control" name="cableModel" maxlength="20" value="${cableModel}">
        </div>
        <div class="form-group">
            <label for="cableSpecCreate">线缆规格</label>
            <input id="cableSpecCreate" type="text" class="form-control" name="cableSpec" maxlength="20">
        </div>
        <div class="form-group">
            <label for="cablePriceCreate">推荐价格</label>
            <input id="cablePriceCreate" type="text" class="form-control" name="cablePrice" maxlength="300">
        </div>
        <div class="form-group">
            <label for="cableDesc">描述</label>
            <input id="cableDesc" type="text" class="form-control" name="cableDesc" maxlength="300">
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
            url: '${basePath}/mate/cable/create',
            data: $('#createForm').serialize(),
            beforeSend: function() {
                if(isEmpty($("#cableModelCreate").val())){
                    failPrompt('线缆型号不能为空');
                    $('#cableModelCreate').focus();
                    return false;
                }
                if(isEmpty($("#cableSpecCreate").val())){
                    failPrompt('线缆规格不能为空');
                    $('#cableSpecCreate').focus();
                    return false;
                }
                if(!checkFormat('num3',$("#cablePriceCreate").val())){
                    failPrompt('推荐价格必须是数字');
                    $('#cablePriceCreate').focus();
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