package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		//Array���� ��Ʈ���� ����� �����
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count(); //count�� ������� long�̱� ������ (int)������ ��ȯ ���ش�.

		System.out.println(sum);
		System.out.println(count);
		
		
		//redude() ������ ���
		//Arrays.stream(arr) arr�� ��Ʈ���� �����ϰ�
		//reduce(�ʱⰪ, (���޵Ǵ¿�� a�� b) -> a�� b�� �̿��� �����ؾ� �� ���)
		System.out.println(Arrays.stream(arr).reduce(0, (a,b) -> a+b));
	}

}
