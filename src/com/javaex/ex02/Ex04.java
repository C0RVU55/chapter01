package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//입출력 : Scanner 3
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age=sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+"이고 나이는 "+age+"입니다");
		sc.close();
		
		/*이때 이름과 나이 순서를 바꿔서 입력 받으면 버그 생겨서 제대로 안 되는데
		 *숫자 받고 엔터 치면 숫자값이 계속 유지돼서 그럼.
		 *그래서 숫자 받고 sc.nextLine(); 이거 넣으면 해결됨.
		 *숫자 받고 문자 받는데 문자값 날리고 다름 입력으로 넘어가는 거.*/

	}

}
