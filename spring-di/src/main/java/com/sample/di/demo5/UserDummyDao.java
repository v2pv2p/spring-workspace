package com.sample.di.demo5;

public class UserDummyDao implements UserDao{

	public void insertUser(String name, String id, String password) {
		System.out.println(id+"님 환영합니다. 회원가입 완료!");
	}

}
