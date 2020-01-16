package com.cc.pattern.behavioral.iterator;

public interface CourseAggreate {
    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();
}
