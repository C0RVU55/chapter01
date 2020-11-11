package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {
	//시작할 때 꼭 써야함. 외우기.
		int myAge;
		myAge = 25;
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		//기본자료형 : 정수형(int 정확하게 써야함)
		int var01 = 3;
		//int var02 = -3.4; 오류나면 실행 자체가 안 됨.
		double var02 = -3.4;
		
		//메모리 크기 확인
		int var03 = 12345678;
		//byte var04 = 12345678; < byte는 127까지만 되는데 큰 수 들어가서 오류.
		//short var05 = 12345678; < 사이즈에 맞게 넣어야 함.
		long var06 = 12345678;
		System.out.println(var06);
		
		//long형
		//int var07 = 2147483648; < int범위보다 커서 오류.
		long var08 = 2147483648L; //long형에 대입이 안 됨 --> L기호 붙이면 됨.
		long var09 = 2147483647; //int 범위값보다 작으면 L 없어도 됨. 근데 헷갈리니까 그냥 다 L붙이는 게 나음.
		/*보통 int 자주 쓰이고 정확하게 쓰고 싶은 경우(나이 범위 제한 필요한 경우 등)면 byte나 
		 * 적당한 범위 가진 자료형으로 씀.
		 * 어떤 값이 나올지 측정불가한 경우 long 써도 되는 거고.
		 * 실수는 원하는 값이 입력한 대로 나온다는 보장이 없음. 근사값을 주기 때문에 대체로 맞기는 하지만 알고는 있어야 됨.
		 * 실수는 큰 값보다는 정확한 숫자를 써야할 때 큰 거 쓰는 식으로. */
		
	}

}
