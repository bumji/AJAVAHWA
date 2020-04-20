package day2;

public class ForEx2 {

	public static void main(String[] args) {
		/*
		 *  구구단 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
		* 1.규칙성: 7xi=7*i 출력
		* 2.반복횟수: i는 1부터 9까지 1씩 증가/ i는 7부터 63까지 7씩 증가
		* 7x1=7
		* 7x2=14
		* 7x3=21
		* 7x4=28
		* 7xi=7*i/7xi/7=i
		*/
		
		int i, num=7;
		
		for(i=1; i<=9; i+=1) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
		
		for(i=1; i<=9; i+=1) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		
	

	}

}
