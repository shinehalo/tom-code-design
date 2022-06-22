package com.halo.code.design.decorator;

/**
 * @Author: halo
 * @Date: 2022/6/22 下午2:48
 * @Description:
 */
public class BatterCakeTest {

    public static void main(String[] args) {
        BatterCake batterCake;
        //买一个煎饼
        batterCake = new BaseBatterCake();
        //加一个鸡蛋
        batterCake = new EggDecorator(batterCake);
        //再加一个鸡蛋
        batterCake = new EggDecorator(batterCake);
        //再加一根香肠
        batterCake= new SausageDecorator(batterCake);

        System.out.println(batterCake.getMsg() + ",总价：" + batterCake.getPrice());
    }
}
