package com.cc.jvm.multithread;

public class WaitThread implements Runnable{

    public Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public void testwait() throws InterruptedException{
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+" start to wait");
            object.wait();
            System.out.println(Thread.currentThread().getName()+" is woken up");
            Thread.sleep(5000);
        }
    }

    @Override
    public void run(){
        try{
            testwait();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
