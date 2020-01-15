package com.cc.pattern.structural.proxy.dynamicproxy;

import com.cc.pattern.structural.proxy.Order;
import com.cc.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        after();
        return object;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before core");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void after(){
        System.out.println("动态代理 after core");
    }
}
