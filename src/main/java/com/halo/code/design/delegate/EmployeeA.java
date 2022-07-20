package com.halo.code.design.delegate;

/**
 * @Author: halo
 * @Date: 2022/7/19 下午4:52
 * @Description: 员工A
 */
public class EmployeeA implements IEmployee {

    protected String goodAt = "编程";

    @Override
    public void doing(String task) {
        System.out.println("我是员工A，我擅长" + goodAt + "，现在开始做" + task + "工作");
    }
}
