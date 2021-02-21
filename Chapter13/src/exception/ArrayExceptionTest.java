package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
				//강제적으로 error를 발생 시킴
		//int 형식의 array를 5개짜리로 만듬
		int[] arr = new int[5];
		
		//try 부분에 실행할 부분을 실행해주고
		try {
		//배열이 5개인데 0~5까지면 6개를 찍어야 하는데 하나가 모자르면 에러가 생김
		for(int i=0; i <= 5; i++) {
			System.out.println(arr[i]);
			}
		} 
		//catch부분에 ArrayIndexOutOfBoundsException라는 runtime오류를 가진 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리");
		}
		System.out.println("프로그램 종료");

	}

}
