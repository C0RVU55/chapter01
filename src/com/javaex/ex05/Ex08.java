package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) { //<--스트링 배열 args를 뜻함.
		// 배열 연습
		
		//배열 2개를 선언하고 동일한지 비교.
		
		
		int[] leftArray=new int[] {10,20,30,9};
		int[] rightArray=new int[] {10,2,30,9};
		
		
		for(int i=0; i<leftArray.length; i++) {
			if(leftArray[i]==rightArray[i] && leftArray.length==rightArray.length) {
				continue;
			}else if(leftArray.length!=rightArray.length) {
				System.out.println("두 배열의 크기가 다릅니다.");
				break;
			}else if(leftArray[i]!=rightArray[i]) {
				System.out.println(i+"번째 값이 다릅니다.");
			}
		}
		
		
		//해설 : *방 개수를 먼저 비교한 뒤* 같으면 그 후부터 방 하나하나 값을 비교해봄.
		
		if(leftArray.length==rightArray.length) {
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i]!=rightArray[i]) {
					System.out.println(i+"번째 값이 다릅니다."); //배열을 바꿔서 모든 경우를 다 테스트 해봐야 됨.
				}
			}
		}else {
			System.out.println("배열의 크기가 다릅니다.");
		}
		
		
		
	}

}
