package day4;

public class ArrayEx4 {

	//	    	  배열의 0번지부터 cnt-1번지까지 중복여부 체크
	 // 중복되지 않으면 배열에 랜덤수를 저장하고 배열에 저장된 랜덤수의 갯수를 1증가
	public static void main(String[] args) {
		// 배열에 임의의 수 넣는 예제
		int arr[] = new int [3];
		int max = 3;
		int min = 1;
		
		//임의의 수를 생성하여 배열에 저장(중복 가능)
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*(max-min+1)) + min;
			arr[i] = random;
		}
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}
		
	     //임의의 수를 생성하여 배열에 저장(중복 x)
		int cnt = 0; //배열에 저장된 랜덤수의 갯수
		int []arr2 = new int[3];
		while(cnt< arr2.length) {
	    	// 생선된 랜덤수 random :1
	  		// 배열에 저장된 개수 cnt :0
	    	// 저장된 배열의 값 arr2 :1  
	    	  int random = (int)(Math.random()*(max-min+1)) + min;
	    	  int i = 0;
	    	  while(i<cnt) {
	    		  if(random == arr2[i]) {
	    			  break;
	    	  }
	    		  i++;
	    	  }
	    	  if(i == cnt) {
	    		  arr2[cnt] = random;
	    		  cnt++;
	    	  }
	    
	    	  
	    }
		System.out.println();
	    for(int tmp:arr2) {
			System.out.print(tmp + " ");
		}

	}

}
