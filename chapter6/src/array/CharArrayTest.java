package array;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] arr = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<arr.length; i++) { //���ڵ� ������ ǥ����
			arr[i] = ch++;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ "," + (int)arr[i]); //������ int���� ������
		}
	}

}
