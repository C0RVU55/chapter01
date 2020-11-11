package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {
		
		//기본자료형2
		//실수형
		double var01 = 3.14;
		System.out.println(var01);
		
		float var02 = 3.14f; //무조건 f 붙여야됨.
		System.out.println(var02);
		
		double var03; //메모리에 이 형태로 공간을 잡음.
		float var04;
		
		var03=0.1234567890123456789;
		var04=0.1234567890123456789F; //f 표기만 들어가고 출력은 숫자만 됨.
		System.out.println(var03);
		System.out.println(var04);
		/*double은 완전히 같진 않지만 근사값으로 가까운 수로 출력.
		 *float은 double보다 자릿수가 작아서 작은 수로 표현되기 때문에 정확성도 떨어짐.
		 *정수형은 큰 수, 실수형은 근사값 또는 더 정확한 값을 구하고자 할 때 추천.*/
		
		//변수 표현 : 2가지 방법이 값 들어가는 순서가 달라서 이 순서를 통제/조절할 수 있어야 함.
		int var11;
		var11=25;
		System.out.println(var11);
		
		int var12=25;
		System.out.println(var12);
		/*첫 번째 방법은 자료형만 정해놓은 공간이 먼저 생기고 값이 나중에 들어간다는 걸 유의해야 함.
		 *이렇게 하는 건 변수를 정해놓고 바로 값을 넣지 못하는 경우도 있어서 형태 선언만 해놔야 하는 경우 때문.*/
		
		//////////////////////////////////////////////////
		//변수 선언 --> 값 대입
		int v01;
		int v02;
		int v03;
		
		v03=25; //만약에 v03에 먼저 값을 넣어야 한다면 먼저 배치해야 함.
		v01=23;
		v02=24;
		 
		System.out.println(v03);
		System.out.println(v01);
		System.out.println(v02);
		
		//변수선언+값 대입
		/*메모리에 새 공간을 만들고 싶으면 앞에 자료형을 새로 선언하든가 자료형을 같이 써줘야 함.
		 * int v01=3; < 기존 v01값 변경
		 * int v02=3; < 또 쓰면 중복이라 오류
		 * v04=3; < 기존의 v04에 대입하겠다는 건데 아직 선언된 게 없어서 오류. 자료형 선언해야 됨.*/
		
		int v04=3;
		int v05=4;
		int v06=5;
		//다른 표기 : int v04=3, v05=4, v06=5;
		
		System.out.println(v04);
		System.out.println(v05);
		System.out.println(v06);
		
		/*만약 앞에 썼던 v01값 23을 출력하고 싶으면
		 *뒤에 v01을 다시 선언하면 안 됨. 값을 덮어쓰기하게 되니까.
		 *이 변수를 1번만 쓸 거면 후에 새로 선언해서 덮어써도 되고
		 *계속 필요하면 변수 2개 선언해서 쓰는 거고.
		 *메모리 절약하면서 효율적으로 짜기 위해 개발자가 이걸 통제할 수 있어야 함.*/
		
		
	}

}
