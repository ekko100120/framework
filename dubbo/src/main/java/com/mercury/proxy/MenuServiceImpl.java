package com.mercury.proxy;

/**
 * @param :
 * @author: 62083 【makai@casco.com.cn】
 * @Date: 2018/4/13-14:20
 * @Description:
 * @return:
 */
public class MenuServiceImpl implements MenuService {

  @Override
  @Mercury(isBaby = true)
  public void sayHello() {
    System.out.println("first implemention of MenuService");
  }
}
