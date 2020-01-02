package com.cc.pattern.structural.adapter;

import com.cc.pattern.structural.adapter.AC220;
import com.cc.pattern.structural.adapter.DC5;

public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V 输出"+adapterOutput+"V");
        return adapterOutput;
    }
}
