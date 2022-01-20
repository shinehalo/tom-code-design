package com.halo.code.design.singleton;

import com.halo.code.design.singleton.lazy.LazyDoubleCheckSingleton;

public class ExectorThread implements Runnable {

    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
