package com.halo.code.design.abstractFacotryPattern;

public class JavaCourseFactory extends CourseFactory {

    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
