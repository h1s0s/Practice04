package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// Ex06 주어진 문자열의 공백을 ','(콤마) 로 변경 후 출력하세요.
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		for(int i=0; i<c.length; i++) {//수정전 문장 배열 출력
			System.out.print(c[i]);
		}
		System.out.println("");//공백
		
		for(int i=0; i<c.length; i++) {//if문으로 ' '가 있는지 검사하며, ','로 수정해주는 반복문
			if(c[i]==' ') {
				c[i]=',';
			}
		}
		
		for(int i=0; i<c.length; i++) {//수정후 문장 배열 출력
			System.out.print(c[i]);
		}
	}

}
