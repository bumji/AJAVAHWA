package day2;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch문을 이용한 홀짝 판별 예제
		//int num = 6;
		Scanner scan = new Scanner(System.in); //
		int num = scan.nextInt();
		switch(num % 2 ) {    //num을 2로 나누었을 때 나머지를 구하는 
		case 0:
			System.out.println(num + "는 짝수");
			break;
		case 1: //default:(else)
			System.out.println(num + "는 홀수");
			break;
			
		}

		
		
		
	}

}
