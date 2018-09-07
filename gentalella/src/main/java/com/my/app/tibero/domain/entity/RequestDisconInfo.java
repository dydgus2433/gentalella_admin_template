package com.my.app.tibero.domain.entity;

public class RequestDisconInfo {
	private String inPgEpayAcnt;	//간편결제 계좌처리 패키지 proxy
	private String inAcntId;	//계좌 ID
	private String inOrdTypeCd; //단말에서 요청 시 무조건 ED1을 SETTING할 것
	private String inOrdRsnCd; //ED1 : 계좌해지(PIN초기화) ED2 : 계좌해지(타 단말 로그인) ED3 : 계좌해지(사용자초기화)
	private String outRsltCd;
	private String outRsltMsg;
	public String getInPgEpayAcnt() {
		return inPgEpayAcnt;
	}
	public void setInPgEpayAcnt(String inPgEpayAcnt) {
		this.inPgEpayAcnt = inPgEpayAcnt;
	}
	public String getInAcntId() {
		return inAcntId;
	}
	public void setInAcntId(String inAcntId) {
		this.inAcntId = inAcntId;
	}
	public String getInOrdTypeCd() {
		return inOrdTypeCd;
	}
	public void setInOrdTypeCd(String inOrdTypeCd) {
		this.inOrdTypeCd = inOrdTypeCd;
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
