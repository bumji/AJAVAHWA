package day8;

public class ConstructorEx1 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(1,2);
		p2.print();
		

	}

}
// 같은 패키지에 포인트 클래스 여러 개 있으면 에러
class Point{
	int x=1;
	int y=1;   // 기본값은 0인데 명시적초기화로 덮어쓰기 돼서 (1,1)        
	{
		x=10;
		y=10;  //초기화 블럭
	}
	
	void print() {
		System.out.printf("(%d,%d)\n" ,x ,y);
	}
	public Point(int x,int y) {
		this.x = x;     // 서열 1.매개변수 2.멤버변수(파랑색)
		this.y = y;
	}
	public Point() {
//		this(0,0);  19,20줄 x,y에 0,0을 넣어라
		this(100,100);						//
	}
//	복사 생성자
	public Point(Point p) {
		//다른 생성자 this()를 이용할 때에는 메서드의 첫번째 줄에 넣어줘야 함
		this(p.x, p.y);
		this.x = p.x;   //this.x = x; 도 무관
		this.y = p.y; 
	}
}
