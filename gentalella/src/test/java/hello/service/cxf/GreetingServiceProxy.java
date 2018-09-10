package hello.service.cxf;

public class GreetingServiceProxy implements hello.service.cxf.GreetingService {
  private String _endpoint = null;
  private hello.service.cxf.GreetingService greetingService = null;
  
  public GreetingServiceProxy() {
    _initGreetingServiceProxy();
  }
  
  public GreetingServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGreetingServiceProxy();
  }
  
  private void _initGreetingServiceProxy() {
    try {
      greetingService = (new hello.service.cxf.GreetingServiceImplServiceLocator()).getGreetingServiceImplPort();
      if (greetingService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)greetingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)greetingService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (greetingService != null)
      ((javax.xml.rpc.Stub)greetingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public hello.service.cxf.GreetingService getGreetingService() {
    if (greetingService == null)
      _initGreetingServiceProxy();
    return greetingService;
  }
  
  public hello.service.cxf.Greeting sayBye(java.lang.String greetingsRequest) throws java.rmi.RemoteException{
    if (greetingService == null)
      _initGreetingServiceProxy();
    return greetingService.sayBye(greetingsRequest);
  }
  
  public hello.service.cxf.Greeting sayHello(java.lang.String greetingsRequest) throws java.rmi.RemoteException{
    if (greetingService == null)
      _initGreetingServiceProxy();
    return greetingService.sayHello(greetingsRequest);
  }
  
  
}