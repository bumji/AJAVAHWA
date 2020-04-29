package day9;

public class FinalEx1 {

	public static void main(String[] args) {
		// 지역변수는 자동 초기화 불가 , 클래스의 멤버변수들은 자동 초기화 ok
		final double PI;
		PI = 3.14;      // 초기화
//		PI = 3.145545;  에러 발생 : 초기화된 final상수를 수정 
		A a = new A();
		a.print();
		int arr[] = new int[10];
		System.out.println(arr.length);
//		arr.length = 11;   '에러 발생' : final변수이므로 수정 불가
		Array array = new Array(5);
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
//		System.out.println(array.get(3));
//		System.out.println(array.get(4));
		for(int i =0; i<5; i++) {
			System.out.println(array.pop());
		}
	}
	
} //파이널 클래스는 누군가의 자식 OK, 부모는 불가능
class C{}
final class A extends C{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}
class B{ // extends A { - 클래스 A는 final클래스이기 때문에 상속하려하면 에러 발생
}
class D{
	// print메서드에 final을 붙이면 아래 클래스 E에서 print메서드를 오버라이드 할 수 없다.
	public /*final*/ void print() {
		System.out.println("D클래스입니다.");
	}
}
class E extends D{
	@Override
	public void print() {
		System.out.println("E클래스입니다.");
	}
	
}
class Array{
	public final int length; //final 원래 무조건 초기화를 해야 하는데 length;로 하면 나중에 수 바꿀 수 업ㅅ으니까 확인해봐! 문법적으로 도와주는 것 [계약서의 서명 같은 것]
	private int arr[];
	private int index = 0;  //현재 저장된 원소의 수
	public Array() {
		length = 10;
		arr = new int[length];  //배열 생성
	}
	public Array(int length) {
		this.length = length;
		arr = new int[length];
	}
	public void push(int num) {
		if(index < length) {
		arr[index] = num;
		index++;
		}
		/* else {  
		 *      1. 안내 메세지만 처리
		 *      2. 배열을 확장하여 추가하는 경우
		 * }
		 */
	}
	public int get(int index) {
		if(this.index > index) {
			return arr[index];
		}
		return 0;   //잘못된 접근이기 때문에 예외처리 클래스를 이용해 처리해야 하는데 아직 안 배워서 0으로 처리
	}
	public int pop() {
		if(index == 0) {
			return 0;   //throw를 이용하여 예외를 발생시켜야 하는데 아직 배우지 않아서 0으로 리턴
		}
		int res = arr[index];
		index--;
		return res;
//		return arr[index--];  위와 같음
		
	}
}




