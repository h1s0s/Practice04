package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// Ex03 아래 코드의 출력값을 예상하고 코드로 확인해 보세요.
		//
		//출력값 예상
		//20
		//6
		//10
		//이유 intB=intA를 대입함으로 두 변수의 배열이 1개로 연결됨.
		int[] intA = {3,6,9};
		
		int[] intB;
		intB = intA;
		
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
	}

}
