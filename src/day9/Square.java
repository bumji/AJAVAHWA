package day9;

public class Square extends Shape{
	private static int squareCount;  //변수 생성
	public void print() {
		System.out.println("----------사각형의 정보------------");
		System.out.printf("시작점은 : (%d,%d)\n", getLeft(), getUp());
		System.out.printf("가로 : %.2f\n", getWidth());
		System.out.printf("세로 : %.2f\n",getHeight());
		System.out.println("-------------------------------");
	} //정보들이 private으로 되어 있어서 get()을 넣어줌
//	public Square() { squareCount++; } //기본 생성자 = 직접 넣어도 되고, 저절로 나온다.
	public Square(int left, int up, double width, double height) {
		super(left,up,width,height); //부모 생성자 호출 : 자식 클래스의 생성자에서만 호출할 수 있다.
		squareCount++;
//		setLeft(left);   위와 같음  
//		setUp(up);
//		setWidth(width);
//		setHeight(height);
	}	
	
	public static void printCount() {
		System.out.println("현재까지 만들어진 사각형의 갯수 : " + squareCount);
	}
	
}

