package com.mercury.proxy;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
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
