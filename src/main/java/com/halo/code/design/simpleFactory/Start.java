package com.halo.code.design.simpleFactory;

public class Start {

    public static void main(String[] args) {
        //直接创建
//        ICourse course = new JavaCourse();
//        course.record();

        //以下是简单工厂方法创建
        CourseFactory courseFactory = new CourseFactory();

//        ICourse course = courseFactory.create("java");

//        ICourse course = courseFactory.create("com.halo.code.design.simpleFactory.JavaCourse");

        ICourse course = courseFactory.create(PythonCourse.class);
        course.record();
    }
}
