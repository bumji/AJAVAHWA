package day8;

public class TestEx1 {

	public static void main(String[] args) {
		/* 5 8 9 13 14 9 10 11
		 * 
		int num1 = 1, num2 = 2;
		int res = sum(num1,num2);
		System.out.println(res);
	} */
		int num1 = 1, num2 = 2;
		int res = sum2(num1,num2,3);
		System.out.println(res);
	}	
	public static int sum(int num1, int num2) {
		return num1 + num2;  //메서드 종료  //void면 11->12
	}
	public static int sum2(int num1, int num2, int num3) {
		return sum(num1,num2) + num3;
	}  // 5 12 13 19 20 16 17 20 13 14 15  
}
