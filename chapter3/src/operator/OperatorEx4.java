package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		// ��Ʈ������ : ����ӵ��� ������.
		
		// ������ : ���� : ����
		
		// ~ : ��Ʈ�� ���� (1�� ����) : a = ~a;
		// & : ��Ʈ ���� AND : 1&1 1��ȯ �� �ܴ� 0
		// | : ��Ʈ ���� OR : 0|0 0��ȯ �� �ܴ� 1
		// ^ : ��Ʈ ����XOR : �ΰ��� ��Ʈ�� ���� �ٸ� ��쿡 1�� ��ȯ
		// << : ���� shift : a<<2 ���� a�� 2��Ʈ ��ŭ �������� �̵�
		// >> : ������ shift : a>>2 ���� a�� 2��Ʈ ��ŭ ���������� �̵�
		// >>> : ������ shift : >>������ ���� - ä������ ��Ʈ�� ��ȣ�� ��� ���� 0��
		
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 3); //������ 00000101�� 1�� �������� 3ĭ �δ�. => 00101000
		System.out.println(num2 >> 2); //������ 00000101�� 1�� �������� 2ĭ �δ�. �տ� ��� ������ �и��� �Ǹ� ���ܵ� => 00000001 
	}
}
