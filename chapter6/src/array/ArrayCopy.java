package array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//복사
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		//배열을 복사를 할때는 System.arraycopy라는 메소드를 쓸 수 있음
		//System.arraycopy(src(어디서), srcPos(어디서 부터), dest(어디에다가), destPos(어디에다가 어디부터), length(몇개));
		//System의 static메소드인 arraycopy
	
		System.arraycopy(arr1, 0, arr2, 1, 3);
		//arr1에 있는 0번째의 값을 arr2에 1번째 있는 값부터 3개 복사해 넣어라 
		//만약 3을 5이상으로 넘으면(복사할 수를) 에러가 뜸
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]); //{1, 20, 30, 40, 5};
		}

	}

}
