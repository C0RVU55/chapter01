package com.javaex.ex03;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//조건문 예제456
		
		//예제4		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int point=sc.nextInt();
		
		if(point<=100&&point>=90) { //여러 조건 같이 쓰는 법.
			System.out.println("A등급");
		}else if(point>=80) {
			System.out.println("B등급");
		}else if(point>=70) {
			System.out.println("C등급");
		}else if(point>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		//예제5
		System.out.print("숫자: ");
		int num=sc.nextInt();
		
		if(num>0&&num%2==0) {
			System.out.println("짝수입니다.");
		}else if(num>0&&num%2==1){
			System.out.println("홀수입니다.");
		}else if(num==0) {
			System.out.println("0입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}
		
		//예제5 해설 : if문 안에 if문 또 넣을 수 있음.
		System.out.print("숫자: ");
		int num2=sc.nextInt();
		
		if(num2>0) {
			if(num2%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else if(num2<=0) {
			if(num2==0) {
				System.out.println("0입니다.");
			}else {
				System.out.println("음수입니다.");
			}
		}
		
		//예제6
		System.out.print("과목을 선택하세요\n(1.자바 2.C 3.C++ 4.파이썬)\n과목변호: ");
		int subject=sc.nextInt();
		
		if(subject==1) {
			System.out.println("R101호");
		}else if(subject==2) {
			System.out.println("R202호");
		}else if(subject==3) {
			System.out.println("R303호");
		}else if(subject==4) {
			System.out.println("R404호");
		}else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		
		
		sc.close();

	}

}
