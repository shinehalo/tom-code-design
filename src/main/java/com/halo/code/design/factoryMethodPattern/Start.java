package com.halo.code.design.factoryMethodPattern;

public class Start {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.create().record();

        factory = new PythonCourseFactory();
        factory.create().record();
    }
}
