package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//while break
		
		/*while과 for의 차이
		 *while : 조건에 true(항상 참) 넣고 계속 반복시키다가 if문 넣어서 특정 조건 충족하면 break로 탈출시키기 가능
		 *for : 1부터 10까지 이런 식으로 몇 번 도는지 알 때 쓰는 게 편함.*/
		
		//1. 6의 배수이자 14의 배수인 가장 작은 정수 찾기 --> 얼마나 돌려야 하는지 모름. 이럴 때 while.
		
		int n1=1;
		//초기값 선언을 while문 안에서 하면 계속 처음값으로 돌아가서 계산이 안 되니까 밖에 선언해야 됨.
		//n1=0이면 0나누기 결과가 0이라 바로 조건 만족해서 탈출됨.
		
		while(true) {
			if(n1%6==0 && n1%14==0) {
				System.out.println("6, 14의 배수이자 가장 작은 정수는 "+n1);
				break;
			}
			n1++;
		}
		
		//1.5. 조건 범위가 정해져 있는 경우
		
		for(int n2=1; n2<100; n2++) {
			if(n2%6==0 && n2%14==0) {
				System.out.println(n2);
				break; 
				//break 안 하면 100이내에 조건에 맞는 수가 전부 나오니까(42, 84)
				//가장 작은 수 구하려면 처음 조건 만족하고 break 되게 해야 됨. 
			}
		}
		
		//2. 숫자 입력 받아 3의 배수인지 판별. 0 입력시 종료.
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int n3=sc.nextInt();
			
			if(n3==0) { //탈출문을 처음에 안 넣으니까 0 입력시 3의 배수인 걸로 나옴.
				System.out.println("종료");
				//action=false; boolean action=true; 변수 선언하고 while 조건에 action 넣으면 break를 저렇게 넣을 수도 있음.
				break;
			}else if(n3%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		sc.close();

	}

}
