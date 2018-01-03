package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.*;
import com.zhonglianxs.erp.cpw.mapper.CableOrderMapper;
import com.zhonglianxs.erp.cpw.service.CableOrderItemService;
import com.zhonglianxs.erp.cpw.service.CableOrderService;
import com.zhonglianxs.erp.cpw.service.CableStorageService;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.CpwUtil;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import com.zhonglianxs.erp.cpw.util.UnitConstant;
import com.zhonglianxs.erp.cpw.vo.OrderInVo;
import com.zhonglianxs.erp.cpw.vo.OrderOutVo;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@BaseService
public class CableOrderServiceImpl extends BaseServiceImpl<CableOrderMapper,CableOrder,CableOrderExample> implements CableOrderService {

    @Autowired
    private CableOrderItemService cableOrderItemService;

    @Autowired
    private CableStorageService cableStorageService;

    @Override
    public BaseResult createOrder(OrderInVo orderInVo,Integer userId) {
        CableOrder cableOrder = new CableOrder();
        cableOrder.setOrderUserId(userId);
        cableOrder.setOrderCode(CpwUtil.getBigOrderCode());
        cableOrder.setOrderType(1);
        cableOrder.setOrderOtherId(orderInVo.getProviderId());
        cableOrder.setOrderOtherName(orderInVo.getProviderName());
        cableOrder.setOrderOtherContact(orderInVo.getProviderContact());
        cableOrder.setOrderOtherTele(orderInVo.getProviderTele());
        cableOrder.setOrderOtherAddress(orderInVo.getProviderAddress());
        cableOrder.setOrderOtherHouse(orderInVo.getProviderHouse());
        cableOrder.setOrderTime(new Date());
        cableOrder.setOrderTotalprice(new BigDecimal(orderInVo.getOrderPrice()));
        cableOrder.setOrderDesc(orderInVo.getOrderDesc());
        cableOrder.setOrderDelete(0);
        insertSelective(cableOrder);
        List<Map<String,Object>> items = orderInVo.getItems();
        for (Map<String,Object> item : items){
            CableOrderItem cableOrderItem = new CableOrderItem();
            cableOrderItem.setItemUserId(userId);
            cableOrderItem.setItemOrderId(cableOrder.getId());
            cableOrderItem.setItemModel(MapUtils.getString(item,"model"));
            cableOrderItem.setItemSpec(MapUtils.getString(item,"spec"));
            cableOrderItem.setItemQuality(MapUtils.getString(item,"quality"));
            cableOrderItem.setItemUnit(MapUtils.getString(item,"unit"));
            cableOrderItem.setItemColor(MapUtils.getString(item,"color"));
            cableOrderItem.setItemNumber(new BigDecimal(MapUtils.getString(item,"num")));
            cableOrderItem.setItemPrice(new BigDecimal(MapUtils.getString(item,"price")));
            cableOrderItem.setItemDiscount(new BigDecimal(MapUtils.getString(item,"discount")));
            cableOrderItem.setItemTotlePrice(new BigDecimal(MapUtils.getString(item,"count")));
            cableOrderItem.setItemHouse(MapUtils.getString(item,"house"));
            cableOrderItem.setItemDelete(0);
            cableOrderItemService.insertSelective(cableOrderItem);
            if(UnitConstant.MI.getUnit().equals(MapUtils.getString(item,"unit"))){
                CableStorage cableStorage = new CableStorage();
                cableStorage.setStorageUserId(userId);
                cableStorage.setStorageModel(MapUtils.getString(item,"model"));
                cableStorage.setStorageSpec(MapUtils.getString(item,"spec"));
                cableStorage.setStorageUnit(MapUtils.getString(item,"unit"));
                cableStorage.setStorageNumber(new BigDecimal(MapUtils.getString(item,"num")));
                cableStorage.setStorageQuality(MapUtils.getString(item,"quality"));
                cableStorage.setStorageColor(MapUtils.getString(item,"color"));
                cableStorage.setStorageProvider(orderInVo.getProviderName());
                cableStorage.setStorageUpdateTime(new Date());
                cableStorage.setStorageHouse(MapUtils.getString(item,"house"));
                cableStorage.setStorageDelete(0);
                cableStorageService.insert(cableStorage);
            }else if(UnitConstant.PAN.getUnit().equals(MapUtils.getString(item,"unit"))){
                CableStorageExample cableStorageExample = new CableStorageExample();
                cableStorageExample.createCriteria().andStorageModelEqualTo(MapUtils.getString(item,"model")).andStorageSpecEqualTo(MapUtils.getString(item,"spec")).andStorageUnitEqualTo(MapUtils.getString(item,"unit"))
                        .andStorageQualityEqualTo(MapUtils.getString(item,"quality")).andStorageColorEqualTo(MapUtils.getString(item,"color")).andStorageNumberGreaterThan(BigDecimal.ZERO).andStorageDeleteEqualTo(0);
                List<CableStorage> cableStorages = cableStorageService.selectByExample(cableStorageExample);
                if(cableStorages.size()>0){
                    CableStorage cableStorage = cableStorages.get(0);
                    cableStorage.setStorageNumber(cableStorage.getStorageNumber().add(new BigDecimal(MapUtils.getString(item,"num"))));
                    cableStorageService.updateByPrimaryKey(cableStorage);
                }else{
                    CableStorage cableStorage = new CableStorage();
                    cableStorage.setStorageUserId(userId);
                    cableStorage.setStorageModel(MapUtils.getString(item,"model"));
                    cableStorage.setStorageSpec(MapUtils.getString(item,"spec"));
                    cableStorage.setStorageUnit(MapUtils.getString(item,"unit"));
                    cableStorage.setStorageNumber(new BigDecimal(MapUtils.getString(item,"num")));
                    cableStorage.setStorageQuality(MapUtils.getString(item,"quality"));
                    cableStorage.setStorageColor(MapUtils.getString(item,"color"));
                    cableStorage.setStorageProvider(orderInVo.getProviderName());
                    cableStorage.setStorageUpdateTime(new Date());
                    cableStorage.setStorageHouse(MapUtils.getString(item,"house"));
                    cableStorage.setStorageDelete(0);
                    cableStorageService.insert(cableStorage);
                }
            }
        }
        return new BaseResult(ResultConstant.SUCCESS,new Object());
    }

