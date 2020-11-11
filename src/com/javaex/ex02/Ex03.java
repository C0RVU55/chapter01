package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//입출력 : Scanner 2
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num=sc.nextInt();
		
		System.out.println("입력된 숫자는"+num+"입니다");
		
		sc.close(); //빼먹지 않게 주의.

	}

}
