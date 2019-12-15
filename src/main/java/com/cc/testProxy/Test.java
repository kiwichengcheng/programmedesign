package com.cc.testProxy;

public class Test {
    public static void main(String[] args) {
        Subject subject = new ProxyTest(new RealSubject()).getProxy();
        subject.doSomething();
    }
}
