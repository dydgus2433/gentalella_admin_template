package com.kt.membership.tibero.domain.entity;

public class KtPayerInfoTbl {

	private String errCd;
	private String errMsg;
	private String payerGb; //0= 등록가능 , 1= 세틀거래은행 아님, 2= 명의자 상이, 3= 기가입 은행, (공통코드정의 필요)
	private String RealAcntNo;
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
	public String getPayerGb() {
		return payerGb;
	}
	public void setPayerGb(String payerGb) {
		this.payerGb = payerGb;
	}
	public String getRealAcntNo() {
		return RealAcntNo;
	}
	public void setRealAcntNo(String realAcntNo) {
		RealAcntNo = realAcntNo;
	}
	
	
}
