package com.halo.code.design.adapter;

/**
 * @Author: halo
 * @Date: 2022/6/23 下午3:37
 * @Description: 类适配器
 */
public class PowerAdapter1 extends AC220 implements DC5 {

    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter 输入AC" + adapterInput + "V，输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
