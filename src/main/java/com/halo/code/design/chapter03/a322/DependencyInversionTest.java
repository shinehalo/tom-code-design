package com.halo.code.design.chapter03.a322;

import com.halo.code.design.chapter03.a322.demo.JavaCourse;
import com.halo.code.design.chapter03.a322.demo.PythonCourse;
import com.halo.code.design.chapter03.a322.demo.Tom;

/**
 * 依赖倒置原则
 */
public class DependencyInversionTest {

    public static void main(String[] args) {
        // 构造器方式注入
//        Tom tom = new Tom(new JavaCourse());
//        tom.study();

        // setter方式注入
        Tom tom = new Tom();
        tom.setCourse(new JavaCourse());
        tom.study();

        tom.setCourse(new PythonCourse());
        tom.study();
    }
}
