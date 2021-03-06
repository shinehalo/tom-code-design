package com.halo.code.design.adapter;

import java.security.AccessControlContext;

/**
 * @Author: halo
 * @Date: 2022/6/23 下午4:04
 * @Description: 接口适配器
 */
public class PowerAdapter3 implements DC {

    private AC220 ac220;

    public PowerAdapter3(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter 输入AC" + adapterInput + "V，输出DC" + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
