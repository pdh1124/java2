package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		//초기화를 한다면
		int[] arr2 = new int[/*초기화를 하면 숫자를 쓰지 않음*/] {1,2,3};
		
		//선언과 동시에 초기화를 한다면
		int[] arr3 = {1,2,3,4};
		
		/* 선언 후 초기화를 하면 안됨
		int[] arr4;
		arr4 = {1,2,3,4,5};
		 */
		
		int total = 0;
		
		for(int i=0, num=1; i< arr.length; i++, num++) {
			arr[i] = num;
			System.out.println(arr[i]);
			//System.out.println("배열입니다." + arr[i]);		
			
			total += arr[i];	
		}
		System.out.println(total);

		
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double dTotal = 1;
		
		for(int i=0; i< dArr.length; i++) {
			dTotal *= dArr[i];
		}
		System.out.println(dTotal);  //0
		//0~2까지 3개가 있는데 dArr에 배열은 총 5개 임으로 지정되지 않은 배열은 0.0으로 된다.
		
		
		//해결방안
		double[] mArr = new double[6];
		int count = 0; //count변수를 만들어 준뒤
		mArr[0] = 1.1;
		count++; //지정 하고싶은 배열을 지정할때 마다 count를 하나씩 올려준다.
		mArr[1] = 2.1;
		count++;
		mArr[2] = 3.1;
		count++;
		
		double mTotal = 1;
		
		for(int i=0; i< count; i++) { //i의 반복수를 count의 수로 맞춘 후 
			mTotal *= mArr[i];
		}
		System.out.println(mTotal);  //7.161000000000001
		//0~2까지 3개가 있는데 dArr에 배열은 총 5개 임으로 지정되지 않은 배열은 계산하지 않는다.
		}
	}	

