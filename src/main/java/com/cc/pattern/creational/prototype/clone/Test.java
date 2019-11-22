package com.cc.pattern.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0l);
        Pig pig1 = new Pig("piggy", birthday);
        Pig pig2 = (Pig)pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666666l);
        System.out.println(pig1);
        System.out.println(pig2);

        Integer integer = new Integer(1);
        System.out.println(integer == 1);
        int i = 1;
        System.out.println(i++);
        System.out.println(++i);

    }
}
