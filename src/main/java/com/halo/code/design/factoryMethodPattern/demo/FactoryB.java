package com.halo.code.design.factoryMethodPattern.demo;

/**
 * 生产ProductB的具体工厂类
 */
public class FactoryB implements IFactory{

    @Override
    public IProduct makeProduct() {
        return new ProductB();
    }
}
