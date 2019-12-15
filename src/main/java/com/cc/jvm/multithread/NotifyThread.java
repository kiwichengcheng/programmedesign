package com.cc.jvm.multithread;

public class NotifyThread {
    private Object object;

    public void setObject(Object o){
        this.object = o;
    }

    public void testNotify(){
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+"start to wake up other thread");
            object.notifyAll();
            System.out.println(Thread.currentThread().getName()+" finish wake up");

        }
    }
}
