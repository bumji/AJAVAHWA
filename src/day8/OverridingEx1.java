package day8;

public class OverridingEx1 {

	public static void main(String[] args) {
		Duck d = new Duck();  //new를 통해 Duck으로 가서 기본 생성자로 가고 -> 그 후 부모 생성자까지 갔다가 돌아옴 
		d.cry();  //
		Sparrow s = new Sparrow();
		s.cry();
		s.cry(0); // 오버라이딩 
		Sparrow s2 = new Sparrow(1);
		System.out.println(s.getWing());
		System.out.println(s2.getWing());
	}

}
class Bird{
	protected int wing;  //날개 수
	public void cry() {
		System.out.println("새가 웁니다.");
	}
	public Bird() { wing = 2;}    //부모 클래스 기본 생성자
	public Bird(int wing) { this.wing = wing; }
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
}

class Duck extends Bird{
	// 메서드 오버라이딩
	@Override
	public void cry() {
		super.cry();   
		// super => 메서드 오버라이딩을 하는데 작업하는 메서드명과 같은 모부클래스의 메서드를
		// super없이 호출하면 모부클래스의 메서드가 아닌 내 클래스의 메서드로 호출되어 재귀호출 된다.
		// 모부클래스의 메서드를 의미하기 위해 앞에 super를 붙인다.
		// 그냥 cry(); 는 Duck클래스의 cry()로 호출되어 재귀호출 된다. *에러발생*
		System.out.println("오리 : 꽥꽥");
	} 
// 	public Duck() {super();}    //생성자가 없으면 기본 생성자가 자동으로 생성됨
	// => super(부모클래스의 생성자)가 실행됨
}
class Sparrow extends Bird{
	// 메서드 오버로딩 
	public void cry(int num) {
		System.out.println("참새 : 짹짹");
	}

	public Sparrow() {
		super();  //부모 클래스의 기본 생성자
	}

	public Sparrow(int wing) {
		super(wing);  //
	}
	

}