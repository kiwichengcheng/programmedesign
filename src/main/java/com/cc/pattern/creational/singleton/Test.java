package com.cc.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test {

    private Test(){

    }

    public static void main(String[] args) throws Exception{
        //LazySingleton lazySingleton = LazySingleton.getInstance();

        /*Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");*/

        /*
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(hungrySingleton);
        System.out.println(newInstance);
        System.out.println(hungrySingleton == newInstance);*/




        /*
        //Class objectClass = HungrySingleton.class;
        //Class objectClass = StaticInnerClassSingleton.class;

        Class objectClass = LazySingleton.class;

        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);//反射破坏构造器的权限
        //HungrySingleton instance = HungrySingleton.getInstance();
        //HungrySingleton newInstance = (HungrySingleton)constructor.newInstance();
        //StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton)constructor.newInstance();
        //StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        LazySingleton newInstance = (LazySingleton)constructor.newInstance();

        LazySingleton instance = LazySingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

        /*
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance == newInstance);
*/


        /*Class objectClass = EnumInstance.class;

        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);//反射破坏构造器的权限
        //HungrySingleton instance = HungrySingleton.getInstance();
        //HungrySingleton newInstance = (HungrySingleton)constructor.newInstance();
        //StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton)constructor.newInstance();
        //StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        EnumInstance newInstance = (EnumInstance)constructor.newInstance("test",666);*/

        EnumInstance instance = EnumInstance.getInstance();

        System.out.println(instance);
        //System.out.println(newInstance);
        //System.out.println(instance == newInstance);



        Test a = new Test(){
            protected void test(){
                System.out.println("abc");
            }
        };

    }
}
