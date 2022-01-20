package com.halo.code.design.abstractFacotryPattern;

public class PythonVideo implements IVideo {

    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
