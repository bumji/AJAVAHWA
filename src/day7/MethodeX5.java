package day7;

import java.util.Scanner;

public class MethodeX5 {

	public static void main(String[] args) {
		int num = 1;
		if(isPrime1(num)) {
			System.out.println(num+"는 소수");
		}else{
			System.out.println(num+"는 소수 아님");
		}
		if(isPrime2(num)) {
			System.out.println(num+"는 소수");
		}else {
			System.out.println(num+"는 소수 아님");
		}


	}
	/* 기능 : 주어진 정수가 소수인지 아닌지 알려주는 메서드
	 * 매개변수 : 정수 - int num(의미가 있는 최소한의 정보)
	 * 리턴타입 : 인지 아닌지 참/거짓 - boolean 
	 * 메서드명 : isPrime
	 */
	public static boolean isPrime1(int num) {
		int cnt = 0;
		if(num == 1)
			return false;
		for(int i = 2; i <num; i++) {
			if(num % i ==0) {
				cnt++;
			}
		}
		if(cnt == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPrime2(int num) {
		if(num == 1)
			return false;
		for(int i = 2; i <num; i++) {
			if(num % i ==0) {
				return false;     // '1'은 2보다 작은데 소수가 아니라서 위에서 if로 false 만들어줌
			}
		}
		return true;
	}

	
	
	
}
