package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
				//���������� error�� �߻� ��Ŵ
		//int ������ array�� 5��¥���� ����
		int[] arr = new int[5];
		
		//try �κп� ������ �κ��� �������ְ�
		try {
		//�迭�� 5���ε� 0~5������ 6���� ���� �ϴµ� �ϳ��� ���ڸ��� ������ ����
		for(int i=0; i <= 5; i++) {
			System.out.println(arr[i]);
			}
		} 
		//catch�κп� ArrayIndexOutOfBoundsException��� runtime������ ���� 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("����ó��");
		}
		System.out.println("���α׷� ����");

	}

}
