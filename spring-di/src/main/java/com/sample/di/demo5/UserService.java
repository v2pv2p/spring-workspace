package com.sample.di.demo5;

public class UserService {
	
	private UserDao userDao;
	private PointDao pointDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setPointDao(PointDao pointDao) {
		this.pointDao = pointDao;
	}
	
	public void addNewUser(String name, String id, String password) {
		// 신규회원 등록기능
		// 신규회원의 포인트를 10으로 변경하는 기능
		userDao.insertUser(name, id, password);
		pointDao.PointDao(id, 10);
	}
}
