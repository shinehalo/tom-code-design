package com.halo.code.design.adapter;

/**
 * @Author: halo
 * @Date: 2022/6/23 下午3:39
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
//        DC5 adapter = new PowerAdapter1();
//        adapter.output5V();

//        DC5 adapter = new PowerAdapter2(new AC220());
//        adapter.output5V();

        DC adapter = new PowerAdapter3(new AC220());
        adapter.output5V();
    }
}
