package day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		

	}

}
interface RemoteController{ //현재 멤버변수 없기 때문에 채널에 대한 정보를 알 수 없기 때문에 괄호 안에 매개변수들
	public int chUp(int ch);
	public int chDown(int ch);
	public int volUp(int vol);
	public int volDown(int vol);
	/* 인터페이스에 새로운 추상 메서드를 추가하면 해당 인터페이스를 구현한 모든 클래스에 에러가 발생(오버라이딩 하지 않아서)
	* 이러한 번거로움을 해결하고자 디폴트메서드를 이용한다.
	* 디폴트 메서드는 구현된 내용이 없는 메서드로 추상메서드와의 차이는 추상 메서드는 구현 클래스에서 꼭 오버라이딩을 해야하지만 디폴트는 문법적으로 안 해도 된다. */
	public default void test() {}
}
class TvRemoteController implements RemoteController{

	@Override
	public int chUp(int ch) { return ++ch; }

	@Override
	public int chDown(int ch) { return --ch; }

	@Override
	public int volUp(int vol) { return ++vol; }

	@Override
	public int volDown(int vol) { return --vol; }
	
}






