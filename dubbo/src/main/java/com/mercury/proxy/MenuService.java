package com.mercury.proxy;

/**
 * @param :
 *
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/13-14:18
 * @Description:
 * @return:
 */

public interface MenuService {
   default void sayHello(){
     System.out.println("default implemention of MenuService");
   }
}
