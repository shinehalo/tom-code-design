package com.halo.code.design.bridge;

/**
 * @Author: halo
 * @Date: 2022/7/6 下午4:21
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NomalMessage(message);
        abstractMessage.sendMessage("加班申请速批", "王总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请速批", "王总");
    }
}
