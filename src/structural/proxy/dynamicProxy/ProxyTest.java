package structural.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        RealService realService = new RealService();

        Service proxyService = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new ServiceInvocationHandler(realService)
        );

        proxyService.perform();
    }
}
