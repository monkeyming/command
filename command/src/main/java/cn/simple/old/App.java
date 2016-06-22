package cn.simple.old;

import com.alibaba.fastjson.JSON;

import cn.simple.old.domain.PayModel;

/**
 * 模拟调用
 * 
 * @author ldm
 * @Date 2016年6月22日
 */
public class App {

	public static void main(String[] args) {
		PayModel payModel = new PayModel();
		payModel.setType(1);
		payModel.setPayType(1);
		
		OldPay oldPay = new OldPay();
		System.out.println(JSON.toJSONString(oldPay.pay(payModel))); 
	}

}
