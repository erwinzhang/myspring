package soundsystem;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by erzhang on 5/25/17.
 */
public class ProxyTest {

    public static void testAny(Object... objects){
        System.out.println(objects[1]);
        for (Object o : objects){
            System.out.println(o.toString());
        }
    }

    public static void main(String args[]){
//        RealSubject subject = new RealSubject();
//        FakeSubject fake = new FakeSubject();
//        Proxy p = new Proxy(fake);
//        p.request();
//        System.out.println("EE");


//        Service service = new UserServiceImpl();
//        MyInvocationHandler handler = new MyInvocationHandler(service);
//        Service serviceProxy = (Service)handler.getProxy();
//        serviceProxy.add();;
        testAny("1","3", "4");
        System.out.println(Objects.nonNull("1"));
    }
}
