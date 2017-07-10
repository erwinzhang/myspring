package soundsystem;

import java.lang.reflect.*;

/**
 * Created by erzhang on 5/25/17.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----before----");
        Object result = method.invoke(target, args);
        System.out.println("----end----");
        return result;
    }

    public Object getProxy(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return java.lang.reflect.Proxy.newProxyInstance(loader, interfaces, this);
    }
}
