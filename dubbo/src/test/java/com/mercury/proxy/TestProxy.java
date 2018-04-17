package com.mercury.proxy;

import org.junit.Test;

/**
 * @param :
 * @author:
 * @Date: 2018/4/13-15:43
 * @Description:
 * @return:
 */
public class TestProxy {

  @Test
  public void test(){
     MenuService menuServiceImpl = new MenuServiceImpl();
     ProxyFactory proxyFactory = new ProxyFactory(menuServiceImpl);
     MenuService menuService = (MenuService) proxyFactory.getProxyObject();
     menuService.sayHello();
  }
}
