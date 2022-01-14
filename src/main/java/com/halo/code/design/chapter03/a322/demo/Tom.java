package com.halo.code.design.chapter03.a322.demo;

public class Tom {

    /* 构造器注入
    private ICourse course;

    public Tom(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }
    */

    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }
}
