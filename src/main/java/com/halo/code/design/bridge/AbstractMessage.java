package com.halo.code.design.bridge;

/**
 * @Author: halo
 * @Date: 2022/7/6 下午4:17
 * @Description: 抽象消息类
 */
public class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    /**
     * 发送消息，委派给实现部分的方法
     * @param message
     * @param tuUser
     */
    public void sendMessage(String message, String tuUser) {
        this.message.send(message, tuUser);
    }
}
