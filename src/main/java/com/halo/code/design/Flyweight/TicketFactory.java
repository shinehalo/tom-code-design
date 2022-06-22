package com.halo.code.design.Flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: halo
 * @Date: 2022/6/22 下午4:11
 * @Description:
 */
public class TicketFactory {

    private static Map<String, ITicket> sTickerPool = new ConcurrentHashMap<String, ITicket>();

    public static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (TicketFactory.sTickerPool.containsKey(key)) {
            System.out.println("使用缓存: " + key);
            return TicketFactory.sTickerPool.get(key);
        }
        System.out.println("首次查询, 创建对象: " + key);
        ITicket ticket = new TrainTicket(from, to);
        TicketFactory.sTickerPool.put(key, ticket);
        return ticket;
    }
}
