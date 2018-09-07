package com.my.app.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.MimeHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingHandlerResolver implements HandlerResolver{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingHandlerResolver.class);
	
	private String legacyName = null;

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerList = new ArrayList<>();
		handlerList.add(new LoggingHandler());
		return handlerList;
	}
	
	
	public class LoggingHandler implements SOAPHandler<SOAPMessageContext>{

	

		@Override
		public void close(MessageContext context) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean handleFault(SOAPMessageContext context) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean handleMessage(SOAPMessageContext context) {
			
			
			Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			
			if(outboundProperty.booleanValue()) {
				SOAPMessage message = context.getMessage();
				try {
					SOAPPart sp = message.getSOAPPart();
					
					ByteArrayOutputStream bout = new ByteArrayOutputStream();
					
					String header = "";
					Iterator<MimeHeader> itr= sp.getAllMimeHeaders();
					while (itr.hasNext()) {
						MimeHeader hdr = itr.next();
						header += hdr.getName() + ":" + hdr.getValue();
					}
					
					message.writeTo(bout);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return true;
		}

		@Override
		public Set<QName> getHeaders() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
