package cooperation;

public class Bus {
	
	//4. ���� ����
	int busNumber; //���� ��ȣ
	int passengerCount; //�°���
	int money; //��
	
	
	//5. �ʱ�ȭ
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//6. �°��� �¿�� �޼ҵ�
	public void take(int money) {  //�����ϸ鼭 ���� �����ϱ� ������ �Ű������� ���� �޾���
		this.money += money;  // �ڱ� �ڽ��� ���� ���� ���� ���� ����
		passengerCount++;  //�°� �� ����
	}
	
	//7. ���� ��Ȳ ���
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�");
	}
}
