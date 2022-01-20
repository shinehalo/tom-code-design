package com.halo.code.design.abstractFacotryPattern.demo;

/**
 * 产品族A的具体产品B
 */
public class ConcreteProductBWithFamilyA implements IProductB{

    @Override
    public void doB() {
        System.out.println("The ProductB be part of FamilyA");
    }
}
