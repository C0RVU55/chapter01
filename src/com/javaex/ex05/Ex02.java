package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		// 배열
		
		int[] intArray=new int[5]; //배열 속 각 메모리의 주소(0x78 이런 형태) 대신 내가 정한 이름으로 끌어다 씀.
		
		//값 넣기
		intArray[0]=3; //배열 0번째에 3넣기. 주소에 바로 들어가는 게 아니라 내가 정한 이름(대표)을 통해서 들어감.
		intArray[1]=6;
		intArray[2]=9;
		intArray[3]=12;
		intArray[4]=55;

		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		//i는 방번호. 배열 안 변수가 1000개라면 넣을 땐 1000개 다 넣겠지만 꺼낼 땐 편함.
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]); //이렇게 하면 배열 안의 숫자를 순서대로 출력할 것.
		}
		
		
		
		
		
		
	}
}
