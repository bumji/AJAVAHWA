package day7;

public class TestEx1 {

	public static void main(String[] args) {
		int size = 3;
		int com[] = new int [size];
		int min = 1, max = 9;
		createArray(min, max, size, com);
		printArray(com);
		// 반복 시작(3S)
		// 사용자가 세 수를 입력
		
		// 스트라이크 판별
		
		// 볼 판별
		
		// 3아웃 판별
		// 반복 끝
 	}
	/* 기능 : min에서 max 사이의 중복되지 않는 n개의 배열값을 생성하여 저장하는 메서드
	 * 매개변수 : min에서 max, n개, 배열 -> int min, int max, int n, int []arr
	 * 리턴타입 : 예외처리를 위해 true이면 배열 생성
	 * 		   false이면 배열 생성 실패 -> boolean
	 * 메서드명 : createArray
	 * 예를 들면 min =1, max =3, n=4인 경우 min ~ max 사이의 중복되지 않은 랜덤한 수는 총 3개인데
	 * 4개를 만들어야 하니, 1개를 만들 수가 없어서 무한루프에 빠짐.
	 * 
	 * max - min +1 >= n이면 배열 생성 가능, 아니면 배열 생성 실패
	 * 
	 */
	
	public static boolean createArray(int min, int max, int n, int []arr) {
		if(arr == null)  //빈 배열을 넘겨줌
			return false; 
		if(max - min + 1 < n)
			return false; //배열 생성 안 되는 경우
		int cnt = 0;  //현재 배열에 저장된 원소의 갯수
		while(cnt < n) {
			int r = random(min, max);
			if(!isDuplicated(arr, r)) {
				// arr[cnt++] = r;  아래 두 줄을 합친 코드
				arr[cnt] = r;
				cnt++;
			}
		}
		return true;

		
	}
	
	
	
	
	public static int random(int min, int max) {
		// 1,9로 알려줘야 하는데 9,1로 알려준 경우 1,9로 처리하기 위해 두 수를 교환
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1)+ min);
	}
	
	
	public static void printArray(int []arr) {
		for(int i=0; i<arr.length; i++) {    //배열의 값을 0번지부터 마지막까지 접근하는 반복문! 암기★
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
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
		return false;

	}
	
	
	
	
	
	
	
}

