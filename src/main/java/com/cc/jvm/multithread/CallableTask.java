package com.cc.jvm.multithread;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "hello";
    }
}