package com.cctest.programmedesign.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);

        Base base = new Child();
        HashMap hashMap1 = new HashMap();
        base.method(hashMap1);
    }
}
