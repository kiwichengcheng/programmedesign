package com.cc.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    //使用volatile可以避免在15行产生的重排序
    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //new实际上是分为3步
                    //1.分配内存
                    //2.初始化对象
                    //3.对象指向该内存，
                    // 重排序指的是第2第3步可能顺序互换，对单线程无所谓，多线程可能在单例时引起第二个线程在未初始化对象时就已经访问到内存，造成错误
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }



}
