package day4;

import java.util.Scanner;

public class QuestEx1 {

	public static void main(String[] args) {
		/* 두 정수와 문자 하나를 입력받아 출력하는 코드를 작성하세요.
		 * 
		 * 두 정수와 문자 하나를 입력받아 = 정수형 변수 2개를 선언, 문자형 변수 1개를 선언 후
		 * Scanner를 통해 정수와 문자를 입력받을 수 있다.
		 * 
		 * 출력하는 = System.out.println을 활용할 수 있다.
		 */
		
		int num1, num2; //2개의 정수형 변수 선언
		char op; 
		//String str;
		Scanner scan = new Scanner(System.in); // system.in= 표준입력 // 후 입력받기
		System.out.print("두 정수와 문자를 입력하세요.(예: 1 + 2):");
		num1 = scan.nextInt(); //입력받음
		op = scan.next().charAt(0); //입력받은 / 문자의 / 첫번째 인덱스를 변수에 넣는다.
		//여러 문자열도 가능은 하나, 하나만 가져옴 
		//str = scan.next();
		num2 = scan.nextInt();
		//System.out.println("" + num1 + " "+ op + " "+ num2);  
		//""+ op = 문자열로 출력하게하는것. ""가 없으면 변수의 유니코드(숫자)가 연산됨. 
		
		//System.out.printf("%d %s %d\n", num1, op, num2);
		
		scan.close();
		
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		char a = scan.next().charAt(0);
	    System.out.println(a);
		*/
		
		
		
		/* 입력받은 문자가 +이면 두 수의 합을 출력하고 
		 * -이면 두 수의 차를 출력하고 
		 * /이면 두 수의 나눈 결과를 출력하고
		 * *이면 두 수의 곱한 결과를 출력하고
		 * %이면 두 수의 나머지 결과를 출력하는 코드를 작성하세요.
		 */
		
		if(op == '+') {
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2);
			//System.out.printf("%d %c %d = ", num1, op, num2);
			//System.out.println(num1 + num2); 
		}
		else if(op == '-') {
			System.out.printf("%d %c %d = %d", num1, op, num2, num1-num2);
			//System.out.println(num1 - num2);
		}
		else if(op == '/') {
			System.out.printf("%d %c %d = %.2f\n", num1, op, num2, (double)num1/num2);
			// 실수 소수점 둘째자리까지
			
			//System.out.println(num1 / num2);
		}
		else if(op == '*') {
			System.out.printf("%d %c %d = ", num1, op, num2);
			System.out.println(num1 * num2);
		}
		else if(op == '%') {
			System.out.printf("%d %c %d = ", num1, op, num2);
			System.out.println(num1 % num2);
		}
		else {
			System.out.println(op + "는 산술연산자가 아닙니다.");
		}
		
		
		//switch문으로 변경
		switch(op) {
		case '+': 
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2);
		    break;
		case '-': 
			System.out.printf("%d %c %d = %d", num1, op, num2, num1-num2);
			break;
		case '/':
			System.out.printf("%d %c %d = %.2f\n", num1, op, num2, (double)num1/num2);
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1*num2);
			break;
		case '%':
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1%num2);
			break;
		default: //
			System.out.println(op + "는 산술연산자가 아닙니다.");
	
		
		}


	}

}
