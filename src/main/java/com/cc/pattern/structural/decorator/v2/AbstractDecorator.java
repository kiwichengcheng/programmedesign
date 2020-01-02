package com.cc.pattern.structural.decorator.v2;

public class AbstractDecorator extends AbstractBattercake {

    private AbstractBattercake abstractBattercake;

    public AbstractDecorator(AbstractBattercake abstractBattercake) {
        this.abstractBattercake = abstractBattercake;
    }


    @Override
    protected String getDesc() {
        return abstractBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return abstractBattercake.cost();
    }
}
