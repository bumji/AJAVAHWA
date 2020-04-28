package day8;

public class ModifierEx1 {

	public static void main(String[] args) {
		// final 변수는 이름 붙은'상수'
		final int MAX = 10;
		// public static final double PI
		System.out.println(Math.PI);
		D d = new D();
		Object o1 = new Object();
		d.print1(o1);
		/* A a = new A();
		d.print1(a); */
		d.print1(new A());
	}
}
//final 클래스는 부모가 될 수 없다.
final class A{
	public int a;
}
class B {
	// final 메서드는 오버라이딩 할 수 없다. (상속받은 메서드 내용 변경) +변수 앞에 final이 붙으면 '상수'
	public final void print() {
		System.out.println("클래스 B입니다.");
	}
}
class C extends B{
	public final int num;  //초기화를 안 했기 
	public C() {
		num = 0;
	}
	public C(int num) {
		// final멤버변수는 선언과 동시에 초기화 하지 않아도 생성자에서 초기화를 할 수 있다.
		this.num = num; 
	}
}
class D{
	// 매개변수로 클래스 Object의 객체 obj가 오면 실제 넣어주는 정보는 Object클래스의 객체도 가능하지만
	// Object 클래스를 상속받은 자식 클래스들도 가능
	public void print1(Object obj) {  
		//obj 객체가 클래스A로 형변환 가능한지를 확인하는 연산 : instanceof
		if(obj instanceof A)
			System.out.println("A클래스로 형변환 가능합니다.");
		else
		System.out.println("Object입니다.");
	}
	// 매개변수로 B클래스의 객체 obj가 오기 때문에 실제 넣어주는 정보는 B클래스의 객체나 B클래스를 상속받은 A객체를 
	// 매개변수로 넣어줄 수 있다.
	public void print2(B obj) {
		System.out.println("B입니다.");
	}
}






