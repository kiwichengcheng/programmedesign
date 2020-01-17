package com.cc.pattern.behavioral.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销");
    }
}
