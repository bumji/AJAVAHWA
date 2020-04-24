package day6;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		
		/* 여러 명의 학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요.
		 * 학생의 성적이 음수가 입력되면 종료하도록 하세요.
		 * 100~90 : A
		 * 89 ~80 : B
		 * 79 ~70 : C 
		 * 69 ~60 : D
		 * 59  ~0 : F
		 * 100점 이상 : 잘못된 수입니다.
		 * 
		 * 성적을 입력하세요 : 70
		 * 70은 C학점
		 */
		//음수가 입력되면 종료 
		
		Scanner scan = new Scanner(System.in);   //화면에서 입력받기
		for(int h=1; ; h++ ) {   //for( ; ; )  조건문만 지우는 이유 !!!!!!!!!!!
			System.out.print("성적을 입력하세요(종료하려면 음수를 입력하세요) : ");
			int num = scan.nextInt();  //정수 입력 받음
//			System.out.print(num);   중간 중간 test하는 습관 들이기!
				
			if(num>=90 && num<=100) {System.out.println(num + "는 학점 A");}	
			else if(num>=80 && num<=89) {System.out.println("학점 : B");}
			else if(num>=70 && num<=79) {System.out.println("학점 : C");}
			else if(num>=60 && num<=69) {System.out.println("학점 : D");}
			else if(num>=0 && num<=59) {System.out.println("학점 : F");}
			else if(num > 100) {System.out.println("잘못된 수입니다.");}
			else {
				System.out.println("지금까지 입력확인한 학생의 수는 " + (h-1) + "명입니다.");
				// -1의 이유는 종료한 값까지 카운트 하기 떄문에 마지막 카운트는 빼야 해서 
				System.out.println("종료합니다.");
				break;
			}
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

