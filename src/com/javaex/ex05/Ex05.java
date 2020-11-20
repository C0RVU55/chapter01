package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// 변수와 메모리
		
		int num=3;
		int num2=num;
		num2=7;
		
		System.out.println(num); //3이 나올 것.
		System.out.println(num2); //7이 나올 것.
		
		num=100;
		
		System.out.println(num); //100이 나올 것.
		System.out.println(num2); //7이 나올 것. 직접 대입하면 이럼.
		
		

	}

}
