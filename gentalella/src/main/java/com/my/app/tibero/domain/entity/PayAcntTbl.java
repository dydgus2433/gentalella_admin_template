package com.my.app.tibero.domain.entity;

public class PayAcntTbl {
	private String inPgEpayOrd; //간편결제처리 패키지 proxy
	private String errCd;
	private String errMsg;
	private String outputSeq;
	private String acntId;
	private String bankCd;
	private String bankName;
	private String bankAcntNo;
	public String getInPgEpayOrd() {
		return inPgEpayOrd;
	}
	public void setInPgEpayOrd(String inPgEpayOrd) {
		this.inPgEpayOrd = inPgEpayOrd;
	}
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
	public String getOutputSeq() {
		return outputSeq;
	}
	public void setOutputSeq(String outputSeq) {
		this.outputSeq = outputSeq;
	}
	public String getAcntId() {
		return acntId;
	}
	public void setAcntId(String acntId) {
		this.acntId = acntId;
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
	public String getBankAcntNo() {
		return bankAcntNo;
	}
	public void setBankAcntNo(String bankAcntNo) {
		this.bankAcntNo = bankAcntNo;
	}
	
	
}
