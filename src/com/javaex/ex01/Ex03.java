package com.javaex.ex01;

public class Ex03 {
	public static void main(String[] args) {
		//기본자료형 : 참거짓
		
		boolean b1=true; //true, false는 문자가 아니라 정해진 값임.
		boolean b2=false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		//실제 쓰임
		int a=3;
		int b=5;
		
		//result=a>b; < 이렇게 변수 선언했을 때 값이 참거짓 같으면 boolean 선언해야 함.
		boolean result=a>b;
		System.out.println(result);
	}
 
}
