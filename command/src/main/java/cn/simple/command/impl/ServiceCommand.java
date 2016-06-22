package cn.simple.command.impl;

import cn.simple.pay.IPay;

/**
 * 购买服务命令
 * 
 * @author ldm
 * @Date 2016年6月22日
 */
public class ServiceCommand extends AbstractPayCommand {

	public ServiceCommand(IPay pay) {
		super(pay);
	}

	@Override
	public void setPay(IPay pay) {
		this.pay = pay;
	}

	

	@Override
	public boolean cmdCallback() {
		// 支付成功操作的逻辑实现
		System.out.println("完成支付，执行回调操作");
		return true;
	}

}
