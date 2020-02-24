package com.tiwson.proxy;

import com.tiwson.proxy.IUserDao;

import java.lang.reflect.*;

/**
*第一层代理，使用jdk代理
**/
public class UserDaoProxy {
	private IUserDao target;

	public UserDaoProxy(IUserDao target) {
		this.target = target;
	}

	public Object getProxyInstance(){
		//使用jdk代理Proxy
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("start proxy1");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("commit proxy1");
                        return returnValue;
                    }
                }
        );
    }
}