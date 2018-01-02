package com.zhonglianxs.erp.cpw.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CpwUtil {

    /**
     * <p>Title: getBigOrderCode</p>
     * <p>Description: 生成商城大订单号</p>
     * <p>Company: </p>
     * @author Geng Ruiyang
     * @return
     * @version: 1.0
     * @since
     * @date 2017年11月28日 下午3:48:03
     */
    public static String getBigOrderCode() {
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String seconds = new SimpleDateFormat("HHmmss").format(new Date());
        String code = date+getTwo()+"00"+seconds+getTwo();
        return code;
    }

    /**
     * 产生随机的2位数
     * @return
     */
    public static String getTwo(){
        Random rad=new Random();

        String result  = rad.nextInt(100) +"";

        if(result.length()==1){
            result = "0" + result;
        }
        return result;
    }

}
