package com.halo.code.design.delegate;

/**
 * @Author: halo
 * @Date: 2022/7/19 下午4:58
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫", new Leader());
        new Boss().command("买手机", new Leader());
    }
}
