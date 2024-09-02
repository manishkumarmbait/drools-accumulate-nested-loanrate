package com.uncia.droolsaccumulatenestedloanrate.model;

public class AccountDtls {

	private double od;
	private int loanType;// Should be String
	private int ownership;// Should be String

	public AccountDtls() {
	}

	public AccountDtls(double od, int loanType, int ownership) {
		this.od = od;
		this.loanType = loanType;
		this.ownership = ownership;
	}

	public double getOd() {
		return od;
	}

	public void setOd(double od) {
		this.od = od;
	}

	public int getLoanType() {
		return loanType;
	}

	public void setLoanType(int loanType) {
		this.loanType = loanType;
	}

	public int getOwnership() {
		return ownership;
	}

	public void setOwnership(int ownership) {
		this.ownership = ownership;
	}

}
