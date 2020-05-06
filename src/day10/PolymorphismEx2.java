package day10;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		/* 제조사의 종류와 상관없이 10개짜리 배열에 차량을 관리할 수 있다.
		
		Car[] arr = new Car[10]; //입고된 차량을 관리하기 위한 배열 (차량이 입고될 거지 현대인지 기아인지 모르니 일단 부모클래스인 Car로 입고)
		arr[0] = new KiaCar();  
		arr[1] = new HyundaiCar(); //객체는 자식이지만 관리는 부모로 효율적 관리 
		
		//부모없이 따로 따로 관리 
		제조사가 추각되면 해당 제조사를 관리하기 위한 배열을 추가로 만들어 관리해야 한다. 
		
//		KiaCar karr[] = new KiaCar[10];
//		HyundaiCar harr[] = new HyundaiCar[10];
//		Karr[0] = new KiaCar();
//		harr[0] = new HyundaiCar();
	} */
		Car[] arr = new Car[10];
		arr[0] = new KiaCar("모하비");
		arr[1] = new KiaCar("쏘렌토");
		arr[2] = new KiaCar("K7");
		arr[3] = new HyundaiCar("아반떼");
		arr[4] = new HyundaiCar("그랜저");
		arr[5] = new HyundaiCar("제네시스");
		showCar(arr);
	}
	public static void showCar(Car[] arr) {
		System.out.println("---입고된 차량 리스트---");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != null) { //참조변수 초기값 = null
				if(arr[i] instanceof KiaCar) {
				System.out.println(arr[i].manufacturer + " : " + arr[i].name + " - " + ((KiaCar)arr[i]).Kia);
				}
				if(arr[i] instanceof HyundaiCar) {
					System.out.println(arr[i].manufacturer + " : " + arr[i].name + " - " + ((HyundaiCar)arr[i]).h);
				}
			}
		}
	}
}
class Car{
	int wheel;
	String type;
	String manufacturer;
	String name;
	
	public Car() {} //생성자
	public Car(String manufacturer, String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	}
}
class KiaCar extends Car{
	String Kia = "기아차입니다.";
	public KiaCar() {manufacturer="KIA";}
	public KiaCar(String name) {
		super("KIA",name);
	}
}
class HyundaiCar extends Car{
	String h = "현대차입니다.";
	public HyundaiCar() {manufacturer = "HYUNDAI";}
	public HyundaiCar(String name) {
		super("HYUNDAI",name);
	}
}