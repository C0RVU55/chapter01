package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//입출력 : Scanner 4
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		System.out.print("나이: ");
		int age=sc.nextInt();
		
		sc.nextLine(); //숫자입력 먼저 받게 되면 필요한 거.
		
		System.out.println("이름을 입력하세요");
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		System.out.println("키를 입력하세요");
		System.out.print("키: ");
		double height=sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+", 나이는 "+age+", 키는 "+height+"(cm)입니다");
		
		System.out.println("깃허브 테스트 문장");
		sc.close();

	}

}
