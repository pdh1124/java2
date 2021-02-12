//������� Ŭ���� Cal�� ������ �� ���� ���°� ��
//1. ���� ������� ���� �ְų�
//2. �������� Ŭ������ �ƴϰų�
//3. �ڹ� ������ �ִ� ����Ǿ� �ִ� Ŭ�����̰ų�

class Cal{
	public int sum(int v1,int v2) {
		return v1+v2;
	}
	//Overloading(���̺� ���ϸ��� ���� �Ȱ��� �̸����� �Ǿ��ִ� ���������� �����δ� ���̺�� ������ �ٸ�)
	public int sum(int v1,int v2, int v3) {
		return v1+v2+v3;
	}
}

//class Cal�� ���̳ʽ� ����� �ְ� �ʹٸ� ��ӹ��� Ŭ������ ����� �ָ� ��
//Cal Ŭ������ Ȯ���ؼ� CalŬ������ ������ �ִ� ��� �޼ҵ�� ������ ��ӹް� �Ǵ� Ŭ���� Cal3�� �ȴ�.
class Cal3 extends Cal {
	//��� �ϸ� �ڽ� Ŭ������ �θ�Ŭ���� ������ �ִ� ��ɿ� �߰��ϰų� ����� ���� ���
	//���̳ʽ� ��� �߰�
	public int minus(int v1,int v2) {
		return v1-v2;
	}
	//Cal�� ������ �ִ� sum�̶�� ����� sum�� ������ �� �ִ�. (�������̵�(Overriding)�̶�� ��)
	//�Ȱ��� ������ �޼ҵ带 �߰��ϰ� ������
	public int sum(int v1,int v2) {
		System.out.println("Cal3"); //������ ����
		return v1+v2;
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 5));
		
		//Ŭ���� Cal3�� ��ӹް� �ִ� Ŭ����Cal�ִ� sum�̶�� �޼ҵ带 ����� �� ����
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,3));
		System.out.println(c3.minus(5,3));
		System.out.println(c3.sum(2,1));
	}
}
