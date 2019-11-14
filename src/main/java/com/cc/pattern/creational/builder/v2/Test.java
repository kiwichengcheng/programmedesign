package com.cc.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("name").buildCourseVideo("video").build();
        System.out.println(course);
    }
}
