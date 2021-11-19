package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		//Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
		//
		//중복을 어떻게 처리할지 고민.. if문 안에 for을 넣어야 하는지 for안에 if를 넣을지 생각
		int[] rottoArray = new int[6];
		for(int i=0; i<rottoArray.length; i++) {
			rottoArray[i] = (int)(Math.random()*45)+1;
		}
		for(int i=0; i<rottoArray.length; i++) {
			System.out.print(rottoArray[i]+"\t");
		}
		
		
	}
}
