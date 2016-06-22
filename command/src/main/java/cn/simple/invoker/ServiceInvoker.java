package cn.simple.invoker;

import cn.simple.command.impl.AbstractPayCommand;
import cn.simple.command.impl.ServiceCommand;
import cn.simple.pay.impl.Alipay;
/**
 * 购买服务调用
 * @author ldm
 * @Date 2016年6月22日
 */
public class ServiceInvoker {
	public static void main(String[] args) {
		/**
		 * 支付方式让用户确定
		 */
		AbstractPayCommand cmd = new ServiceCommand(new Alipay());
		String result = cmd.doCommand();
		System.out.println("命令执行结果："+result);
		if (result.startsWith("1,")) {
			System.out.println("支付成功");
			if (result.endsWith("^0")) {
				System.out.println("操作失败");
			} else {
				System.out.println("操作成功");
			}
		} else {
			System.out.println("支付失败");
		}

	}
}
