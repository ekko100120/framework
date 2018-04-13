package com.mercury.proxy;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/4/13-14:18
 * @Description:
 * @return:
 */

public interface MenuService {
   default void sayHello(){
     System.out.println("default implemention of MenuService");
   }
}
