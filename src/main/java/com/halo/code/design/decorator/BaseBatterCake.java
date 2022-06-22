package com.halo.code.design.decorator;

/**
 * @Author: halo
 * @Date: 2022/6/22 下午2:37
 * @Description: 基础套餐
 */
public class BaseBatterCake extends BatterCake {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
