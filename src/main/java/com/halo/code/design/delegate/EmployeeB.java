package com.halo.code.design.delegate;

/**
 * @Author: halo
 * @Date: 2022/7/19 下午4:54
 * @Description:
 */
public class EmployeeB implements IEmployee {

    protected String goodAt = "平面设计";

    @Override
    public void doing(String task) {
        System.out.println("我是员工A，我擅长" + goodAt + "，现在开始做" + task + "工作");
    }
}
