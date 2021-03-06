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
            <select class="form-control" id="modelCreate" data-placeholder="请选择线缆型号" onchange="getSpecByModel();getStorage()">
                <option></option>
                <c:forEach items="${cableModels}" var="item">
                    <option value="${item}">${item}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <select class="form-control" id="specCreate" data-placeholder="请选择线缆型号" onchange="getStorage()">

            </select>
        </div>
        <div class="form-group">
            <select class="form-control" id="qualityCreate" data-placeholder="请选择线缆质量" onchange="getStorage()">
                <c:forEach items="${cableQualities}" var="item">
                    <option value="${item.qualityQuality}">${item.qualityQuality}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <select class="form-control" id="unitCreate" data-placeholder="请选择线缆单位" onchange="getStorage()">
                <c:forEach items="${units}" var="item">
                    <option value="${item}">${item}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <select class="form-control" id="colorCreate" data-placeholder="请选择线缆颜色" onchange="getStorage()">
                <c:forEach items="${cableColors}" var="item">
                    <option value="${item.colorColor}">${item.colorColor}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <select class="form-control" id="houseCreate" data-placeholder="请选择入库仓库" onchange="getStorage()">
                <c:forEach items="${cableHouses}" var="item">
                    <option value="${item.cableHouseName}">${item.cableHouseName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <%--<label for="numStorage">库存</label>--%>
            <%--<input id="numStorage" type="number" class="form-control"  maxlength="20" min="0" disabled="disabled" value="0">--%>
            <select class="form-control" id="numStorage" data-placeholder="请选择出库线缆">

            </select>
        </div>
        <div class="form-group">
            <label for="numCreate">数量</label>
            <input id="numCreate" type="number" class="form-control"  maxlength="20" min="0" onclick="setPrice()" onblur="setPrice()" onchange="setPrice()">
        </div>
        <div class="form-group">
            <label for="priceCreate">单价</label>
            <input id="priceCreate" type="number" class="form-control"  maxlength="20" min="0" onclick="setPrice()" onblur="setPrice()" onchange="setPrice()">
        </div>
        <div class="form-group">
            <label for="discountCreate" class="active">折扣</label>
            <input id="discountCreate" type="number" class="form-control"  maxlength="20" max="1" min="0" value="1" onclick="setPrice()" onblur="setPrice()" onchange="setPrice()">
        </div>
        <div class="form-group">
            <label for="countPriceCreate" class="active">小计</label>
            <input id="countPriceCreate" type="number" class="form-control"  maxlength="20" min="0">
        </div>
        <div class="form-group text-right dialog-buttons">
            <a class="waves-effect waves-button" href="javascript:;" id="subA" onclick="addRow();" disabled="disabled">保存</a>
            <a class="waves-effect waves-button" href="javascript:;" onclick="createDialog.close();">取消</a>
        </div>
    </form>
</div>
<script>

    $("select").select2();
    function getSpecByModel(){
        $.ajax({
            url: BASE_PATH + '/order/getSpecByModel',
            type: 'GET',
            async: false,
            data: {
                model: $("#modelCreate").val()
            },
            success: function(json){
                if (json.code == 1) {
                    $("#specCreate").html("");
                    var specs = json.data;
                    for(var key in specs){
                        $("#specCreate").append("<option value='"+specs[key]+"'>"+specs[key]+"</option>");
                    }
                } else {

                }

            }
        });
    }

    function setPrice(){
        if(!isEmpty($("#numCreate").val())&&!isEmpty($("#priceCreate").val())&&!isEmpty($("#discountCreate").val())){
            $("#countPriceCreate").val(numMulti(numMulti($("#numCreate").val(),$("#priceCreate").val()),$("#discountCreate").val()));
        }
    }

    function getStorage(){
        //if(!isEmpty($("#modelCreate").val())&&!isEmpty($("#specCreate").val())&&!isEmpty($("#qualityCreate").val())&&!isEmpty($("#unitCreate").val())&&!isEmpty($("#colorCreate").val())&&!isEmpty($("#houseCreate").val())){
            $.ajax({
                url: BASE_PATH + '/order/getCableStorage',
                type: 'GET',
                async: false,
                data: {
                    model: $("#modelCreate").val(),
                    spec: $("#specCreate").val(),
                    qulity: $("#qualityCreate").val(),
                    unit: $("#unitCreate").val(),
                    color: $("#colorCreate").val(),
                    house: $("#houseCreate").val()
                },
                success: function(json){
                    if (json.code == 1) {
                        $("#numStorage").html("");
                        var cableStorages = json.data;
                        for(var key in cableStorages){
                            $("#numStorage").append("<option value='"+cableStorages[key].id+"'>"+cableStorages[key].storageNumber+"</option>");
                        }
                        if(cableStorages.length==0){
                            $("#subA").attr("onclick","failAdd();");
                        }else{
                            $("#subA").attr("onclick","addRow();");
                        }
                    } else {

                    }

                }
            });
       // }
    }

    function failAdd() {
        failPrompt("库存为0，不能添加。");
        return false;
    }

</script>