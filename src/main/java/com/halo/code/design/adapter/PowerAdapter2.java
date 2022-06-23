package com.halo.code.design.adapter;

/**
 * @Author: halo
 * @Date: 2022/6/23 下午3:41
 * @Description: 对象适配器
 */
public class PowerAdapter2 implements DC5 {

    private AC220 ac220;

    public PowerAdapter2(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter 输入AC" + adapterInput + "V，输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
