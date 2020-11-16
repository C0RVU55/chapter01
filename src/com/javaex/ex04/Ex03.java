package com.javaex.ex04;

public class Ex03 {

	public static void main(String[] args) {
		//반복문 for(초기값; 조건식; 증감식){실행내용}

		//1. 1부터 10까지의 합
		
		int sum=0; //변수를 밖에 미리 안 만들고 반복문에만 넣어두면 반복문 끝나면 없어지는 값 됨.
		
		for(int i=1; i<=10; i++) {
			sum=sum+i; //아래랑 위치 순서 주의.
			System.out.println(i+"까지의 합은 "+sum);
		}
		System.out.println("1부터 10까지의 합은 "+sum);
		/*
		while문일 경우 : int값 미리 정해놓고 조건은 i<=10
		System.out.println(i+"까지의 합은 "+(sum+i));
		sum=sum+i
		i++;
		*/
		
		//2. 중첩반복문 : 구구단 2-9단 //i는 index의 i.
		
		for(int dan=2; dan<10; dan++) {
			for(int i=1; i<10; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		
		//3. 중첩반복문 : 별
		for(int ss=1; ss<=6; ss++) {
			for(int s=1; s<=6; s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//4. 중첩반복문 : 별2
		for(int vv=1; vv<=6; vv++) {
			for(int v=0; v<vv; v++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		

		

	}

}
