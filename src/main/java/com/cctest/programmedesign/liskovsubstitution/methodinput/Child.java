package com.cctest.programmedesign.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
    /*@Override
    public void method(HashMap hashMap){
        System.out.println("子类HashMap被执行");
    }*/

    public void method(Map map){//入参要比父类更宽松
        System.out.println("子类Map方法被执行");
    }
}
