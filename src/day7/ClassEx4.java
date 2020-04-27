package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.in();
		s1.printInfo();
		Student s2 = new Student("디지털 컨버전스 ... 자바","이순신");
		s2.in();
		s2.out();
		s2.printInfo();
		

	}

}
/* class Student{
// 이름, 성별, 
	
	private static String work = "JAVA SW";
	
	String name;
	boolean card;
	
	
	public void checkOn() {
		System.out.println("출석 확인되었습니다.");
		card = true;
	}
	public void checkOut() {
		System.out.println("출석이 확인되지 않았습니다.");
		card = false;
	}
	public static void printInfo() {
		System.out.println("수업명 : " + work);
		
	}
	
	
	public Student() {
		
	}
	
	//클래스변수 : 하나의 값을 모든 객체가 공유해도 되냐/안 되냐 
} */
class Student{
	// static의 여부 ; 어떠한 정보가 만들어지기 전에 확인 할 수 있느냐/학원 학생 (), 만든 후에 확인해야 하느냐/우리 반만 static
	private String name;
	private boolean isEnterance;
	private String course;
	private String inTime, outTime;
	
	
	public void in() {
		System.out.println(name + "님이 입실 했습니다.");
		isEnterance = true;   // 바뀌어야 하는 변수
		inTime = "9시";
	}
	
	public void out() {
		System.out.println(name + "님이 퇴실 했습니다.");
		isEnterance = false;   // 바뀌어야 하는 변수
		outTime = "18시";
	}
	
	public void printInfo() {
		System.out.println("과정 : " + course);
		System.out.println("이름 : " + name);
		if(isEnterance) {
			System.out.println("입실 중입니다.");
			System.out.println("입실 시간 : " + inTime);
			
		}else {
			System.out.println("퇴실 했습니다.");
			System.out.println("입실 시간 : " + inTime);
			System.out.println("퇴실 시간 : " + outTime);
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnterance() {
		return isEnterance;
	}

	public void setEnterance(boolean isEnterance) {
		this.isEnterance = isEnterance;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	
	
	
	//생성자
	public Student() {
		course = "자바";
		name = "홍길동";
		
	} 
	public Student(String course, String name) {
		this.course = course;
		this.name = name;
		
	}
}



























