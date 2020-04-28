package day8;

public class RecursiveeX2 {

	public static void main(String[] args) {
		int num =5;
		int res =1;   //0으로 하면 곱셈할 때 무의미하기에 초기값:1로 설정
		for(int i =1; i<=num; i++) {
			res *= i;  // => res = res * i;        //res += i; 누적의 합
		}
		if( num<0 )
			System.out.println(0);
		else {
			System.out.println(res);
		}
	}

}
