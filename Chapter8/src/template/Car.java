package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� ŵ�ϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}
	
	//final�� ���̰� �Ǹ� ������ �� �� ���� �޼ҵ尡 �� ('�õ��� Ű�� - ����̺� �ϰ� - ���߰� - �õ�����'�� �ó������� �ٲ�� �ȵ�)
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
