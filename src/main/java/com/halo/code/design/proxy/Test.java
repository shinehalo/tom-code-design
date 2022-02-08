package com.halo.code.design.proxy;

public class Test {

    public static void main(String[] args) {
//        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
//        zhangLaosan.findLove();

        JdkMeipo jdkMeipo = new JdkMeipo();

        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();
    }
}
