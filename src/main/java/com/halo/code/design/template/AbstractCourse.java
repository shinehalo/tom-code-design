package com.halo.code.design.template;

/**
 * @Author: halo
 * @Date: 2022/7/22 下午3:37
 * @Description:
 */
public abstract class AbstractCourse {

    public final void createCourse() {
        postPreResoucse();

        createPPT();

        liveVideo();

        postResource();

        postHomeWork();

        if (needCheckHomeWork()) {
            checkHomeWork();
        }
    }

    protected boolean needCheckHomeWork() {
        return false;
    }

    protected void checkHomeWork() {
    }

    protected void postHomeWork() {
        System.out.println("布置作业");
    }

    protected void postResource() {
        System.out.println("上传课后资料");
    }

    protected void liveVideo() {
        System.out.println("直播授课");
    }

    protected void createPPT() {
        System.out.println("制作课件");
    }

    protected void postPreResoucse() {
        System.out.println("发布预习资料");
    }
}
