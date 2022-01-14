package com.halo.code.design.chapter03.a312;

import com.halo.code.design.chapter03.a312.demo.JavaCourse;
import com.halo.code.design.chapter03.a312.demo.JavaDiscountCourse;

/**
 * 开闭原则
 */
public class OpenCloseTest {

    public static void main(String[] args) {
        //正常价格
        JavaCourse javaCourse = new JavaCourse(1, "Spring5.0权威指南", 100.00);
        System.out.println(javaCourse.getPrice());

        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(1, "Spring5.0权威指南", 100.00);
        //原价
        System.out.println(javaDiscountCourse.getOriginPrice());
        //打折后的价格
        System.out.println(javaDiscountCourse.getPrice());
    }
}
