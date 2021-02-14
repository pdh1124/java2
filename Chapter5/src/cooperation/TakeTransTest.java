package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		//14. �л� ����
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		//15. ������ ������ ����ö�� ����
		Bus bus100 = new Bus(100); //100�� ����
		Bus bus500 = new Bus(500); //500�� ����
		Subway subwayGreen = new Subway(2); //2ȣ�� ������ ����ö
		Subway subwayBlue = new Subway(4); //4ȣ�� ������ ����ö
		
		
		//16. �л��� ���� ������ ž����
		studentJ.takeBus(bus100); //James�� 100�� ������ ž��
		studentT.takeSubway(subwayGreen); //Tomas�� 2ȣ�� ������ ����ö�� ž��
		
		//17. �л��� ���� ��Ȳ ���
		studentJ.showInfo();
		studentT.showInfo();
		
		//18. ���߱��뿡 ���� ��Ȳ ���
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		
		System.out.println("------------------ \n���� �غ���");
		
		
		//a6. ��������� �л��� ����
		Student studentE = new Student("Edward", 20000);
		//a7. �ý� ����
		Taxi wellTaxi = new Taxi("�Ϲ�"); //�Ϲ� �ý�
		Taxi specialTaxi = new Taxi("���"); //��� �ý�
		
		//a8. ������尡 �ýÿ� ž����
		studentE.takeTaxi(wellTaxi); //������尡 �Ϲ� �ýÿ� ž����
		
		//a9. ��������� ��Ȳ ���
		studentE.showInfo();
		
		//a10. �ý��� ��Ȳ ���
		wellTaxi.showTaxInfo();
		specialTaxi.showTaxInfo();
	}

}
