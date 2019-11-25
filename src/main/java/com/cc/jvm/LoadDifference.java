package com.cc.jvm;

public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
        /*ClassLoader classLoader = Robot.class.getClassLoader();
        System.out.println(classLoader);*/

        Class r = Class.forName("com.cc.jvm.Robot");
    }
}
