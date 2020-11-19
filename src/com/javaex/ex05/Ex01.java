package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// 랜덤함수
		
		//(int)(Math.random()*최대값)+최소값
		//num = Math.random()의 기본값은 double 0.0<=num<1.0 이기 때문에 원하는 범위값을 정하려면 int형변환 후 위처럼 해야 됨.
		
		//처음에는 변수 하나가지고 6번 돌리고(for) 출력했는데 어차피 변수가 하나라 값이 같음. (for문 적용 불가능)
		//랜덤수 6개 출력하려면 변수 6개 있어야 됨.
		
		int n01, n02, n03, n04, n05, n06;
		
		//중복무시
		n01=(int)(Math.random()*45)+1;
		n02=(int)(Math.random()*45)+1;
		n03=(int)(Math.random()*45)+1;
		n04=(int)(Math.random()*45)+1;
		n05=(int)(Math.random()*45)+1;
		n06=(int)(Math.random()*45)+1;
		
		//배열 : 배열 자체는 "new"로 생성되는 찹조 자료형. 0부터 시작함.
		//각 변수는 메모리를 각각 차지하고 있는 다른 변수지만 연속된 변수를 하나의 세트로 관리하고 싶을 때 씀.
		//각 방(메모리)과 그 값(동일한 형태만)을 한데 모아 놓음. 특정 변수를 지정하고 싶으면 방번호 [0] [1] [2]...를 쓰면 됨.
		//원래 그냥 변수는 메모리에 주소(0x74 이런 식)로 들어가 있음.
		
		System.out.print(n01+" ");
		System.out.print(n02+" ");
		System.out.print(n03+" ");
		System.out.print(n04+" ");
		System.out.print(n05+" ");
		System.out.print(n06+" ");
		
		//선언과 함께 생성 : 타입[] 변수명 = new 타입[크기] --> 모양만 알려주면 돼서[] 몇 칸짜리인지 확실하게 알리기 위해[n]
		//선언과 생성 따로 : int[] intArray; intArray = new int[5];
		//int[] intArray = new int[5] --> int형 아파트인데 int 5칸짜리 배열 선언.
		//intArray에는 8개 자료형이 아니면 다 자료형이 담김.
		
	
		
	}

}
