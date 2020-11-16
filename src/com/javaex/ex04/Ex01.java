package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		//반복문 while : 초기화, 조건식(결과값 참거짓), 증감식
		
		int i=0; //0부터 시작하는 경우가 많음.
		
		while(i<5) { //프로그램 전체가 아닌 반복문만 반복됨. 문제해결을 위한 조건식 만드는 일에 공을 들여야 함.
			System.out.println("I like java"+i);
			i++; //++i;도 똑같이 작동되긴 함.
		}
		
		//어설프게 하고 넘어가면 틀리니까 제대로 따져봐야 함. 총 6번 돌게 됨.
		/*i=0 0<5 --> true 출력 0 --> 1
		 *	  1<5 --> true 출력 1 --> 2
		 *    2<5 --> true 출력 2 --> 3
		 *    3<5 --> true 출력 3 --> 4
		 *    4<5 --> true 출력 4 --> 5
		 *    5<5 --> flase 반복문 탈출*/
		
		//반복이 아닌 거 같아 보이는 거에서 반복하는 규칙을 찾아야 함.

	}

}
