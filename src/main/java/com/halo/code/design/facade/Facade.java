package com.halo.code.design.facade;

/**
 * @Author: halo
 * @Date: 2022/6/20 下午3:53
 * @Description: 外观角色
 */
public class Facade {

    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    //对外接口
    public void daA() {
        this.a.doA();
    }

    //对外接口
    public void daB() {
        this.b.doB();
    }

    //对外接口B
    public void daC() {
        this.c.doC();
    }
}
