package com.halo.code.design.abstractFacotryPattern.demo;

/**
 * 产品族A的具体产品A
 */
public class ConcreteProductAWithFamilyA implements IProductA{

    @Override
    public void doA() {
        System.out.println("The ProductA be part of FamilyA");
    }
}
