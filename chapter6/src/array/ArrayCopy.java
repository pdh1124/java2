package array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//����
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		//�迭�� ���縦 �Ҷ��� System.arraycopy��� �޼ҵ带 �� �� ����
		//System.arraycopy(src(���), srcPos(��� ����), dest(��𿡴ٰ�), destPos(��𿡴ٰ� ������), length(�));
		//System�� static�޼ҵ��� arraycopy
	
		System.arraycopy(arr1, 0, arr2, 1, 3);
		//arr1�� �ִ� 0��°�� ���� arr2�� 1��° �ִ� ������ 3�� ������ �־�� 
		//���� 3�� 5�̻����� ������(������ ����) ������ ��
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]); //{1, 20, 30, 40, 5};
		}

	}

}
