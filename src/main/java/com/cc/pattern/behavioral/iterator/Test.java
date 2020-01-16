package com.cc.pattern.behavioral.iterator;

public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("test1");
        Course course2 = new Course("test2");
        Course course3 = new Course("test3");
        Course course4 = new Course("test4");
        Course course5 = new Course("test5");

        CourseAggreate courseAggreate = new CourseAggreateImpl();
        courseAggreate.addCourse(course1);
        courseAggreate.addCourse(course2);
        courseAggreate.addCourse(course3);
        courseAggreate.addCourse(course4);
        courseAggreate.addCourse(course5);

        CourseIterator courseIterator = courseAggreate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            System.out.println(courseIterator.nextCourse());
        }

    }
}
