package day9;

public class Circle extends Shape {
	private double centerX, centerY;
	private static int circleCount;
//	public static void printCount() {
//		System.out.println("현재까지 만들어진 원의 갯수 : " + circleCount);
//	}
	public void print() {
		System.out.println("-----------원의 정보------------");
		System.out.printf("중심점은 : (%.1f,%.1f)\n", centerX, centerY);
		System.out.printf("반지름 : %.2f\n", getWidth()/2);
		System.out.println("-------------------------------");
	}
	public Circle() { circleCount++; } //기본생성자가 없다면 상속에 Circle c2 = new Circle(); 같은 기본?이 생성 불가 
	public Circle(int left, int up, double radius) {
		super(left, up, radius*2, radius*2);
		centerX = left + radius;
		centerY = up - radius;
		circleCount++;
	}
	public static void printCount() {
	System.out.println("현재까지 만들어진 원의 갯수 : " + circleCount);
	}
	
	
	public void move(int left, int up) {   // 매개변수=> (int left, int up)
		//부모 메소드형태 클래스인 Shape을 비교해서 똑같으면 라이딩 
		super.move(left,up);
		centerX = left + getRadius();
		centerY = up - getRadius();  //getWidth()도 ㄱㅊ / 매개변수의 left와 up이기때문에 get없이 사용 가능 
	}
	public void resize(double radius) {  //부모 형태와 비슷하지만 실수가 1개라서 로딩
		resize(2*radius, 2*radius);
		centerX = getLeft() + radius; //매개변수에 존재하지 않는 부모의 left이기에 get() + 
		centerY = getUp() - radius; 
	}
	public double getRadius() { //멤버변수 없고 게터만 존재
		return getWidth()/2;    //제일 위에 반지름 정보 가늠할 만한 거 없으니까 부모의 지름 width를 가져와서 반지름을 구하는 메서드
	}
}
