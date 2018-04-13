package com.mercury.proxy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/4/13-17:10
 * @Description:
 * @return:
 */
public class TestRefelect {

   @Test
   public void  test() throws Exception {

     Check check = new Check();
     Assert.assertEquals(true,check.check());
   }
}
