package day5;

import day4.QuestEx3; //day4.*; day4에 있는 모든 클래스를 불러올 수 있다.
import day5_1.*;

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestEx3.main(null);
		DefaultClassEx1.main(null);
		
		/* DefaultClassEx2는 다른 패키지에 있는 클래스인데 접근제한자가 default이 
		 * 사용할 수 없기 때문에 에러 발생
		 * DefaultClassEx2.main(null);
		 */
		
		
		//객체만들기
		//Point p1;  // ;으로 끝나면 객체 선언만 = 이러한 객체 쓸 겁니다.
		Point p1 = new Point(); //Point()=생성자 =>new를 통해서 Point()생성
		p1.x1 = 10;
		// p1.x2 = 10; = 에러, Point클래스의 x2는 private이기 때문에 다른 클래스에서 사용 불가(나만 사용 가능)  
		p1 = new Point(1,2);
//		p1 = new Point(3,4,5);  3개짜리 생성자를 만들지 않아서 실행ㄴ
//		p1 = new Point(1);

	}

}
//Point : 2차원 좌표평면에서 점 1개를 나타내는 클래스
class Point{
	int x1;  //x축의 좌표
	int y1;  //y축의 좌표
	private int x2;
	private int y2;  //해당 클래스 안에서만 사용 가능 -> 너 이 변수 만들었는데 한 번도 사용 안 했어. 체크해봐
	public int x3;
	public int y3;
	public Point() {   //기본 생성자:  
		x1 = x2 = x3 = 0;
		y1 = y2 = y3 = 0;
		System.out.println("Point의 기본 생성자 호출");
	}
	public Point(int x, int y) {    //생성자 오버로딩
		x1 = x2  =x3 = x;
		y1 = y2 = y3 = y;
		System.out.println("Point의 생성자 오버로딩 호출");
		
	}
}