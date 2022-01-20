package com.halo.code.design.abstractFacotryPattern.demo;

/**
 * 具体工厂类A
 */
public class ConcreteFactoryA implements IFactory{

    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFamilyA();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFamilyA();
    }
}
