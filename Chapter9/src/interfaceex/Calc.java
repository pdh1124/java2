package interfaceex;

//class�� �ƴϰ� interface�� ����.
public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2); 
	int substract(int num1, int num2); 
	int times(int num1, int num2);
	int divide(int num1, int num2);

	//�޼ҵ带 ���� �� �� ������ ��ȯ��, �Լ��� �̸�, �Լ��� �Ű��������� �����ϴ°��� �Լ��� �ñ״�ó��� �Ѵ�.
	//�Լ��� ��Ҹ� ������ �� �ִٴ� ���� � �Ű������� �޾Ƽ� � ������ �ؼ� � ��ȯ�� �ؾ����� �Ӹ��ӿ� �ִ°�
	//�׷��� ���谡 �߿��� ����
	//public String stringAdd( String s1, String s2);
}
