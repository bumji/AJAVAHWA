package day10;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Tv t = new Tv();  //t라는 객체를 만들 떄 Tv라는 클래스(생성자) 이용
		CaptionTv ct = new CaptionTv();
		/* 아래와 같이 자식 객체를 생성하여 부모가 참조하는 경우에는 자식클래스의 멤버변수 power, ch, text가 만들어진 후 부모가 power와 ch만 사용하기 때문에 이 경우는 가능 
		 * */
		Tv t1 = new CaptionTv(); // 조상타입의 참조변수 t1(객체)으로 자손타입의 인스턴스를 참조(자손타입의 text는 사용해도 그만 안 해도 그만)
		/* 부모객체를 생성하여 자식이 참조하는 경우에는 부모클래스의 멤버변수 power,ch만 만들어진 상태에서 자식이 text를 사용하려 하면 에러가 발생하기 때문에 이 경우는 불가능
		 * */
//		CaptionTv ct1 = new Tv();  반대의 경우 ( 에러) 
		// =을 기준으로 오른쪽을 형변환
		t = ct;  // 자손타입(ct)이 조상타입(t)의 객체로 형변환 되는 경우=자동/항상 가능
//		t = new Tv(); // 문법은 문제x, 실행시 에러 > 이 코드가 없는 경우는 아래가 가능, 코드 활성화시 아래 코드는 에러 
		/* 아래와 같이 조상타입에서 자손타입은 항상 가능한 것이 아니라 조건부로 상황에 따라서 가능
		 * ClassCastException이 발생 
		 * 가능한 경우: 부모객체 t가 부모클래스를 통해 생성된 객체가 아니라 자식클래스를 통해 생성된 객체와 연결이 된 경우는 가능*/
		ct = (CaptionTv)t; // 조상타입(t)이 자손타입으로 /
		SmartTv st = new SmartTv();
		ct = new CaptionTv();
		Tv.disply(st);
		Tv.disply(ct);
		
	}

}
class Tv{
	boolean power = false;
	int ch;
	void power() {power = ! power; } //현재 상태ㅇ에 반대가 되는(큰 예:스위치)
	void chUp() { ch++; }
	void chDown() { ch--; }
	public static void disply(Tv t) {  //매ㄱㅐ변수의 다형성
		if(t instanceof CaptionTv) {
			System.out.println("캡션TV");
		}
		else if(t instanceof SmartTv) {
			System.out.println("스마트TV");
		}
	}
}
class CaptionTv extends Tv{
	String text;
	void caption() {System.out.println("캡션 : " + text);}
}
class SmartTv extends Tv{
	String ip;
}
















