package com.javaex.ex01;

public class Ex04 {

	public static void main(String[] args) {
		//기본자료형 : 문자형
		
		/*클래스 이름 바꾸기 : 여기서 직접 수정하는 게 아니라 해당 class 우클릭 > refactor로 바꿈.
		 *그리고 클래스 만들 때 옵션에 체크하면 public static void- 자동으로 써줌.
		 *sysout 치고 ctrl+space 하면 출력구문 자동완성됨.*/
		
		//문자형
		char ch01='A';
		System.out.println(ch01);
		
		char ch02='한';
		System.out.println(ch02);
		
		//비교
		char ch03='6';
		System.out.println(ch03);
		/*char은 ''안에 1글자만 넣을 수 있음.
		 *''안이면 무조건 문자로 인식함.
		 *''없이 65 넣으면 A가 출력되는데, 코드표로 인식해서 오류 안 나고 A 출력함.*/
		
		//문자열 : 자료형 String에 "" 씀. 예외적인 문법.
		String str="안녕하세요";
		System.out.println(str);
		
		char str01='안';
		String str02="안";
		System.out.println(str01);
		System.out.println(str02);
		/*같은 문자형인데 글자수에 따라 쓰임이 다름. 1글자 확정이면 char.
		 *00으로 시작하는 건 int 안되니까 String.
		 *근데 주민번호 같은 건 숫자로 구분해야 되는 게 있으니까 문자열 일부를 뽑아서 숫자로 바꾸는 식으로 씀.*/
				

	}

}
