package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		// Ex04 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 그램을 작성하세요
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		//주어진 배열에서 3의 배수의 개수를 찾아라...
		int ea3 = 0;
		int sum = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i]%3==0) {//3의 배수이냐
				ea3++; //3의 배수면 ea3을 카운팅 해라
				sum=sum+data[i]; // sum에 3의 배수를 더해라
			} else {//3의 배수가 아니냐
				//아무것도 하지 않음
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+ea3);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+sum);
	}

}
