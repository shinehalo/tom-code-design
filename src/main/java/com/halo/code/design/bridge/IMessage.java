package com.halo.code.design.bridge;

/**
 * @Author: halo
 * @Date: 2022/7/6 下午4:09
 * @Description: 实现消息发送的统一接口
 */
public interface IMessage {

    /**
     * 要发送的消息的内容和接收人
     * @param message
     * @param toUser
     */
    void send(String message, String toUser);
}
