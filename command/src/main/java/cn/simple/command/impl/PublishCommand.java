package cn.simple.command.impl;

import cn.simple.pay.IPay;

public class PublishCommand extends AbstractPayCommand {

	public PublishCommand(IPay pay) {
		super(pay);
	}

	@Override
	public void setPay(IPay pay) {
		super.pay = pay;
	}

	

	@Override
	public boolean cmdCallback() {
		// TODO Auto-generated method stub
		return false;
	}

}
