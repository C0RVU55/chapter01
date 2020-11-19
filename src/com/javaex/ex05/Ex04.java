package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		//배열 선언 방식
		
		/*
		int[] intArray1=new int[3]; 
		int[] intArray2=new int[] {3,6,9}; //배열값을 바로 대입하는데 칸수를 적으면 안 됨.
		int[] intArray3= {3,6,9}; //다 생략하는 거라 기본표현법부터 확실히 익히고 쓰는 걸 권장.
		*/
		
		//표현 방식1
		int[] intArray1=new int[3]; 
		
		intArray1[0]=3;
		intArray1[1]=6;
		intArray1[2]=9;
		
		//intArray1.length --> 3
		for(int i=0; i<intArray1.length; i++) { 
			System.out.println(intArray1[i]);
		}
		
		//칸수를 잘못 정할 경우 array index out of bound(배열 범위 벗어남)오류 뜸.
		//배열 2번 자리에 값이 없는데 2번 값을 출력할 경우 0 출력됨.
		
		//방식2
		int[] intArray2=new int[] {3,6,9};
		
		for(int j=0; j<intArray2.length; j++) {
			System.out.println(intArray2[j]);
		}
		
		//방식3
		int[] intArray3= {3,6,9};
		
		for(int k=0; k<intArray3.length; k++) {
			System.out.println(intArray3[k]);
		}
	}

}
