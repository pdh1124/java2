package abstractex;

public abstract class Computer {
	
	//�߻� �޼ҵ�(abstract) - ���� Ŭ�������Ե� abstract�� �־�� ��
	//���� ������ ���� Ŭ�������� ������ �ɶ� ���
	//�ܵ����� ���� �ʰ� ���� Ŭ������ ����� ���� å���� ����Ŭ������ ���� �д�.
	public abstract void display();
	public abstract void typing();
	
	
	//��� ���� Ŭ������ ���������� �� �� �ִ� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
