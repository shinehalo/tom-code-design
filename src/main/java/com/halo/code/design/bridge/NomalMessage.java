package com.halo.code.design.bridge;

/**
 * @Author: halo
 * @Date: 2022/7/6 下午4:19
 * @Description:
 */
public class NomalMessage extends AbstractMessage {

    public NomalMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String tuUser) {
        super.sendMessage(message, tuUser);
    }
}
