package com.halo.code.design.delegate;

/**
 * @Author: halo
 * @Date: 2022/7/19 下午4:57
 * @Description: 老板
 */
public class Boss {

   public void command(String task, Leader leader) {
       leader.doing(task);
   }
}
