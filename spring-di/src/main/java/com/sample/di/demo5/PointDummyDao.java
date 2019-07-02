package com.sample.di.demo5;

public class PointDummyDao implements PointDao{

	public void PointDao(String id, int point) {
		System.out.println(id +"님의 포인트가 "+ point +"으로 변경되었습니다.");
	}

}
