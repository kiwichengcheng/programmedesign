package com.cc.jvm;

public class ClassLoaderCheck {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader my = new MyClassLoader("/Users/admin/Desktop/","myClassLoader");
        Class c = my.loadClass("Wali");
        System.out.println(c.getClassLoader());
        c.newInstance();
    }
}
