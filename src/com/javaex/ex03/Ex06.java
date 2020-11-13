package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//조건문 예제7
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		int month=sc.nextInt();
		
		switch(month) {
			case 1:
				System.out.println("31일입니다.");
				break; 
				//break 없으면 프로그램 안 멈추고 다음으로 넘어감.
				//중복되는 결과값이 많으면 30일끼리 모아서 브레이크 하나만 걸어둘 수도 있음. 근데 권장 안 함.
			case 2:
				System.out.println("28일입니다.");
				break;
			case 3:
				System.out.println("31일입니다.");
				break;
			case 4:
				System.out.println("30일입니다.");
				break;
			case 5:
				System.out.println("31일입니다.");
				break;
			case 6:
				System.out.println("30일입니다.");
				break;
			case 7:
				System.out.println("31일입니다.");
				break;
			case 8:
				System.out.println("31일입니다.");
				break;
			case 9:
				System.out.println("30일입니다.");
				break;
			case 10:
				System.out.println("31일입니다.");
				break;
			case 11:
				System.out.println("30일입니다.");
				break;
			case 12:
				System.out.println("31일입니다.");
				break;
			default:
				System.out.println("올바른 월을 입력하세요.");
				break;
		}
		
		sc.close();

	}

}
