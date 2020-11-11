package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		//입출력1
		
		int i=2345;
		double d=3.14;
		String str="굿모닝";
		char c='한';
		String s="한";
		
		String name="이다현";
		
		//프린트문에 넣기
		System.out.println("문자열 출력하고 싶으면 프린트문에 큰따옴표로 넣어도 됨.");
		System.out.println(str);
		
		//개행 유무
		System.out.print("안녕");
		System.out.print("하세요!");
		System.out.println("11/11 빼빼로데이"); //println이면 다음 출력문이 다음 단으로 넘어감.
		
		//사칙연산 가능
		System.out.println(2+5);
		System.out.println(i+5);
		System.out.println(i+i);
		
		System.out.println(i+d); //자동형변환 int --> double
		double result=i+d; //변수 새로 선언한다고 해서 더 좋거나 한 건 아닌데 쓰임에 따라 선언할지 말지 정하는 거.
		System.out.println(result);
		
		//문자간 더하기
		System.out.println(str+str+str);
		System.out.println(i+str); //int를 String처리함.
		System.out.println(str+d); //double을 String처리함.
		String qwe=str+d;
		System.out.println(qwe);
		
		//굿모닝 랑 2345
		System.out.println(str+" 랑 "+i); //한번에 하려고 하지말고 세부적으로 나눠서 진행해야 오류났을 때 파악하기 쉬움.
		
		//제 이름은 이다현입니다. --> 변수와 문자 구분 주의
		System.out.println("제 이름은 "+name+"입니다.");
		
		//char : char은 문자가 아니라 메모리에 문자코드표 숫자로 저장돼서 사칙연산하면 숫자로 나옴.
		char a='a';
		char b='b';
		System.out.println(a+b); //char는 a+b 들어간 변수 선언 안 되고 더해도 결과값은 숫자.
		
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(c+s); //String이 있어서 다 String 취급함.
		
		//안녕"하"세요
		System.out.println("안녕\"하\"세요"); //큰따옴표 \"
		System.out.println("안녕\\하\\세요"); //역슬래시 \\
		System.out.println("안녕\n하세요"); //개행 \n
		System.out.println("\t안녕\t하세요"); //탭 들여쓰기 \t
		

	}

}
