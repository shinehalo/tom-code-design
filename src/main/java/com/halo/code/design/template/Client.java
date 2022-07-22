package com.halo.code.design.template;

/**
 * @Author: halo
 * @Date: 2022/7/22 下午3:53
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=========架构师课程=========");

        JavaCourse java = new JavaCourse();
        java.setNeedCheckHomeWork(true);
        java.createCourse();

        System.out.println("==========Python课程========");
        PythonCourse python = new PythonCourse();
        python.createCourse();
    }
}
