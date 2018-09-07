package com.my.app.tibero.domain.entity;

public class BankListTbl {
	private String errCd;
	private String errMsg;
	private String bankCd;
	private String bankName;
	private String registerdFlag; // 1 = 고객이 기 등록한 은행, 0 = 신규등록 가능은행
	public String getErrCd() {
		return errCd;
	}
	public void setErrCd(String errCd) {
		this.errCd = errCd;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getBankCd() {
		return bankCd;
	}
	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getRegisterdFlag() {
		return registerdFlag;
	}
	public void setRegisterdFlag(String registerdFlag) {
		this.registerdFlag = registerdFlag;
	}
	
	
	
	
}
