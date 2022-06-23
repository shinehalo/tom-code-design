package com.halo.code.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: halo
 * @Date: 2022/6/22 下午5:33
 * @Description:
 */
public class CoursePackage extends CourseComponent {

    private List<CourseComponent> items = new ArrayList<CourseComponent>();

    private String name;
    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void removeChild(CourseComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CourseComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);

        for (CourseComponent catalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i ++) {
                    System.out.print("   ");
                }
                for (int i = 0; i < this.level; i ++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            catalogComponent.print();
        }
    }
}
