package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//반복문 while : 구구단
		
		int dan;
		int i=1; //해설 : 아예 처음부터 이렇게 선언함.
		
		//for문일 경우 : for(int i=1; i<10; i++)
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("단을 입력하세요\n단: ");
		dan=sc.nextInt();
		
		while(i<10) {
			
			System.out.println(dan+" * "+i+" = "+dan*i);
			i++; //증감식 빼먹지 않도록 주의.
		}
		
		sc.close();

	}

}
