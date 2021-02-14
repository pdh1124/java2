package cooperation;

public class Student {
	
	//1.���� ����
	String studentName; // �л��̸�
	int grade; //�г�
	int money; //������
	
	//2.�ʱ�ȭ
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//12. ������ Ÿ�� �޼ҵ�
	public void takeBus(Bus bus) { //� ������ ſ���� �Ű������� �޴´�.
		bus.take(1000); //���� ������
		this.money -= 1000; //�������� ���ҵ�
	}
	
	//13. ����ö�� Ÿ�� �޼ҵ�
	public void takeSubway(Subway subway) { //� ����ö�� ſ���� �Ű������� �޴´�.
		subway.take(1200); //���� ������
		this.money -= 1200; //�������� ���ҵ�
	}
	
	//a5. �ýô� Ÿ�� �޼ҵ�
	public void takeTaxi(Taxi taxi) { //� �ýø� ſ���� �Ű������� �޴´�.
		taxi.take(10000); //���� ������
		this.money -= 10000; //�������� ���ҵ�
	}
	
	//3.�󸶰� ���Ҵ��� ���
	public void showInfo() {
		System.out.println(studentName +"���� ���� ���� " + money + "�� �Դϴ�");
	}
}
