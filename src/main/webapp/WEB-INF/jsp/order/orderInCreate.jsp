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
            <select class="form-control" id="modelCreate" data-placeholder="请选择线缆型号" onchange="getSpecByModel()">
                <option></option>
                <c:forEach items="${cableModels}" var="item">
                    <option value="${item}">${item}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <select class="form-control" id="specCreate" data-placeholder="请选择线缆规格">

            </select>
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
            <a class="waves-effect waves-button" href="javascript:;" onclick="addRow();">保存</a>
            <a class="waves-effect waves-button" href="javascript:;" onclick="createDialog.close();">取消</a>
        </div>
    </form>
</div>
<script>
    $("#modelCreate").select2();
    $("#specCreate").select2();
    function getSpecByModel(that){
        $("#specCreate").html("");
        $("#specCreate").append("<option value='10001'>Jquery</option>");
    }
</script>