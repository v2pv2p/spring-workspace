package com.sample.di.demo2;

public class GreetingService {
	
	private KoreanGreeting ko;			// 변수정의
	private EnglishGreeting eng;			
	
	public void setEng(EnglishGreeting eng) {		// setter메소드 생성
		this.eng = eng;
	}
	
	public void setKo(KoreanGreeting ko) {
		this.ko = ko;
	}
	
	public String hello(String name) {
		String message = ko.message(name);
		return message;
	}
	
	public String bye() {
		String message = eng.goodbye();
		return message;
	}
}
