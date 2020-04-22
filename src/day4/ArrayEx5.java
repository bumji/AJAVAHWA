package day4;

public class ArrayEx5 {

	public static void main(String[] args) {
		/* 배열의 내용을 정렬하는 예제
		 * 
		 * 처음 수와 두번째 수를 바꾼다. 
		 * 그리고 그 다음 수와 앞에서의 큰 수를 비교한다 
		 * ...
		 */
		
		int arr[] = new int[10];
		int rMin = 1;
		int rMax = 100;

		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1))+rMin;
			
		}
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
	
		}
		System.out.println();
		
		for(int i = 0; i<arr.length-1; i++) { //10번이 아니라 9번 반복이라서 length-1
			for(int j=0; j<arr.length-1-i; j++) { //
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
					
				}
				
			}
		}
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();

	}

}

