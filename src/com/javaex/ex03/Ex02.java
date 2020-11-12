package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//조건문2(1이랑 내용 같고 마지막 출력문만 추가.)
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수: ");
		int point=sc.nextInt();
		
		if(point>=60) { 
			System.out.println("합격입니다");
		}else { 
			System.out.println("불합격입니다");
		}
		
		System.out.println("종료"); //합격이든 불합격이든 마지막에 같은 문구 출력.
		
		sc.close();

	}

}
