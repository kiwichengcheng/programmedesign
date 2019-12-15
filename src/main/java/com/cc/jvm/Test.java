package com.cc.jvm;

import com.cc.jvm.multithread.CallableTask;
import com.cc.jvm.multithread.NotifyThread;
import com.cc.jvm.multithread.WaitThread;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String s1 = new String("1")+new String("1");
        s1.intern();
        String s2 = "11";
        System.out.println(s1 == s2);



        int i = 1;

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
            }
        }).start();

        ExecutorService es = Executors.newCachedThreadPool();
        CallableTask task1 = new CallableTask();
        CallableTask task2 = new CallableTask();
        Future<String> result1 = es.submit(task1);
        Future<String> result2 = es.submit(task2);
        System.out.println(result1.get()+result2.get());
        es.shutdown();


        /*

        Object object = new Object();

        WaitThread waitThread = new WaitThread();
        WaitThread waitThread2 = new WaitThread();
        waitThread.setObject(object);
        waitThread2.setObject(object);
        NotifyThread notifyThread = new NotifyThread();
        notifyThread.setObject(object);

        Thread t1 = new Thread(waitThread);
        Thread t2 = new Thread(waitThread2);
        t1.start();
        t2.start();

        Thread.sleep(5000);

        notifyThread.testNotify();
        */

        Test t = new Test();
        System.out.println(t.foo(20));

    }

    public int foo(int i){
        if (i == 1){
            return 1;
        }
        if (i == 2){
            return 2;
        }
        int j = 3;
        int result1 = 1;
        int result2 = 2;
        int result = 0;
        while(j <= i){
            result = result1+result2;
            result1 = result2;
            result2 = result;
            j++;
        }
        return result;
    }
}
