package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//상수와 형변형 : 자동형변환1
		int num01=1;
		float num02=1.0F; //실수는 .0 붙여야 됨. 메모리 사용방식이 달라지기 때문에 제대로 표기해야 함.
		float result01=num01+num02;
		/*int로 해봤는데 안 됨. int가 임시적으로 float인 1.0으로 바뀌는데 이게 자동형변환.
		 * 정수형과 실수형이 있으면 실수형이 더 정확하고 큰 거.
		 * 서로 다른 형태끼리 계산하면 ppt에 있는 형변환 규칙에서 오른쪽(바이트가 큰쪽)의 형태로 자동변환됨.*/
		System.out.println(result01);
		
		//문자를 코드표 숫자로 바꿔서 계산해줌. 파이썬은 문자끼리 합하기 되는데.
		int a=1;
		char b='아';
		int re2=a+b;
		System.out.println(re2); 
		
		char q='가';
		char w='나';
		System.out.println(q+w);
		
		//자동형변환2
		long num03=12345L;
		float num04=1.1F;
		float result02=num03+num04;
		System.out.println(result02);
		
		//////////////////////////////////////////
		
		//강제형변환
		float v01=12.5F;
		int v02=(int)v01;
		int i=(int)123.456; //바꾸려는 자료형을 괄호 안에 넣음. 메모리 저장 방식을 강제로 바꾸겠다는 거.
		System.out.println(v02);
		System.out.println(i);
		//실수-->정수 : 소수점 아래 다 버림.
		
		//메모리에서는 var01, var02 각각 하나씩(총 2개) 공간을 차지하게 됨.
		float var01=12.5F;
		float var02=var01;
		System.out.println(var01);
		System.out.println(var02);
		
		/*확대변환은 변하는 게 없어서 문제없음.
		 *축소변환은 기존보다 작은 방에 들어가기 때문에 자료를 잃을 가능성이 있음.
		 *원래 숫자가 아닌 다른 숫자가 들어가게 되고 형변환 규칙 적용도 힘듦.*/
		
		//강제형변환 : 확대변환
		byte a01=10;
		int a02=(int)a01; //int 안 써도 확대변환은 자동으로 되긴 함. 큰 방으로 옮긴 거라서.
		System.out.println(a02);
		
		//강제형변환 : 축소변환(정상)
		int a03=10;
		byte a04=(byte)a03;
		System.out.println(a04);
		
		//강제형변환 : 축소변환(비정상)
		int a05=1231231; //10은 그대로 되는데 좀 큰 숫자로 하면 잘림. 앞에 바이트 다 잘리고 남는 게 출력되는 거라서.
		byte a06=(byte)a05;
		System.out.println(a06);
		
		//강제형변환 : 실수 --> 정수(소수점 이하 없어짐)
		double a07=5.57;
		int a08=(int)a07; //완전 다른 방에 집어넣은거나 마찬가지.
		System.out.println(a08);
		
		//강제형변환 : 정수 --> 실수(.0 붙여서 나오는데 숫자가 int 범위 넘어가면 다른 숫자가 나옴.)
		int a09=123123;
		double a10=(double)a09;
		System.out.println(a10);
		

	}

}
