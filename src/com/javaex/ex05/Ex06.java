package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// 배열 복사 : 각 메모리공간에 대입하기
		
		int[] arrA=new int[3];
		arrA[0]=3;
		arrA[1]=6;
		arrA[2]=9;
		
		int[] arrB=new int[3]; //intA의 값을 메모리공간에 각각 대입함.
		arrB[0]=arrA[0];
		arrB[1]=arrA[1];
		arrB[2]=arrA[2];
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("------");
		
		arrB[1]=100; //특정 메모리공간에 직접 대입해서 값 변경. 출력하면 2번째 칸이 100으로 바뀜.
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}

	}

}
