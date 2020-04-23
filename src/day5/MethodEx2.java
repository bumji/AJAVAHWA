package day5;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		int n1, n2;
		char o;
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요(예 : 1 + 2)");
		n1 = scan.nextInt();
		o = scan.next().charAt(0);
		n2 = scan.nextInt();
		System.out.printf("%d %c %d = %.2f\n", n1, o, n2, calculate(n1,o,n2));
		scan.close();
	}
	
	
	/* 기능 : 두 정수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메서드
	 * 단, 예외 상황은 없다고 가정 (예: 잘못된 연산자가 들어오거나, 0으로 나누는 경우)
	 * 매개변수 : 두 정수와 산술연산자 -> int num1, char op, int num2
	 * 리턴타입 : 산술 연산 결과 -> 실수 double (/ 때문)
	 * 메소드명 : calculate
	 */
	
	/*
	 * 
	 * public static int res(int num1, int num2) {
	 
	 * return
	 */
	public static double calculate(int num1, char op, int num2) {
		double res = 0.0;
		switch(op) {
		case '+':   res = num1 + num2; break;
		case '-':   res = num1 - num2; break;
		case '*':   res = num1 * num2; break;
		case '%':   res = num1 % num2; break;
		case '/':   res = (double)num1 / num2; break;
		}
		return res;
		
	}
	
	}
	


