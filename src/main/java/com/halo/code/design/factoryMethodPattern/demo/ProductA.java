package com.halo.code.design.factoryMethodPattern.demo;

/**
 * 具体产品：ProductA
 */
public class ProductA implements IProduct {

    @Override
    public void doSomething() {
        System.out.println("I am Product A");
    }
}
