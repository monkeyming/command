package cn.simple.old.domain;

public class PayModel {
	/**
	 * 业务类型
	 */
	private int type;
	/**
	 * 支付类型
	 */
	private int payType;
	/**
	 * 支付结果
	 */
	private boolean paySuccess;
	/**
	 * 回调操结果
	 */
	private boolean oprSuccess;
	/**
	 * 支付金额
	 */
	private double amount;

	public boolean isPaySuccess() {
		return paySuccess;
	}

	public void setPaySuccess(boolean paySuccess) {
		this.paySuccess = paySuccess;
	}

	public boolean isOprSuccess() {
		return oprSuccess;
	}

	public void setOprSuccess(boolean oprSuccess) {
		this.oprSuccess = oprSuccess;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	

}
