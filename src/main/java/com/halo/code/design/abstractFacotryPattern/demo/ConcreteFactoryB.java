package com.halo.code.design.abstractFacotryPattern.demo;

/**
 * 具体工厂类A
 */
public class ConcreteFactoryB implements IFactory{

    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFamilyB();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFamilyB();
    }
}
