package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		//�ʱ�ȭ�� �Ѵٸ�
		int[] arr2 = new int[/*�ʱ�ȭ�� �ϸ� ���ڸ� ���� ����*/] {1,2,3};
		
		//����� ���ÿ� �ʱ�ȭ�� �Ѵٸ�
		int[] arr3 = {1,2,3,4};
		
		/* ���� �� �ʱ�ȭ�� �ϸ� �ȵ�
		int[] arr4;
		arr4 = {1,2,3,4,5};
		 */
		
		int total = 0;
		
		for(int i=0, num=1; i< arr.length; i++, num++) {
			arr[i] = num;
			System.out.println(arr[i]);
			//System.out.println("�迭�Դϴ�." + arr[i]);		
			
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
		//0~2���� 3���� �ִµ� dArr�� �迭�� �� 5�� ������ �������� ���� �迭�� 0.0���� �ȴ�.
		
		
		//�ذ���
		double[] mArr = new double[6];
		int count = 0; //count������ ����� �ص�
		mArr[0] = 1.1;
		count++; //���� �ϰ���� �迭�� �����Ҷ� ���� count�� �ϳ��� �÷��ش�.
		mArr[1] = 2.1;
		count++;
		mArr[2] = 3.1;
		count++;
		
		double mTotal = 1;
		
		for(int i=0; i< count; i++) { //i�� �ݺ����� count�� ���� ���� �� 
			mTotal *= mArr[i];
		}
		System.out.println(mTotal);  //7.161000000000001
		//0~2���� 3���� �ִµ� dArr�� �迭�� �� 5�� ������ �������� ���� �迭�� ������� �ʴ´�.
		}
	}	

