package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		//Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다.
		//오류 수정 후 출력결과를 예상하고 코드로 확인해보세요
		//메모
		//for 문의 i<=intArray.length 부분의 오류, 이유는 방의 수를 넘어가서 출력을 하면 오류남.
		//예상 결과 22 이유: 3+7+12
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i<intArray.length; i++) {//오류난 부분
		
			result = result + intArray[i];
		}
		System.out.println(result);
		
	}

}
