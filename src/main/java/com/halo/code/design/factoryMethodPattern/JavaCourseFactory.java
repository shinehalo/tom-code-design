package com.halo.code.design.factoryMethodPattern;

/**
 * 生产JavaCourse的具体工厂类
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
