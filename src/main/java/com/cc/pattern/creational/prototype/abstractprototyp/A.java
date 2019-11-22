package com.cc.pattern.creational.prototype.abstractprototyp;

public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
