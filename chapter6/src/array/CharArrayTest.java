package array;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] arr = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<arr.length; i++) { //문자도 정수로 표현됨
			arr[i] = ch++;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ "," + (int)arr[i]); //실제로 int값이 얼마인지
		}
	}

}
