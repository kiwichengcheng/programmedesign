package com.cctest.programmedesign.dependenceinversion;

public class Geely {

    //Test会依赖类中的方法，如果Test类中添加一个新的调用则必须修改Geely类
    /*
    public void studyJavaCourse(){
        System.out.println("Geely在学习Java课程");
    }
    public void studyFECourse(){
        System.out.println("Geely在学习前端课程");
    }*/

    private ICourse iCourse;

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }

    public Geely(ICourse iCourse){
        this.iCourse = iCourse;
    }
}
