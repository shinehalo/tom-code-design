package com.halo.code.design.factoryMethodPattern.demo;

/**
 * 生产ProductC的具体工厂类
 */
public class FactoryC implements IFactory{

    @Override
    public IProduct makeProduct() {
        return new ProductC();
    }
}
