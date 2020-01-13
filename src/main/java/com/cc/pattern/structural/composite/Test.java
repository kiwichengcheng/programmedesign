package com.cc.pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);
        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录",2);
        CatalogComponent mmallCourse1 = new Course("一期",55);
        CatalogComponent mmallCourse2 = new Course("二期",66);
        CatalogComponent mmallCourse3 = new Course("三期",77);
        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(mmallCourse3);

        CatalogComponent mainCourseCatalog = new CourseCatalog("主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);
        mainCourseCatalog.print();
    }
}
