package day8;

public class RecursiveEx1 {

	public static void main(String[] args) {
		
		System.out.println(fact(5));  
	}
	// 팩토리얼 메서드
	public static int fact(int num) {
		if( num == 1 || num == 0)
			return 1;
		if( num < 0)
			return 0;
		return num * fact(num-1);
	}
}
/* 아래는 재귀 호출을 이용한 main에서 프로그램이 종료될 때 까지 실행순서를 줄로 표현한 것이다.
 5 7 (f5호출)
10(num=5) 11 13 15(f4호출)=(num=4일 때 팩토리얼 호출) 
10(4) 11 13 15(f3호출) =(num=3일 때 팩토리얼 호출) 
10(3) 11 13 15(f2호출) =(num=2일 때 팩토리얼 호출) 
10(2) 11 13 15(f1호출) =(num=1일 때 팩토리얼 호출) 
10(1) 11 12 
15(f1에서 빠져나와 f2의 15줄을 실행하는데 이 때 f2를 빠져 나감) (1팩토리얼 매서드를 빠져 나와 2팩토리얼의 리턴으로 이동, n=2)
15(f2에서 빠져나와 f3의 15줄을 실행하는데 이 때 f3를 빠져 나감) (2팩토리얼 매서드를 빠져 나와 3팩토리얼의 리턴으로 이동, n=3)
15(f3에서 빠져나와 f4의 15줄을 실행하는데 이 때 f4를 빠져 나감) (3팩토리얼 매서드를 빠져 나와 4팩토리얼의 리턴으로 이동, n=4)
15(f4에서 빠져나와 f5의 15줄을 실행하는데 이 때 f5를 빠져 나감) (4팩토리얼 매서드를 빠져 나와 5팩토리얼의 리턴으로 이동, n=5)
7(5팩토리얼의 값이 계산되어 나옴)
8 
 */
