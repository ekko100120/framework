package com.mercury.proxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/4/13-17:00
 * @Description:
 * @return:
 */
public class Check {
   private Method[] methodList;
   public boolean check() throws Exception {
     methodList = this.getClass().getClassLoader()
         .loadClass("com.mercury.proxy.MenuServiceImpl")
         .getMethods();
     for (int i = 0; i <methodList.length ; i++) {
       if (methodList[i].isAnnotationPresent(com.mercury.proxy.Mercury.class)){
         for (Annotation annotation:methodList[i].getDeclaredAnnotations()){
           System.out.println("Annotation :"+ annotation);
         }
         Mercury mercury = methodList[i].getAnnotation(Mercury.class);
         if (mercury.isBaby()==true){
           System.err.println("boby can not watching");
           throw new Exception("boby can not watching Exception");
         }
       }
     }
     return true;
   }
}
