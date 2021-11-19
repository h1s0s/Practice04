package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Ex07 키보드에서 정수로 된 돈의 액수를 입력받아 50000원권, 10000원권, 5000원권, 1000원권,
		//      500원동전, 100원동전, 50원동전, 1원동전 각 몇개로 변환되는지 작성 하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int num = sc.nextInt();
		int[] wonArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] wonEaArray = new int[10];
		
		for(int i=0; i<wonArray.length; i++) {//지폐 갯수를 계산해 변수에 넣어줄 반복문
			if(num/wonArray[i]!=0) {//입력한 금액에 지정 지폐가 들어가 있나?
				wonEaArray[i] = wonEaArray[i]+(num/wonArray[i]);
				num = num-(wonArray[i]*(num/wonArray[i]));//입력한 금액에 지정 지폐가 얼마나 들어있는지 계산하고 차감함
			} 
		}for(int i2=0; i2<wonArray.length; i2++) {//계산된 지폐 갯수를 출력해줄 반복문 
			System.out.println(wonArray[i2]+"원:"+wonEaArray[i2]+"개");
		}
		sc.close();
	}

}
