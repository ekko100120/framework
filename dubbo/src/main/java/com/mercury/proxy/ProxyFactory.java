package com.mercury.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/13-14:20
 * @Description:
 * @return:
 */
public class ProxyFactory implements InvocationHandler{
   private Object target;

  public ProxyFactory(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println(method);
    System.out.println("进行编码");
    System.err.println("调用前+++++++++++++++++++++");
    Object object=method.invoke(target,args);
    System.err.println("调用后+++++++++++++++++++++");
    return object;
  }
  public Object  getProxyObject(){
    System.out.println(this.toString());
     return  Proxy.newProxyInstance(
         target.getClass().getClassLoader(),
         target.getClass().getInterfaces(),
         this
     );
  }
}
