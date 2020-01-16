package com.cc.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggreateImpl implements CourseAggreate {

    private List courseList;

    public CourseAggreateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
