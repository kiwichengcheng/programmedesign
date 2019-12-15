package com.cc.testProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest implements InvocationHandler {

    Object o;
    public ProxyTest(Object o){
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before =====");
        method.invoke(o,args);
        System.out.println("end ======");
        return null;
    }


    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(),this);
    }




}
