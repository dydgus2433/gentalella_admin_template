package com.my.app.adapter.cdm.custbillinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name= "bizHeader", propOrder = {
		"orderId",
		"cbSvcName",
		"cbFnName"
		
})
public class BizHeader {

	protected String orderId;
	@XmlElement(required = true)
	protected String cbSvcName;
	@XmlElement(required = true)
	protected String cbFnName;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCbSvcName() {
		return cbSvcName;
	}
	public void setCbSvcName(String cbSvcName) {
		this.cbSvcName = cbSvcName;
	}
	public String getCbFnName() {
		return cbFnName;
	}
	public void setCbFnName(String cbFnName) {
		this.cbFnName = cbFnName;
	}
	
	
}
