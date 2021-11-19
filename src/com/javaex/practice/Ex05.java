package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		double push = 0;
		double pushArray[] = new double[5];//5칸의 배열을 생성해라
		
		for(int i=0; i<pushArray.length; i++) {
			push = sc.nextDouble();//입력해라
			sum = sum+push;//입력한 값을 sum에 차곡차곡 모음
		}
		System.out.println("평균은 "+sum/5+" 입니다.");//합계의 평균을 내라
		sc.close();

	}

}
