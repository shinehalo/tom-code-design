package com.halo.code.design.decorator;

/**
 * @Author: halo
 * @Date: 2022/6/22 下午2:43
 * @Description: 扩展套餐
 */
public abstract class BatterCakeDecorator extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
