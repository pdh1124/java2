package variable;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1000;
		byte bNum = (byte)i; //����� �� ��ȯ => �������� ������ �߻� �� �� ����
		
		System.out.println(bNum); //-24�� ���� ������ ������ �������� ������ ����
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1); //1 �Ҽ��� ������ �κ��� �����Ǽ� 1+0�� 1
		System.out.println(iNum2); //2 ���� �� �Ҽ��� ���ϸ� ���ּ� 2.1�� 2�� ��
	}

}
