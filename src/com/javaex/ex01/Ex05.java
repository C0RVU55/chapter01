package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		//상수와 형변형
		
		final double pi=3.14; //상수 : 실수로라도 바뀌면 안 되는 걸 지정할 때 씀.
		
		//일반적인 경우
		double result01=pi*5*5;
		System.out.println(result01);
		
		//pi값 변경
		/*
		pi=3.141519;
		double result02=pi*5*5;
		System.out.println(result02);
		*/
		
		//상수정의
		final double PI=3.14; //상수명은 (인간들끼리)암묵적으로 대문자로 정함.
		double result03=PI*5*5;
		System.out.println(result03);
				

	}

}
