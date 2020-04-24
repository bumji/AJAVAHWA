package day6;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여 배열의 값을 출력하도록 작성하세요.
		 * 
		 */
		//int arr[];   배열을 만든 게 아니라 참조변수를 만든 것 
		int arr[] = new int[5];     //=>  바로가기 = 실제 값
		printArray(arr);
		
		//0번지에 0을, 1번지에 1을 ...4번지에는 4가 저장되도록 작성하세요.
		for(int i=0; i<arr.length; i++) { 
			arr[i]=i;
		}
		printArray(arr);   //배열 
		
		/* num에 1을 저장 후 num의 값이 arr에 있는지 없는지 확인하여 
		  있으면 '있습니다.' / 없으면 '없습니다.'라고 출력하는 코드를 작성하세요. */
		int num=6;
		if(isDuplicated(arr, num)) {
			System.out.println(num + "는 있습니다.");
		}else {
			System.out.println(num + "는 없습니다.");
		}
		/*for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				System.out.println(num + "는 있습니다.");
				break;
			}
			//arr.length-1 은 배열 arr의 마지막 번지
			//앞에서 중복검사를 하기 때문에 마지막번지이면서 여기까지 왔다는 것은 마지막번지까지 중복된 내용이 없다는 뜻
			if(i == arr.length-1) {
				System.out.println(num + "는 없습니다.");
			}
		}
		*/
		

	}
	//내가 시킬 때 필요한 정보 -> 매개변수 
	/* 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드
	 * 매개변수 : 배열(main에서 똑같이 적을 거 알려줘야 하는 거) -> int []arr
	 * 리턴타입 : X (알려주는) -> void (메인에서 정보를 받아서 활용을 하는 경우  // 출력만 하면 리턴타입x) 
	 * 메서드명 : printArray
	 */
	
	public static void printArray(int []arr) {
		for(int i=0; i<arr.length; i++) {    //배열의 값을 0번지부터 마지막까지 접근하는 반복문! 암기★
			//0번지부터 마지막번지까지 하나씩 증가
			
			// arr.length : 배열의 길이
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	/* 기능 : 배열 arr에 정수 num의 값이 있는지 없는지 확인하는 메서드
	 * 매개변수 : 배열, 정수 -> int []arr, int num 
	 * 리턴타입 : 값이 있는지 없는지 ->  참, 거짓 구별하는 boolean
	 * 메서드명 : isDuplicated
	 */ 
	public static boolean isDuplicated(int []arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
			//arr.length-1 은 배열 arr의 마지막 번지
			//앞에서 중복검사를 하기 때문에 마지막번지이면서 여기까지 왔다는 것은 마지막번지까지 중복된 내용이 없다는 뜻
			if(i == arr.length-1) {
				return false;
			}
		}
		return false;   //배열이 0이면 if 실행x 
	}

	
	
	
	
	
	
	
	
	
	
}
