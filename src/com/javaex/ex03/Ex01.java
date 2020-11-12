package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//조건문1
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수: ");
		int point=sc.nextInt();
		
		if(point>=60) { //조건문 안() 결과는 참거짓만 나와야 됨. {}안에는 참일 때 실행할 내용.
			System.out.println("합격입니다");
		}else { //if 조건을 충족하지 않을 때 내용.
			System.out.println("불합격입니다");
		}
		
		sc.close();

	}

}
