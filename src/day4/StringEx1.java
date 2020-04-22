package day4;
//206p
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//내부에 캐릭터 배열이 들어있음, 캐릭터 배열과 기능이 있냐 없냐 차이 
		//int arr[] = new int[3];
		String str = "홍길동";
		String str1 = new String("임꺽정");
		
		String arr[] = new String[3]; //길이가 3인 String배열을 생성
		arr[0] = str;   // 참조변수의 = 는 공유
		arr[1] = str1;
		arr[2] = "이순신"; // 공유 아니고 혼자 쓰임
		for(String s : arr) {
			System.out.println(s);
			
		}

	}

}
