package com.halo.code.design.template;

/**
 * @Author: halo
 * @Date: 2022/7/22 下午3:50
 * @Description:
 */
public class JavaCourse extends AbstractCourse {

    private boolean needCheckHomeWork = false;

    public void setNeedCheckHomeWork(boolean needCheckHomeWork) {
        this.needCheckHomeWork = needCheckHomeWork;
    }

    @Override
    protected boolean needCheckHomeWork() {
        return this.needCheckHomeWork;
    }

    @Override
    protected void checkHomeWork() {
        System.out.println("检查 Java 作业");
    }
}
