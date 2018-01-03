package com.zhonglianxs.erp.cpw.service;

import com.zhonglianxs.erp.cpw.base.BaseService;
import com.zhonglianxs.erp.cpw.bean.CableOrder;
import com.zhonglianxs.erp.cpw.bean.CableOrderExample;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.vo.OrderInVo;
import com.zhonglianxs.erp.cpw.vo.OrderOutVo;

public interface CableOrderService extends BaseService<CableOrder, CableOrderExample> {

    BaseResult createOrder(OrderInVo orderInVo,Integer userId);

    BaseResult createOutOrder(OrderOutVo orderOutVo, Integer userId);

}
