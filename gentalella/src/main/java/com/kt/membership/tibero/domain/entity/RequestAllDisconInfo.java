package com.kt.membership.tibero.domain.entity;

public class RequestAllDisconInfo {
	private String inPgEpayAcnt;
	private String inMbrId;
	private String inOrdRsnCd; //ED3 : 계좌해지(사용자초기화)
	private String outRsltCd;
	private String outRsltMsg;
	public String getInPgEpayAcnt() {
		return inPgEpayAcnt;
	}
	public void setInPgEpayAcnt(String inPgEpayAcnt) {
		this.inPgEpayAcnt = inPgEpayAcnt;
	}
	public String getInMbrId() {
		return inMbrId;
	}
	public void setInMbrId(String inMbrId) {
		this.inMbrId = inMbrId;
	}
	public String getInOrdRsnCd() {
		return inOrdRsnCd;
	}
	public void setInOrdRsnCd(String inOrdRsnCd) {
		this.inOrdRsnCd = inOrdRsnCd;
	}
	public String getOutRsltCd() {
		return outRsltCd;
	}
	public void setOutRsltCd(String outRsltCd) {
		this.outRsltCd = outRsltCd;
	}
	public String getOutRsltMsg() {
		return outRsltMsg;
	}
	public void setOutRsltMsg(String outRsltMsg) {
		this.outRsltMsg = outRsltMsg;
	}
	
	
}
