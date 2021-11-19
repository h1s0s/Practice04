package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		//Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
		//
		//다시 짜보기. 단순하게 생각하기!!
		int[] lottoArray = new int[6];
		
		for(int i=0; i<lottoArray.length; i++) {
			lottoArray[i] = (int)(Math.random()*45)+1;
			for(int y=0; y<i; y++) {
				if(lottoArray[i]==lottoArray[y]) {
					i--;//다시 돌아가서 배열 다시
				}
			}
		}
		for(int i=0; i<lottoArray.length; i++) {//정리된 배열 출력
			System.out.print(lottoArray[i]+"\t");
		}
	}
}
