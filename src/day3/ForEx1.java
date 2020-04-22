package day3;

public class ForEx1 {

	public static void main(String[] args) {
		/* i가 계속 감소하여 언더플로우로 인해 정수 최대값이 되는 순간까지 반복
		
		int i;
		
		
		for(i=1; i<=5; i--) {
			System.out.println("Hello");
			
			
		}*/
	
		//반복문이 한번도 실행되지 않은 경우
		//for(i=10; i<=5; i++) {
		//	System.out.println("Hello");
		//}
		
		
		//변수는 선언한 위치부터 변수가 선언된 {} 안에서 유효함
		//j는 for문의 초기하 위치에서 선언되었기 때문에 반복문 안에서 유효함
		for(int j=1; j<=5; j++) {
			System.out.println("Hello");
			char ch = 'A';
			System.out.println((char)(ch+j));
		}
		//에러발생, j의 사용 범위 밖에서 j를 사용했기 때문에
		//System.out.println(j);
	}

}
