package com.tiwson.proxy;

/**
 * 动态代理模式
 * JDK自动代理模式
 */
public class App {
	public static void main(String[] args) {
		//底层需要代理的对象，jdk代理会自动执行该对象的save()方法
		//jdk代理，必须代理对象需要实现接口，否则不能使用jdk代理
		//如果代理对象没有实现接口，可以使用以目标对象子类的方式类实现代理,这种方法就叫做:Cglib代理
		IUserDao target = new UserDao();
		System.out.println(target.getClass());

		//绑定第一层代理，当代理执行proxy.save()时，就会执行该层代理
		IUserDao proxy = (IUserDao)new UserDaoProxy(target).getProxyInstance();
		System.out.println(proxy.getClass());

		//绑定第二层代理，当第二层代理执行proxy2.save()时，就会执行该层代理
		IUserDao proxy2 = (IUserDao)new UserDaoProxy2(proxy).getProxyInstance();
		System.out.println(proxy2.getClass());

		proxy2.save();
	}
}