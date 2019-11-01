package com.cctest.programmedesign.singleresponsibility;

public class Bird {

    public void mainMoveMode(String birdName){
        //不遵循单一原则，加入边界判断容易引起错误，使用flyBird处理这种情况
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }
        System.out.println(birdName + "用翅膀飞");
    }
}
