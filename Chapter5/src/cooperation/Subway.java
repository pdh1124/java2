package cooperation;

public class Subway {
	
	//8. ���� ����
	int lineNumber; //����ö �뼱��ȣ
	int passengerCount; //�°���
	int money; //��
	
	//9. �ʱ�ȭ
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//10. �°��� �¿�� �޼ҵ�
	public void take(int money) { //�����ϸ鼭 ���� �����ϱ� ������ �Ű������� ���� �޾���
		this.money += money; // �ڱ� �ڽ��� ���� ���� ���� ���� ����
		passengerCount++; //�°� �� ����.
	}
	
	//11. ����ö ��Ȳ ���
	public void showSubwayInfo() {
		System.out.println(lineNumber + "ȣ�������� ����ö �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�");
	}
}
