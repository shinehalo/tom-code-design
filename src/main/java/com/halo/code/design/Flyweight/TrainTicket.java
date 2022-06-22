package com.halo.code.design.Flyweight;

import java.util.Random;

/**
 * @Author: halo
 * @Date: 2022/6/22 下午4:08
 * @Description:
 */
public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s->%s: %s 价格: %s 元", this.from, this.to, bunk, this.price));
    }
}
