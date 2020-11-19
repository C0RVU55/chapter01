package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// 로또번호 업데이트 : 랜덤함수 배열 써서 for문 돌리기
		
		int n01, n02, n03, n04, n05, n06;
		
		int[] lotto=new int[6]; //칸수 정할 때 0123...처럼 생각해서 int[5]했는데 이게 아니라 총 칸수를 넣는 거.
		
		//배열명에는 8가지 자료형 이외에는 주소가 담김.
		/*칸수가 추가 되면 선언할 때 칸수를 바꾸면 되는데 나머지 for문은 다 바꾸기 힘들수도 있음.
		 *그럴 때 선언을 제외한 나머지 칸수를 변수명.length 으로 지정해놓으면 선언에서 수정한 거 다 반영됨.
		 *배열은 크기를 미리 알고 있어야 선언할 수 있는데 크기가 바뀔 때를 위해 변수명.length가 있음.
		 */
		
		/*굳이 변수 따로 선언할 필요 없고 바로 배열에 랜덤함수 넣으면 됨.
		n01=(int)(Math.random()*45)+1;
		n02=(int)(Math.random()*45)+1;
		n03=(int)(Math.random()*45)+1;
		n04=(int)(Math.random()*45)+1;
		n05=(int)(Math.random()*45)+1;
		n06=(int)(Math.random()*45)+1;
		*/
		
		lotto[0]=(int)(Math.random()*45)+1;
		lotto[1]=(int)(Math.random()*45)+1;
		lotto[2]=(int)(Math.random()*45)+1;
		lotto[3]=(int)(Math.random()*45)+1;
		lotto[4]=(int)(Math.random()*45)+1;
		lotto[5]=(int)(Math.random()*45)+1;
		
		for(int i=0; i<=5; i++) { //방번호 개념이면 i<6보단 i<=5가 가독성이 좋을 것. 
			System.out.println(lotto[i]);
		}
		
		//배열에 입력 for문으로 하기 : 안 될 때도 있음.
		for(int j=0; j<=5; j++) {
			lotto[j]=(int)(Math.random()*45)+1;
		}
		
		//그냥 출력문 6개 쓰는 건 순서 상관없음. 배열 쓰면 변수 간에 순서가 있는 거.
		for(int j=0; j<=5; j++) {
			System.out.println(lotto[j]);
		}
		
		
	}

}
