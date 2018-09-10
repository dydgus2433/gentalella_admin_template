/**
 * GreetingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hello.service.cxf;

public interface GreetingService extends java.rmi.Remote {
    public hello.service.cxf.Greeting sayBye(java.lang.String greetingsRequest) throws java.rmi.RemoteException;
    public hello.service.cxf.Greeting sayHello(java.lang.String greetingsRequest) throws java.rmi.RemoteException;
}
