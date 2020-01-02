package com.cc.pattern.structural.decorator.v2;

public class Test {
    public static void main(String[] args) {
        AbstractBattercake abstractBattercake = new Battercake();
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new SausageDecorator(abstractBattercake);
        System.out.println(abstractBattercake.getDesc()+" 价格："+abstractBattercake.cost());
    }
}
