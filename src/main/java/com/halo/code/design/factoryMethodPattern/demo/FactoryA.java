package com.halo.code.design.factoryMethodPattern.demo;

/**
 * 生产ProductA的具体工厂类
 */
public class FactoryA implements IFactory{

    @Override
    public IProduct makeProduct() {
        return new ProductA();
    }
}
