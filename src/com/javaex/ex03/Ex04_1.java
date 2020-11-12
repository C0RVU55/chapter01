package com.javaex.ex03;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		//예제1 해설 코드
		
		int pay;
		int money=10000; //변수 먼저 선언.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time=sc.nextInt();
		
		if(time>8) {
			pay=80000+(time-8)*(money+2000);
		}else {
			pay=time*money;
		}
		
		System.out.println("임금은 "+pay+"원입니다.");
		
		//위 코드를 토대로 숫자만 바꿔서 예제2 적용 가능.
		
		int pay2;
		int money2=10000;
		
		System.out.print("근무시간: ");
		int time2=sc.nextInt();
		
		if(time2>8) {
			pay2=80000+(time2-8)*(int)(money2*1.5);
		}else {
			pay2=time2*money2;
		}
		
		System.out.println("임금은 "+pay2+"원입니다.");
		
		sc.close();

	}

}