    @Override
    public BaseResult createOutOrder(OrderOutVo orderOutVo, Integer userId) {
        CableOrder cableOrder = new CableOrder();
        cableOrder.setOrderUserId(userId);
        cableOrder.setOrderCode(CpwUtil.getBigOrderCode());
        cableOrder.setOrderType(2);
        cableOrder.setOrderOtherId(orderOutVo.getCustomerId());
        cableOrder.setOrderOtherName(orderOutVo.getCustomerName());
        cableOrder.setOrderOtherContact(orderOutVo.getCustomerContact());
        cableOrder.setOrderOtherTele(orderOutVo.getCustomerTele());
        cableOrder.setOrderOtherAddress(orderOutVo.getCustomerAddress());
        cableOrder.setOrderOtherHouse(orderOutVo.getCustomerHouse());
        cableOrder.setOrderTime(new Date());
        cableOrder.setOrderTotalprice(new BigDecimal(orderOutVo.getOrderPrice()));
        cableOrder.setOrderDesc(orderOutVo.getOrderDesc());
        cableOrder.setOrderDelete(0);
        insertSelective(cableOrder);
        List<Map<String,Object>> items = orderOutVo.getItems();
        for (Map<String,Object> item : items){
            CableOrderItem cableOrderItem = new CableOrderItem();
            cableOrderItem.setItemUserId(userId);
            cableOrderItem.setItemOrderId(cableOrder.getId());
            cableOrderItem.setItemModel(MapUtils.getString(item,"model"));
            cableOrderItem.setItemSpec(MapUtils.getString(item,"spec"));
            cableOrderItem.setItemQuality(MapUtils.getString(item,"quality"));
            cableOrderItem.setItemUnit(MapUtils.getString(item,"unit"));
            cableOrderItem.setItemColor(MapUtils.getString(item,"color"));
            cableOrderItem.setItemNumber(new BigDecimal(MapUtils.getString(item,"num")));
            cableOrderItem.setItemPrice(new BigDecimal(MapUtils.getString(item,"price")));
            cableOrderItem.setItemDiscount(new BigDecimal(MapUtils.getString(item,"discount")));
            cableOrderItem.setItemTotlePrice(new BigDecimal(MapUtils.getString(item,"count")));
            cableOrderItem.setItemHouse(MapUtils.getString(item,"house"));
            cableOrderItem.setItemDelete(0);
            cableOrderItemService.insertSelective(cableOrderItem);
            Integer storageId = MapUtils.getInteger(item,"storageId");
            CableStorage cableStorage = cableStorageService.selectByPrimaryKey(storageId);
            if(cableStorage==null){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return new BaseResult(ResultConstant.FAILED,new Object());
            }else{
                cableStorage.setStorageNumber(cableStorage.getStorageNumber().subtract(new BigDecimal(MapUtils.getString(item,"num"))));
                cableStorageService.updateByPrimaryKeySelective(cableStorage);
            }
        }
        return new BaseResult(ResultConstant.SUCCESS,new Object());
    }
}
