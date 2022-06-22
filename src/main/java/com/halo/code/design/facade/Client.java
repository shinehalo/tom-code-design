package com.halo.code.design.facade;

/**
 * @Author: halo
 * @Date: 2022/6/20 下午3:55
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.daA();
        facade.daB();
        facade.daC();
    }
}
