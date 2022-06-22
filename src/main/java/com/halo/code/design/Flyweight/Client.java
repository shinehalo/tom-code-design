package com.halo.code.design.Flyweight;

/**
 * @Author: halo
 * @Date: 2022/6/22 下午4:12
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("深圳北", "潮汕");
        ticket.showInfo("硬座");

        ticket = TicketFactory.queryTicket("深圳北", "潮汕");
        ticket.showInfo("硬座");
    }
}
