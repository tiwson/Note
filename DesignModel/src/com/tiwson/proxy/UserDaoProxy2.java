package com.tiwson.proxy;

import com.tiwson.proxy.IUserDao;

import java.lang.reflect.*;

/**
*第二层代理，使用jdk代理
**/
public class UserDaoProxy2 {
	private IUserDao target;

	public UserDaoProxy2(IUserDao target) {
		this.target = target;
	}

	public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("start proxy2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("commit proxy2");
                        return returnValue;
                    }
                }
        );
    }
}