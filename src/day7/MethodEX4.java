package day7;

import java.util.Scanner;

public class MethodEX4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printMul(num);   //ctrl+space bar 자동완성
		System.out.println("--------------------");
		int start = 19, end = 10;
		int res = printMul(num, start, end);
		if(res == 0) {
			System.out.println("0단의 모든 값은 0입니다.");
		}else if(res == -1) {
			System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다.");
		}
		scan.close();
	}


	/* 기능 : num가 주어지면 주어진 num단(구구단)을 출력하는 예제
	 * 매개변수 : num단 - int num
	 * 리턴타입 : 콘솔에 출력하고 나중에 알려줄 거 없으니까 - void
	 * 메서드명 : printMul 
	 * 재사용성이 높게
	 */
	
	public static void printMul(int num) {
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", num, i ,num*i);
		}
	
	}
	/* 기능 : num가 주어지면 주어진 num단(구구단)을 출력하는 메서드
	 * 		리턴 값을 이용하여 예외처리까지 신경쓰는 예제
	 * 매개변수 : num단, 단의 시작, 단의 끝 - int num, int start, int end
	 * (리턴타입 : 콘솔에 출력하고 나중에 알려줄 거 없으니까 - void)
	 * 리턴타입2 : 0 - 0단이 입력 -> 출력x
	 * 		     1 - 정상출력
	 *          -1 - start > end 경우 > 출력x
	 *          정수형 - int
	 * 메서드명 : printMul 
	 * 재사용성이 높게
	 */
	
	public static int printMul(int num, int start, int end) {
		if(num == 0)
			return 0;
		if(start > end)
			return -1;
		for(int i = start; i<=end; i++) {
			System.out.printf("%d x %d = %2d\n", num, i ,num*i);
		}
		return 1;
	
	}
	
	
}