package com.cctest.programmedesign.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
    @Override
    HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类的hashmap被执行");
        hashMap.put("message","hello world");
        return hashMap;
    }
}
