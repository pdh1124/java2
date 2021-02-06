package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		//�л��� �����.
		
		//studentJ������ James��� �̸��� �л��� 5000���� �����ϰ� �ִ�.
		Student studentJ = new Student("James", 5000);
		
		//studentT������ Tomas��� �̸��� �л��� 10000���� �����ϰ� �ִ�.
		Student studentT = new Student("Tomas", 10000);
		
		//studentE������ Edward��� �̸��� �л��� 15000���� �����ϰ� �ִ�.
		Student studentE = new Student("Edward", 15000);
		
		//������ ����
		//bus100�̶�� ������ Bus��ȣ 100���� �������.
		Bus bus100 = new Bus(100);
		
		//bus101�̶�� ������ Bus��ȣ 101���� �������.
		Bus bus101 = new Bus(101);
		
		//bus500�̶�� ������ Bus��ȣ 500���� �������.
		Bus bus500 = new Bus(500);
		
		//����ö ����
		//subwayBlue�̶� ������ 4�� ������ ����ö ����(4ȣ��-�Ķ�����)
		Subway subwayBlue = new Subway(4);
		
		
		//subwayGreen�̶� ������ 2�� ������ ����ö ����(2ȣ��-�������)
		Subway subwayGreen = new Subway(2);
		
		
		//�ýû���
		//�Ϲ��ý� ��� 10000�� ����
		Texi texiNormal = new Texi("�Ϲ�");
		//����ý� ��� 20000�� ����
		Texi texiSpaical = new Texi("���");
		
		
		//James�� 100�� ������ ����.
		studentJ.takeBus(bus100);
		
		//Tomas�� ����ö 2ȣ���� ����.
		studentT.takeSubway(subwayGreen);
		
		//Edward�� �Ϲ� �ýø� ſ��.
		studentE.takeTexi(texiNormal);
		
		//James,Tomas ��Ȳ�� ���
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		//������Ȳ ���
		bus100.showBusInfo();
		bus101.showBusInfo();
		bus500.showBusInfo();
		
		//����ö ��Ȳ ���
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		
		//�ý� ��Ȳ ���
		texiNormal.showTexiInfo();
		texiSpaical.showTexiInfo();
	}

}
