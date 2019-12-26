package com.cc.pattern.testProxy;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("hello world");
    }
}
