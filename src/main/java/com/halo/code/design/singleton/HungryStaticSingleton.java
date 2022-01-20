package com.halo.code.design.singleton;

/**
 * 饿汉式单例
 */
public class HungryStaticSingleton {

    private HungryStaticSingleton() {

    }

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
