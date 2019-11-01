package com.cctest.programmedesign.openclose;

//开闭原则，不改变原有接口，直接继承
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    public Double getPrice(){
        return super.getPrice()*0.8;
    }
}
