package cooperation;

public class Student {
	
	//�л� Ŭ������ ����
	String studentName; //�̸�
	int grade; //�г�
	int money; //���� ��
	

	//�ʱ�ȭ �ϱ� ���ؼ� Constructor(������)�� �����.
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		//������ ���� grade�� �� �ʿ䰡 ��� �Ⱦ�
	}
	
	
	//�л��� ������ Ÿ�� ��Ȳ�� ���� �� �ְ�, ����ö�� ����� ��Ȳ�� ���� �� �ִ�.
	//(��ü�� �����κ� ����)
	
	//������ Ÿ��
	public void takeBus(Bus bus/*� ������ Ż�� �Ű������� ����*/) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	//����ö�� Ÿ��
	public void takeSubway(Subway subway/*� ����ö�� Ż�� �Ű������� ����*/) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	//�ýø� Ÿ��
	public void takeTexi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	//(��ü�� ���� �κ� ��)
	
	
	
	//���� �󸶳� ���Ҵ��� ���
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "���� ���ҽ��ϴ�.");
	}
	
}
