package ex06;

public class Ex01 {
	public static void main(String[] args) {
		//public static void main(String[] args) 에 대해
		
		/*프로그램 실행될 때 자바가 자동으로 선언하는 배열 String[] args
		
		/*
		for(int i=0; i<args.length; i++){
			System.out.println(i + "번째 값: " + args[i]);
		}
		*/
		
		if("-version".equals(args[0])) {
			System.out.println("ver 1.1, lee da hyeon");
		} 
		/*이렇게 내용을 바꾸면 버전 업데이트와 변경사항이 도스창에 반영됨. 
		다른 배열처럼 처음 시작하는 배열 args도 메모리 만듦.
		
		도스창
	c:\javaStudy\workspace\chapter01\bin>java ex06.Ex01 le ds k(여기에 아무 내용 치는데 띄어쓰기로 메모리공간 구분함) --> 실행
		0번째 값 : le
		1번째 값 : ds 
		2번째 값 : k <-- 이렇게 출력됨.
		
		
		대충 이런 상황 ▽
		String[] args
		ㅁ0x32
		  │
		  │
		  0x32
		 □le  □ds  □k <-- 이렇게 값이 대입되고 버전 업데이트 됨.
		[0]  [1]  [2]
		*/
		
		//이거 이클립스에서 실행시키기 : run > run configuration > 지금 파일 > program arguments > -version(아까 테스트한내용)
		//종료하고 실행하면 됨.
	}
	
}
