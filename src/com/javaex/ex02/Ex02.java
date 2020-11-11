package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//입출력 : Scanner
		
		/*
		Scanner sc=new Scanner(System.in);
		이게 기본형태. 키보드입력 받는 문법이고 변수 sc에 복합기 같은 게 들어있는거.
		처음에 Scanner를 자바 안에 있는 거 위치 알려줘야 됨. Scanner 누르고 import하면 됨.
		1번 Scanner 쓰고 sc기능 끄기 전엔 계속 쓸 수 있음.
		sc.close();
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: "); //커서 안 내려가게 개행없는 출력문.
		
		String name=sc.nextLine(); //문자형 변수명=sc.next문자형 --> 사용자가 입력한 값을 넣을 변수. sc.~가 입력값 받음. 
		//char, String은 nextLine으로 받음.
		
		System.out.println("당신의 이름은 "+name+"입니다");
		
		sc.close();
	}

}
