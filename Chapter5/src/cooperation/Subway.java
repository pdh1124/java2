package cooperation;

public class Subway {
	
	//����ö�� Ŭ������ ����
	int lineNumber; //�뼱 ��ȣ
	int passengerCount; //�°� ��
	int money; //����
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	//�°��� �¿�� �޼���
	public void take(int money) { //�°��� ���� �����ϰ� �Ǹ�
		this.money += money; //������ ���ѵ��� += ���ҵ� ��
		passengerCount++; //�°��� 1�� ž��
	}
	
	//����ö�� ��Ȳ�� ����.
		public void showSubwayInfo() {
			System.out.println(lineNumber + "�� ������ ����ö�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
		}
} 
