package com.sample.di.demo3;

public class SampleController {
	
	private SampleDao dao;
	
	public void setDao(SampleDao dao) {
		this.dao = dao;
	}
	public void add(String id, String password) {
		// 등록작업 처리
		// SampleDao의 insert기능 사용한다.
		dao.insert(id, password);
	}
	
}
//SampleController와 SampleDao클래스 구현하기
//Bean Configuration 파일 생성하기
//Bean Configuration 파일에 객체 생성 및 조립 설정하기
//Demo3App정의하기
//Demo3App에서 SpringContainer 생성하고, 객체 꺼내서 SampleController의 add() 실행해보기
