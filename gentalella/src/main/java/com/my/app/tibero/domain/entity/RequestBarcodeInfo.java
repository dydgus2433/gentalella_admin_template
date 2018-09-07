package com.my.app.tibero.domain.entity;

public class RequestBarcodeInfo {
	private String inPgEpayOrd; 
	private String inAcntId; //단말에 출력된 계좌들 중 선택한 계좌
	private String inEpayType; // 1= 복합결제, 2 = 계좌Only결제
	private String outRsltCd; // -- = 성공
	private String outRsltMsg;
	private String outBarcode;
	private String outAllocTime; //결제 시작
	private String outDueExpireTime;//결제 만료
	
	public String getInAcntId() {
		return inAcntId;
	}
	public void setInAcntId(String inAcntId) {
		this.inAcntId = inAcntId;
	}
	public String getInEpayType() {
		return inEpayType;
	}
	public void setInEpayType(String inEpayType) {
		this.inEpayType = inEpayType;
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
	public String getOutBarcode() {
		return outBarcode;
	}
	public void setOutBarcode(String outBarcode) {
		this.outBarcode = outBarcode;
	}
	public String getOutAllocTime() {
		return outAllocTime;
	}
	public void setOutAllocTime(String outAllocTime) {
		this.outAllocTime = outAllocTime;
	}
	public String getOutDueExpireTime() {
		return outDueExpireTime;
	}
	public void setOutDueExpireTime(String outDueExpireTime) {
		this.outDueExpireTime = outDueExpireTime;
	}
	public String getInPgEpayOrd() {
		return inPgEpayOrd;
	}
	public void setInPgEpayOrd(String inPgEpayOrd) {
		this.inPgEpayOrd = inPgEpayOrd;
	}
	
	
}
