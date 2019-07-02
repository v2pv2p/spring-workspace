package com.sample.di.demo4;

public class KatalkMessenger implements Messenger{

	public String receiveMessage() {
		System.out.println("카톡으로 메세지 수신하기");
		return "카카오톡: 반갑습니다.";
	}
	
	public void sendMessage(String to, String text) {
		System.out.println("카톡으로 메세지 보내기");
		System.out.println("받는사람: " + to);
		System.out.println("메세지내용: " + text);
	}

}
