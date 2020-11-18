package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// do~while문
		//do{실행문}while(조건식); --> 참이든 아니든 실행문을 무조건 1번은 실행함. 조건이 뒤에 있는 while문.
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		int sum=0;
		int sum2=0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		do { //무조건 1번은 입력받아야 할 때 씀. while문은 조건 먼저 만족해야 실행 가능한데 이거는 일단 1번은 실행가능.
			num=sc.nextInt();
			sum=sum+num;
			System.out.println("합계: "+sum);
		}while(num!=0); //마침표 주의.
		System.out.println("종료");
		
		//다른 표현
		while(true) {
			num=sc.nextInt();
			sum2=sum2+num;
			System.out.println("합계: "+sum2);
			
			if(num==0) {
				break;
			}
		}
		System.out.println("종료");
		
		sc.close();
		

	}

}
