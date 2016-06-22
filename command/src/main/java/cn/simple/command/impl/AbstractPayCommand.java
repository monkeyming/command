package cn.simple.command.impl;

import cn.simple.command.ICommand;
import cn.simple.pay.IPay;

/**
 * 命令抽象类
 * 
 * @author ldm
 * @Date 2016年6月22日
 */
public abstract class AbstractPayCommand implements ICommand {
	protected IPay pay;

	public AbstractPayCommand(IPay pay) {
		this.pay = pay;
	}

	public abstract void setPay(IPay pay);

	/**
	 * 执行命令
	 * 
	 * @author ldm
	 * @return
	 * @Date 2016年6月22日
	 */
	public String doCommand() {
		System.out.println("执行命令");
		String payResult = pay.doPay();
		if (payResult.startsWith("1,")) {
			boolean cb = cmdCallback();
			if (cb) {
				payResult += "^1";
			} else {
				payResult += "^0";
			}

			return payResult;
		} else {
			return "^0";
		}

	}

	/**
	 * 命令回调
	 * 
	 * @author ldm
	 * @return
	 * @Date 2016年6月22日
	 */
	public abstract boolean cmdCallback();
}
