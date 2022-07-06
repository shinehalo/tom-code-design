package com.halo.code.design.bridge;

/**
 * @Author: halo
 * @Date: 2022/7/6 下午4:15
 * @Description:
 */
public class EmailMessage implements IMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送" + message + "给" + toUser);
    }
}
