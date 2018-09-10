/**
 * GreetingServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hello.service.cxf;

public class GreetingServiceImplServiceLocator extends org.apache.axis.client.Service implements hello.service.cxf.GreetingServiceImplService {

    public GreetingServiceImplServiceLocator() {
    }


    public GreetingServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GreetingServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GreetingServiceImplPort
    private java.lang.String GreetingServiceImplPort_address = "http://localhost:8080/services/GreetingService";

    public java.lang.String getGreetingServiceImplPortAddress() {
        return GreetingServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GreetingServiceImplPortWSDDServiceName = "GreetingServiceImplPort";

    public java.lang.String getGreetingServiceImplPortWSDDServiceName() {
        return GreetingServiceImplPortWSDDServiceName;
    }

    public void setGreetingServiceImplPortWSDDServiceName(java.lang.String name) {
        GreetingServiceImplPortWSDDServiceName = name;
    }

    public hello.service.cxf.GreetingService getGreetingServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GreetingServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGreetingServiceImplPort(endpoint);
    }

    public hello.service.cxf.GreetingService getGreetingServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            hello.service.cxf.GreetingServiceImplServiceSoapBindingStub _stub = new hello.service.cxf.GreetingServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGreetingServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGreetingServiceImplPortEndpointAddress(java.lang.String address) {
        GreetingServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (hello.service.cxf.GreetingService.class.isAssignableFrom(serviceEndpointInterface)) {
                hello.service.cxf.GreetingServiceImplServiceSoapBindingStub _stub = new hello.service.cxf.GreetingServiceImplServiceSoapBindingStub(new java.net.URL(GreetingServiceImplPort_address), this);
                _stub.setPortName(getGreetingServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GreetingServiceImplPort".equals(inputPortName)) {
            return getGreetingServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cxf.service.hello/", "GreetingServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cxf.service.hello/", "GreetingServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GreetingServiceImplPort".equals(portName)) {
            setGreetingServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
