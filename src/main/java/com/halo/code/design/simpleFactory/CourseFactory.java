package com.halo.code.design.simpleFactory;

/**
 * 课程工厂模式
 */
public class CourseFactory {

//    public ICourse create(String name) {
//        if ("java".equals(name)) {
//            return new JavaCourse();
//        } else if ("python".equals(name)) {
//            return new PythonCourse();
//        } else {
//            return null;
//        }
//    }

    public ICourse create(String className) {
        try {
            if (!(null == className || "".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ICourse create(Class<? extends  ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
