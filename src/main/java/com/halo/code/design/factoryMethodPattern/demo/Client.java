package com.halo.code.design.factoryMethodPattern.demo;

/**
 * 工厂方法模式：主要解决产品扩展的问题，在简单工厂中，随着产品链的丰富，
 * 如果每个课程的创建逻辑都有区别，则工厂的职责会变得越来越多，有点像万能工厂，并不便于维护。
 * 根据单一职责原则，我们将职能继续拆分，专人干专事。
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory = new FactoryA();
        factory.makeProduct().doSomething();

        factory = new FactoryB();
        factory.makeProduct().doSomething();

        factory = new FactoryC();
        factory.makeProduct().doSomething();
    }
}
