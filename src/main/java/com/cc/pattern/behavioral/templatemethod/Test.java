package com.cc.pattern.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();


        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
    }
}
