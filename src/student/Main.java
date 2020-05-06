package student;

public class Main {

	public static void main(String[] args) {
		/* 학생들을 관리하는 프로그램을 작성하세요.
		 * 학생 정보 : 학년, 반, 번호, 이름, 국어, 영어, 수학 등
		 * 기능 : 학생정보 추가, 수정, 삭제, 출력
		 
		 * 예시 
		 * 메뉴
		 * 1. 학생정보 추가
		 * 2. 학생정보 수정
		 * 3. 학생정보 삭제
		 * 4. 학생정보 출력
		 * 5. 종료
		 * 메뉴를 선택하세요. : 1 
		 */
		Student s = new Student();
		s.setScore(new Subject("국어", 100, 100, 10, 10),
				new Subject("영어", 100, 100, 10, 10),
				new Subject("수학", 20, 100, 90, 10));
		s.printScore();
		
//		Student g = new Student();
//		g.setGrade(9);
//		System.out.println(g.getGrade());
//		
//		Student c = new Student();
//		c.setClassNum(2);
//		System.out.println();
	}

}

/*	1. 데이터 관리를 위한 작업
 *  	=> 변수나 클래스를 이용
 * 		학생 정보 -> Student 클래스 
 * 		과목 정보 -> Subject 클래스
 *	2. 기능 구현
 *  	=> main 메서드에 바로 구현
 *  	=> 또는 기능을 인터페이스로 정의하고 해당 인터페이스를 구현하는 구현클래스를 생성
 *	3. 테스트
 * */















