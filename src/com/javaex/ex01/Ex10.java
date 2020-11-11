package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//논리연산자(boolean) : and or not
		
		//&&
		System.out.println("---&&연산자---");
		System.out.println(true&&true); //T&&T --> T
		System.out.println(true&&false); //T&&F --> F
		System.out.println(false&&true); //F&&T --> F
		System.out.println(false&&false); //F&&F --> F
		
		System.out.println("---||연산자---");
		System.out.println(true||true); //T||T --> T
		System.out.println(true||false); //T||F --> T
		System.out.println(false||true); //F||T --> T
		System.out.println(false||false); //F||F --> F
		
		//응용
		int a=5;
		int b=7;
		
		System.out.println("---응용---");
		System.out.println((a>b)&&(a<b)); //F&&T --> F
		System.out.println((a>b)&&(a>b)); //F&&F --> F
		System.out.println((a>b)||(a<b)); //F||T --> T
		
		System.out.println("---!연산자---");
		System.out.println((a>b)); //F
		System.out.println(!(a>b)); //!F
		
		//System.out.println(!a>b); 괄호 빼면 '5의 부정 > 7' 이기 때문에 말이 안 됨.
		System.out.println(a>b&&a<b); //이거는 괄호 필요 없음 보기 편하라고 괄호 치는 거.

	}

}
