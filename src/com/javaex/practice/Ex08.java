package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		//Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
		//
		//
		int[] rottoArray = new int[6];
		for(int i=0; i<rottoArray.length; i++) {
			rottoArray[i] = (int)(Math.random()*45)+1;
		}
		for(int i=0; i<rottoArray.length; i++) {
			System.out.print(rottoArray[i]+"\t");
		}
		
		
	}
}
