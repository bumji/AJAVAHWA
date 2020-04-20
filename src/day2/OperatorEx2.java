package day2;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술 연산자 예제
		System.out.println(1/2);
		System.out.println(1.0/2);
		
		int num1 = 1, num2 = 2;
		System.out.println((double)num1/num2);
		// => 자료형변환을 이용하여 변환, double 실수형
		
		//System.out.println(3/0); //에러 발생
		
		System.out.println(3/0.0);
		
		
		
		
		char ch1 = 'A';
		char ch2 = 'A' + 1;
		// A는 아스키코드에서 65를 나타냄 
		// 거기에 1 더하면 66(B)가 나온다.
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);
		// int를 char로 작아서 자동형변환 X
	
		System.out.println(ch3);

		
		
		
		
	}

}
