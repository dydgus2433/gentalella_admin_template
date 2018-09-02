package com.kt.membership.tibero.domain.entity;

public class OrdListTbl {
	private String errCd; 			//00 = 성공
	private String errMsg; 			
	private String ordNo; 			//거래번호
	private String trDate; 			//거래일시
	private String pointPdCd; 		//상품코드
	private String pointPdName; 	//		상품명
	private String payTypeCd; 		//결제유형코드
	private String payTypeName; 	//결제유형명		
	private String nonDcTrAmt; 		//거래금액(할인비대상)	
	private String dcTrAmt; 		//거래금액(할인대상)	
	private String trAmt; 			//거래금액(할인대상 + 할인비대상)
	private String dcAmt; 			//할인금액
	private String payAmt; 			//계좌결제금액
	private String ordPoint; 		//사용포인트
	private String ordSttusFlag; 	//1=승인,2=취소		
	private String ordSttusName; 	//거래상태		
	private String pointCancelDate; //포인트 취소일시			
	private String epayCancelDate; 	//계좌결제취소일시		
	private String shopName; 		//가맹지점명	
	private String barcodeNo; 		//바코드	
	private String anctId; 			//계정ID
	private String bankCd; 			//은행코드
	private String bankName; 		//은행명	
	private String bankAcntNo; 		//은행계좌번호	
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
	public String getOrdNo() {
		return ordNo;
	}
	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}
	public String getTrDate() {
		return trDate;
	}
	public void setTrDate(String trDate) {
		this.trDate = trDate;
	}
	public String getPointPdCd() {
		return pointPdCd;
	}
	public void setPointPdCd(String pointPdCd) {
		this.pointPdCd = pointPdCd;
	}
	public String getPointPdName() {
		return pointPdName;
	}
	public void setPointPdName(String pointPdName) {
		this.pointPdName = pointPdName;
	}
	public String getPayTypeCd() {
		return payTypeCd;
	}
	public void setPayTypeCd(String payTypeCd) {
		this.payTypeCd = payTypeCd;
	}
	public String getPayTypeName() {
		return payTypeName;
	}
	public void setPayTypeName(String payTypeName) {
		this.payTypeName = payTypeName;
	}
	public String getNonDcTrAmt() {
		return nonDcTrAmt;
	}
	public void setNonDcTrAmt(String nonDcTrAmt) {
		this.nonDcTrAmt = nonDcTrAmt;
	}
	public String getDcTrAmt() {
		return dcTrAmt;
	}
	public void setDcTrAmt(String dcTrAmt) {
		this.dcTrAmt = dcTrAmt;
	}
	public String getTrAmt() {
		return trAmt;
	}
	public void setTrAmt(String trAmt) {
		this.trAmt = trAmt;
	}
	public String getDcAmt() {
		return dcAmt;
	}
	public void setDcAmt(String dcAmt) {
		this.dcAmt = dcAmt;
	}
	public String getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	public String getOrdPoint() {
		return ordPoint;
	}
	public void setOrdPoint(String ordPoint) {
		this.ordPoint = ordPoint;
	}
	public String getOrdSttusFlag() {
		return ordSttusFlag;
	}
	public void setOrdSttusFlag(String ordSttusFlag) {
		this.ordSttusFlag = ordSttusFlag;
	}
	public String getOrdSttusName() {
		return ordSttusName;
	}
	public void setOrdSttusName(String ordSttusName) {
		this.ordSttusName = ordSttusName;
	}
	public String getPointCancelDate() {
		return pointCancelDate;
	}
	public void setPointCancelDate(String pointCancelDate) {
		this.pointCancelDate = pointCancelDate;
	}
	public String getEpayCancelDate() {
		return epayCancelDate;
	}
	public void setEpayCancelDate(String epayCancelDate) {
		this.epayCancelDate = epayCancelDate;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getBarcodeNo() {
		return barcodeNo;
	}
	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}
	public String getAnctId() {
		return anctId;
	}
	public void setAnctId(String anctId) {
		this.anctId = anctId;
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
