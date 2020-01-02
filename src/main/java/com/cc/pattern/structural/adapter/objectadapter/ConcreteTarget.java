package com.cc.pattern.structural.adapter.objectadapter;

import com.cc.pattern.structural.adapter.objectadapter.Target;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget方法");
    }
}
