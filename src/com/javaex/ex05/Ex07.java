package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		// 배열 복사2 : 배열에 배열 대입하기.
		
		int[] arrA=new int[3];
		arrA[0]=3;
		arrA[1]=6;
		arrA[2]=9;
		
		int[] arrB; //!중요! 배열명만 선언해둠. 
		
		arrB=arrA; 
		/*arrB의 공간을 새로 만드는 게 아니라 arrA의 배열을 arrB에 대입함.
		이러면 주소값만 복사돼서 같은 데이터(메모리공간)을 바라보게 됨. 실제 데이터가 복사되는 게 아님.*/
		
		/*
		int[] arrA     int[] arrB
		□0x32          □0x32
		 │              │
		 │              │ 
		 │              │
		0x32ㅡㅡㅡㅡㅡㅡ┘
		 □  □  □ <--주소값을 복사해서 각 배열이 같은 메모리공간 공유
		[0][1][2]
		 */
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]); //arrA와 같은 데이터 출력.
		}
		
		System.out.println("-------");
		
		//특정 락커 값 변경
		arrA[1]=100;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]); //역시 똑같이 arrA와 같은 데이터 출력.
		}
		
		/*
		같은 공간을 공유하고 있기 때문에 arrB의 특정값을 바꾸면 arrA도 똑같이 바뀜.
		각 배열이 각 데이터저장공간을 갖고 있게 할지 같은 데이터공간을 공유할지 2가지 방식을 상황에 따라 써야함.
		-
		두 배열이 같으려면 배열의 개수가 같아야 하고 순서에 따른 값도 같아야 함.
		근데 본인이 만드려는 프로그램을 고려해서 '배열이 같다'를 상황에 맞게 정의해야 함. 
		배열값이 같지만 순서가 달라도 프로그램에 문제가 안 된다면 같은 배열이라고 볼 수도 있는 거.
		 */
	}

}
