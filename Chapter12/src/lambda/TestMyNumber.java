package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyMaxNumber max = (x, y) -> (x >= y)? x: y;
		//x,y��� �Ű����� 2���� �Ѿ� ���µ� MyMaxNumber��� �������̽� �޼ҵ尡 ȣ��Ǹ�
		//getMaxNumber�� ��� ���� �ϴ���, �׷��� �Լ� �̸��� �Ⱦ�(�͸�) =>�׷��� ������ �޼ҵ尡 �ϳ��ۿ� ����� ��
		//MyMaxNumber�� max��� �̸����� ������ �ִ� 2�� ������ �Ѿ������ ���߿��� �� ū���� ��ȯ �� �־��
		
		System.out.println(max.getMaxNumber(10, 20 ));
	}

}
