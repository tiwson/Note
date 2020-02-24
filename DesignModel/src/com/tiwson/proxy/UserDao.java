package com.tiwson.proxy;


/**
*代理对象
**/
public class UserDao implements IUserDao {

	public void save() {
		System.out.println("----Save Data----");
	}
}