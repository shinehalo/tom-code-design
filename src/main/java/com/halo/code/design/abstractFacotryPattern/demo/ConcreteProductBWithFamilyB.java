package com.halo.code.design.abstractFacotryPattern.demo;

/**
 * 产品族B的具体产品B
 */
public class ConcreteProductBWithFamilyB implements IProductB{

    @Override
    public void doB() {
        System.out.println("The ProductB be part of FamilyB");
    }
}
