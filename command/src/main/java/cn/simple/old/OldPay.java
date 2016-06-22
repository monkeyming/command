package cn.simple.old;

import cn.simple.old.domain.PayModel;

/**
 * 现状的支付模块的实现伪代码
 * 
 * @author ldm
 * @Date 2016年6月22日
 */
public class OldPay {

	public PayModel pay(PayModel model) {

		switch (model.getPayType()) {
		case 1:
			// 余额支付
			model.setPaySuccess(payThird());
			break;
		case 2:
			// 支付宝支付
			model.setPaySuccess(payThird());
			break;
		case 3:
			// 微信支付
			model.setPaySuccess(payThird());
			break;
		case 4:
			// 网银
			model.setPaySuccess(payThird());
			break;
		default:
			model.setPaySuccess(false);
			break;
		}
		if (model.isPaySuccess()) {
			return callback(model);
		} else {
			return model;
		}
	}

	public PayModel callback(PayModel model) {
		switch (model.getType()) {
		case 1:
			// 买会员
			model.setOprSuccess(callBackOpr());
			break;
		case 2:
			// 买服务
			model.setOprSuccess(callBackOpr());
			break;
		case 3:
			// 发房
			model.setOprSuccess(callBackOpr());
			break;
		case 4:
			// 理财
			model.setOprSuccess(callBackOpr());
			break;
		default:
			model.setOprSuccess(false);
			break;
		}
		return model;
	}

	//////////////////////////// 这是模拟第三方支付的(不同的支付方会有不同的实现)/////////////////////////////
	private boolean payThird() {
		// 支付的参数配置。。。
		return true;
	}
	/////////////////////////////// 回调具体操作///////////////////////////////////
	public boolean callBackOpr()
	{
		return true;
	}

}
