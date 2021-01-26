package cn.com.taiji.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class ProxyUseServiceJdk implements InvocationHandler {//动态daili

    public Object target;

    public ProxyUseServiceJdk(Object target){
        this.target =  target;
    }

    public Object getProxy() {
       return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Date start = new Date();
        System.out.println("before");
       Object result = method.invoke(target,args);
        System.out.println("after");
        Date end = new Date();
        System.out.println("执行时间："+(end.getTime()-start.getTime()));
        return result;
    }
}
