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
		
		//3. 중첩반복문 : 별1
		for(int ss=1; ss<=6; ss++) { 
			//처음에 String s="*"나 char로 했는데 아니었음. 하긴 문자에 숫자 더하기 개념을 어떻게 적용하겠음...
			for(int s=1; s<=6; s++) { //s=0; s<6 | 순서 파악할 때 x, y 좌표로 파악할 수 있음. x먼저 돌고 y 돎.
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//4. 중첩반복문 : 별2 //y가 1번째 줄이면 x도 1개, 2번째 줄이면 x도 2개...이런 식으로 볼 수도 있음.
		for(int vv=1; vv<=6; vv++) {
			for(int v=1; v<=vv; v++) { //**y줄 번수 만큼 x축으로 실행.**
				System.out.print("*");
			}
			System.out.println("");
		}
		
		

		

	}

}
