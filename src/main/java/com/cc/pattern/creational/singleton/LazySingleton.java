package com.cc.pattern.creational.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
        //无法阻止反射的破坏
        if(lazySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
