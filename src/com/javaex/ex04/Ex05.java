package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		// continue break
		
		//break : 계속 출력하다가 2의 배수이자 3의 배수이면 탈출.
		
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				break; // --> 중지. / continue면 10까지 다 돌아감.
				//System.out.println("break문"); --> 반복문 자체는 break 이후에 끝난 거라 다른 실행 불가능.
			}
			System.out.println(i);
		}
		System.out.println("종료"); //break했다고 프로그램이 종료되는 건 아니고 반복문만 끝남.
		
		//continue : 20까지 2의 배수와 3의 배수를 제외한 숫자 출력.
		for(int i2=1; i2<=20; i2++) {
			if(i2%2==0 || i2%3==0) {
				continue; //continue 이후로 안 넘어가고 다시 처음으로 돌아감.
			}
			System.out.println(i2);
		}
		System.out.println("종료");

		//continue 다른 표현1
		for(int i3=1; i3<=20; i3++) {
			if(i3%2==0 || i3%3==0) {
				//논리상 맞지만 여길 비워놔서 좀 잘못된 느낌이 듦. 주석이라도 달아두면 좋을 것.
			}else {
				System.out.println(i3);
			}
		}
		System.out.println("종료");
		
		//continue 다른 표현2
		for(int i4=1; i4<=20; i4++) {
			if(!(i4%2==0 || i4%3==0)) { //조건을 부정으로 바꿔서 else출력문을 if안으로 가져옴.
				System.out.println(i4);
			}
		}
	}

}
