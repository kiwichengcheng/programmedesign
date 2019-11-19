package com.cc.pattern.creational.singleton;

import java.io.Serializable;

public class HungrySingleton  implements Serializable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //防止序列化和反序列化的破坏
    private Object readResolve(){
        return hungrySingleton;
    }
}
