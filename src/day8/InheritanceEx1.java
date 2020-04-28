package day8;

public class InheritanceEx1 {

	public static void main(String[] args) {
		Child c1 = new Child(); // 기본 생성자 호출
		c1.print2();
		c1.setD(12);
		c1.print2();
	}

}
class Child extends Parent{
	//멤버변수(속성)
	private int e;
	Point p1 = new Point();
	public void print2() {  //a,b,c,d가 상속받은, 
//		print(); //d값 확인 가능
		System.out.printf("%d,%d\n", p1.x, p1.y);
		System.out.printf("%d,%d\n", x, y);
		System.out.printf("a=%d, b=%d, c=%d, d=%d , e=%d\n", a, b, c, getD(), e);
	}
	
}
class Parent{
	public int a;
	protected int b;
	int c;  // a,b,c 기본값=0
	private int d=10; 
	public int x,y;
	public void print() {
		System.out.printf("a=%d, b=%d, c=%d, d=%d\n", a, b, c, d);
	}
	
	
	
	//생성자
	public Parent() {}
//	public Parent(int a, int b, int c, int d) {
//		this.a = a;  this.b=b;  this.c=c;   this.d=d;
//	}

	public Parent(int a, int b, int c, int d) {
//		super(); 
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	
}