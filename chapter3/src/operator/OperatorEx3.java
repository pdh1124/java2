package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int score = 100;
		
		System.out.println(++score); //101
		//score = score +1;
		//score += 1;
		
		System.out.println(score++); //101
		
		System.out.println(score); //102 : score++�� ���� �� ++�ϱ� ������(-�� ����)
		
		int num3 = 10;
		int i = 2;
		
		boolean value = ( (num3 = num3 + 10) < 10 ) && ((i = i+2) < 10);
		
		System.out.println(num3); //20
		System.out.println(i); //2 : �� 4�� �ƴ� ������ : �տ� �����ڰ� 20������ 10���� ������ �ƴϱ� ������ �ڿ� ������ �� �ʿ䰡 ���� �����̴�.
		
		System.out.println(value);
		
		int num4 = 10;
		int j = 2;
		
		boolean value2 = ( (num4 = num4 + 10) < 10 ) || ((j = j+2) < 10);
		
		System.out.println(num4); //20
		System.out.println(j); //4 : or������ ������ num4������ �ƴϿ��� j������ �ϰ� �ȴ�.
		
		System.out.println(value2);
		
		int num_1 = 10;
		int num_2 = 20;
		
		int max = (num_1 > num_2)? num_1:num_2; //���߿� ū���� �������ڴ�.
		
		System.out.println(max);
		
		
	}
}
