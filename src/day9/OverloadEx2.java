package day9;

public class OverloadEx2 {

	public static void main(String[] args) {
		// 아래 코드는 sum 메서드에 static이 안 붙는 경우 호출하는 방법
//		OverloadEx2 obj = new OverloadEx2();  //객체 생성
//		System.out.println(obj.sum(1,2));
		System.out.println(sum(1,2));
		System.out.println(sum(1.1, 2.1));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum());
		//문자 1에 대한 유니코드 값 아스키코드값인 49가 대입 연산, 자동 자료형변환 
		System.out.println(sum('1',2,3,4,5));
//		문자열 1을 실수로 형변환 할 수 없어서 '에러발생'
//		해결:문자열 1을 정수/실수/문자로 수정 
//		해결:sum메서드를 오버로딩하여 문자열도 가능하도록 추가
//		System.out.println(sum("1",2,3,4,5));
	}
	
//	기능 : 두 정수의 합을 알려주는 메서드
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
//	기능 : 두 실수의 합을 알려주는 메서드 
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
//	기능 : 세 실수의 합을 알려주는 메서드
	public static double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
//	가변인자를 이용한 n개의 실수의 합계 메서드 (높은 재사용을 위해)
	public static double sum(double...n) {
		double res = 0.0;
		for(double tmp : n) {
			res += tmp;
		}
		return res;
	}


}
