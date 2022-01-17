package com.halo.code.design.factoryMethodPattern;

/**
 * 生产PythonCourse的具体工厂类
 */
public class PythonCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
