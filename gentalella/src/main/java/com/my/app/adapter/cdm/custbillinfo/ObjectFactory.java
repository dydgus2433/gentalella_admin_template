package com.my.app.adapter.cdm.custbillinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
	
	private final static QName _AppName_QNAME = new QName("http://bizhub.kt.com", "appName");
	
	
	public ObjectFactory() {
		
	}
	
	public CommonHeader createCommonHeader() {
		return new CommonHeader();
	}
	
	@XmlElementDecl(namespace = "http://bizhub.kt.com", name = "commonHeader")
	public JAXBElement<CommonHeader> createCommonHeader(CommonHeader value){
		return new JAXBElement<CommonHeader>(_AppName_QNAME, CommonHeader.class, null, value);
	}
}
