package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		//Array에서 스트림을 만드는 방법은
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count(); //count의 결과값이 long이기 때문에 (int)값으로 변환 해준다.

		System.out.println(sum);
		System.out.println(count);
		
	}

}
