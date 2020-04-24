package day6;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* a
		 * ab
		 * abc
		 * abcd
		 * 
		 * 0
		 * 01
		 * 012
		 * 0123
		 * 01234
		 */
		int num = 5;  //몇 줄짜리 만들 건지
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)('a'+j)); 
			}
			System.out.println();
		}
		
		char ch = 'a'+1;    // 문자+1은 상수와 상수 더하기는 자료형변환이 일어나지 않고 b로 된다
		//ch = (char)(ch+1);   ch+1은 문자 변수 더하기 상수는 변수ch가 정수형int로 자료형변환  / 결과가 정수
		System.out.println(ch+1);
		System.out.println((char)(ch+1));
		System.out.println("------------------");
		
		
		int row, col;
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt();
		col = scan.nextInt();
		scan.close();
		for(int i=0, cnt=1; i<row; i++) {   //int i = 0 '초기값에 따라 수식이 달라짐
			for(int j=0; j<col; j++) {
//				System.out.printf("%2d ",cnt++);
				System.out.printf("%2d ",col * i + j +1);
			}
			System.out.println();
		}
		
		for(int i=1, cnt=1; i<=row; i++) {   //int i = 0 '초기값에 따라 수식이 달라짐
			for(int j=1; j<=col; j++) {
//				System.out.printf("%2d ",cnt++);
				System.out.printf("%2d ",col * (i-1) + j );
			}
			System.out.println();
		}
	}	


}















