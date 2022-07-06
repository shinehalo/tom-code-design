package com.halo.code.design.bridge;

/**
 * @Author: halo
 * @Date: 2022/7/6 下午4:20
 * @Description:
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String tuUser) {
        message = "【加急】" + message;
        super.sendMessage(message, tuUser);
    }

    public Object watch(String messageId) {
        return null;
    }
}
