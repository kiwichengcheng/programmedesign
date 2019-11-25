package com.cc.jvm;

public class Robot {
    private String name;
    public void sayHi(String helloSentence){
        System.out.println(helloSentence);
    }
    private String throwHello(String tag){
        return "Hello "+tag;
    }

    static {
        System.out.println("hello robot");
    }
}
