package array;

public class TowDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{2,7,9}, {4,5,6,3}};
		
		System.out.println(arr.length); //2 ���� ����
		System.out.println(arr[0].length); //3 {2,7,9}�� ����
		System.out.println(arr[1].length); //3 {4,5,6}�� ����
		
		
		//�� ����ϰ� ������
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
