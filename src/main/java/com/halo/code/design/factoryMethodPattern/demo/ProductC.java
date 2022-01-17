package com.halo.code.design.factoryMethodPattern.demo;

/**
 * 具体产品：ProductC
 */
public class ProductC implements IProduct {

    @Override
    public void doSomething() {
        System.out.println("I am Product C");
    }
}
