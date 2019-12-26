package com.cc.pattern.structural.facade;

public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 通过");
        return true;
    }
}
