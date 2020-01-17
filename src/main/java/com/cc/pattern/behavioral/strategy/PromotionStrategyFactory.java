package com.cc.pattern.behavioral.strategy;

import com.google.common.collect.Maps;

import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = Maps.newHashMap();

    static {
        PROMOTION_STRATEGY_MAP.put("LIJIAN",new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put("FANXIAN",new FanxianPromotionStrategy());
    }

    private PromotionStrategyFactory(){}
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy;
    }


}
