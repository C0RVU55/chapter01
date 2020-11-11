package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//ppt 예제
		
        double v01 = 5/4; //(int)5/(int)4 나 마찬가지. 결과물이 정수 1인데 double 처리해야 돼서 1.0된 거.
        //double z01=(double)(5/4); 1 --> 1.0
        System.out.println(v01);     

        double v02 = (double)5 / 4 ;  //5를 5.0으로 계산. 5.0/4 --> 1.25
        System.out.println(v02);   

        double v03 = 5 / (double)4 ;  //5/4.0 --> 1.25
        System.out.println(v03);     

        double v04 = (double)5 / (double)4 ;  //완전 double로 계산하고 싶으면 이게 정확한 거. 5.0/4.0
        System.out.println(v04);    

        int v05 = (int)1.3 + (int)1.8 ;  //소수점 아래 다 떨어져서 1+1=2 됨.
        System.out.println(v05);
        
        int v06=(int)(1.3+1.8);
        System.out.println(v06); //1.3+1.8 먼저하고 결과값을 int로 바꾼 거라 3.

	}

}
