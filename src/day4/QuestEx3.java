package day4;

public class QuestEx3 {

	public static void main(String[] args) {
		/* 정수 10개짜리 배열에 값을 랜덤으로 생성하여 저장하고(중복 가능)
		 * 저장된 배열 값 중에서 가장 큰 값과 가장 작은 값을 출력하는 코드를 작성
		 * 
		 */
			
		//1.max,min에 0번지를 넣어준다.
		//2.max와 1번지를 비교하여 업데이트
		
		
		int arr[] = new int[10];
		int rMin = 1;
		int rMax = 100;
		int min, max;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1))+rMin;
			
		}
		for(int tmp:arr) {
			System.out.printf("%d ",tmp);
	
		}
		System.out.println();
		min = max = arr[0];   // = 0번지에 있던 값을 min과 max에 같이 넣어준다
		for(int i = 1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("배열의 최대값 : %d, 최소값 : %d%n",max,min);
	}

}
