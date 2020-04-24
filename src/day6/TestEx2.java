package day6;

import java.util.Scanner;

public class TestEx2 {

	// 반복문, 조건문, break, 무한루프
	
	public static void main(String[] args) {
		/* 문자를 입력받아 입력받은 문자를 출력하세요.
		 * 
		 * 문자를 입력받아 출력하는 과정을 5번 반복하세요.
		 * 단 소문자 q를 입력하면 문자의 출력 대신 종료합니다가 출력되고
		 * 더 이상 반복되지 않도록 수정하세요. 
		 
		 * 문자를 입력받아 출력하는 과정을 q가 입력될 때까지 반복하세요.
		 * 횟수제한x
		 */
		
		Scanner scan = new Scanner(System.in);   //화면에서 입력받기
	
		char ch;
		
		for( ; ; ) { //for(int i=1; i <=5;  ){  // for(int i=0; i<5; i++) {
			System.out.print("문자를 입력하세요 : ");
			
			ch = scan.next().charAt(0);
			
			if(ch != 'q') { 
				System.out.println("입력 받은 문자 : " + ch);  //실행문이 딱 1줄이면 {} 안 해도 돼
			}else { 
				System.out.println("종료합니다." );
				break;
			}
			/*switch(ch) {
				case 'q':
					System.out.println("종료합니다.");
					break;	
			}
			*/
		}
		scan.close();
		

	}

}
