package com.halo.code.design.builder;

public class BuilderTest {

    public static void main(String[] args) {
        Course builder = new Course.Builder()
                .addName("设计模式")
                .addPpt("【PPT课件】")
                .addVideo("【回放视频】")
                .addNote("【课堂笔记】")
                .addHomework("【课后作业】")
                .builder();

        System.out.println(builder);
    }
}
