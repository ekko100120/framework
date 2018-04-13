package com.mercury.proxy;

import org.junit.Test;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/4/13-15:43
 * @Description:
 * @return:
 */
public class TestProxy {

  @Test
  public void test(){
     ProxyFactory proxyFactory = new ProxyFactory(MenuService.class);
     MenuService menuService = (MenuService) proxyFactory.getProxyObject();
     menuService.sayHello();
  }
}
