package student;

public class Student {
	private String name ="";
	private int grade;
	private int classNum;
	private int num;
	private Subject score[];
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public int getClassNum() {
			return classNum;
		}
		public void setClassNum(int classNum) {
			this.classNum = classNum;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
//		public Subject getKor() {
//			return kor;
//		}
//		public void setKor(Subject kor) {
//			this.kor = kor;
//		}
//		public Subject getEng() {
//			return eng;
//		}
//		public void setEng(Subject eng) {
//			this.eng = eng;
//		}
//		public Subject getMath() {
//			return math;
//		}
//		public void setMath(Subject math) {
//			this.math = math;
//		}
		public void setScore(Subject...score) {
			this.score = new Subject[score.length];
			for(int i = 0; i<score.length; i++) {
				//this.score[i] = score[i];
				this.score[i] = new Subject(score[i]);
			}
		}
		public void printScore() {
			for(Subject tmp : score) {
				tmp.print();
			}
		}
	public boolean equal(int grade, int classNum, int num, String name) {
		if(this.grade != grade) return false;
		if(this.classNum != classNum) return false;
		if(this.num != num) return false;
		if(!this.name.equals(name)) return false;
		return true;
	}
	
}
