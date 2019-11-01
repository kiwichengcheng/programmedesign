package com.cctest.programmedesign.dependenceinversion;

public class Test {
    public static void main(String[] args) {

        //v1
        /*
        Geely geely = new Geely();
        geely.studyJavaCourse();
        geely.studyFECourse();*/

        /*接口方法注入
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());
        */

        //构造器注入
        Geely geely = new Geely(new JavaCourse());
        geely.studyImoocCourse();
    }
}
