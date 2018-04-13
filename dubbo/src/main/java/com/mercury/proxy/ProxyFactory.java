package com.mercury.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @param :
 * @Date: 2018/4/13-14:20
 * @Description:
 * @return:
 */
public class ProxyFactory implements InvocationHandler{
   private Class interfaceClass;

  public ProxyFactory(Class interfaceClass) {
    this.interfaceClass = interfaceClass;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println();
    System.out.println(method);
    System.out.println("进行编码");
    System.out.println("发送网络请求");
    System.out.println("将网络请求结果进行解码并返回");
    System.out.println("进行编码");
    System.out.println("发送网络请求");
    System.out.println("将网络请求结果进行解码并返回");

    return null;
  }
  public Object  getProxyObject(){
    System.out.println(this.toString());
     return (Object) Proxy.newProxyInstance(
         this.getClass().getClassLoader(),
         new Class[]{interfaceClass},
         this
     );
  }
}
