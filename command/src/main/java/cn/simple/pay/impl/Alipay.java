package cn.simple.pay.impl;

import cn.simple.pay.IPay;

public class Alipay implements IPay {

	public String doPay() {
		String result = "1,123454324653215";
		System.out.println("使用支付宝支付成功：" + result);
		return result;
	}

}
