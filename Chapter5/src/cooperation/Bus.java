package cooperation;

public class Bus {
	
	//������� Ŭ������ ����
	int busNumber; //������ȣ
	int passengerCount; //�°� ��
	int money; //����
	
	//�ʱ�ȭ �ϱ� ���ؼ� Constructor(������)�� �����.
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		//���� �ܵ� �ʿ� ���ٰ� �����ϰ� ������ ����
	}
	
	//�°��� �¿�� �޼���
	public void take(int money) { //�°��� ���� �����ϰ� �Ǹ�
		this.money += money; //������ ���ѵ��� += ���ҵ� ��
		passengerCount++; //�°��� 1�� ž��
	}
	// �¿ﶧ ���� ���� �����ϰ� ��
	
	
	//������ ��Ȳ�� ����.
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
	
}
