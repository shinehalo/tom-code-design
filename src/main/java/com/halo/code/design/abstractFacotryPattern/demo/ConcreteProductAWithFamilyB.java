package com.halo.code.design.abstractFacotryPattern.demo;

/**
 * 产品族B的具体产品A
 */
public class ConcreteProductAWithFamilyB implements IProductA{

    @Override
    public void doA() {
        System.out.println("The ProductA be part of FamilyB");
    }
}
