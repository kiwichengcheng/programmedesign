package com.cc.pattern.creational.singleton;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLoacalInstance
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance(){
        return threadLoacalInstance.get();
    }
}
