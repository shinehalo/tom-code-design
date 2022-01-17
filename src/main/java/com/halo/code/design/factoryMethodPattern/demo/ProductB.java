package com.halo.code.design.factoryMethodPattern.demo;

/**
 * 具体产品：ProductB
 */
public class ProductB implements IProduct {

    @Override
    public void doSomething() {
        System.out.println("I am Product B");
    }
}
