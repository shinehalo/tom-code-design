package com.halo.code.design.singleton.lazy;

import java.lang.reflect.Constructor;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new ExectorThread());
//        Thread t2 = new Thread(new ExectorThread());
//
//        t1.start();
//        t2.start();
//        System.out.println("End");

        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;

            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);

            Object o1 = c.newInstance();

            Object o2 = c.newInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
