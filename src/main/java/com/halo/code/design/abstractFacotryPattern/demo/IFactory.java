package com.halo.code.design.abstractFacotryPattern.demo;

/**
 * 抽象工厂
 */
public interface IFactory {

    IProductA makeProductA();

    IProductB makeProductB();
}
