package day9;

public class InheritanceEx2 {

	public static void main(String[] args) {
		Shape s1 = new Shape(5,5,10,10);
		s1.print();
		s1.resize(4,5);
		s1.move(10,10);
		s1.print();
		Square sq1 = new Square(5,5,10,10); //스퀘어에 정수 4개짜리 생성자가 있는지 확인 했더니 없어서 우리가 Square에서 네 개짜리를 만들어야해  
		//클래스에 생성자가 1도 없으면 기본 생성자 자동     // public Square(int left, int up, double width, double height)
		sq1.print();
		sq1.move(0,0);
		sq1.resize(5, 5);
		sq1.print();
		Circle c1 = new Circle(0,0,5);
		c1.print();
		c1.move(0,5);
		c1.print();
		c1.resize(2);
		c1.print();
		Circle c2 = new Circle();
		Shape.printCount();   //Circle.printCount(); 도 가능
		Square.printCount();
		Circle.printCount();
	}
}

