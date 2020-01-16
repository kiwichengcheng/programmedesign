package com.cc.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }
}
