package cooperation;

public class Texi {
	
	//�߰�����

	//�ýö�� Ŭ������ ����
	String TexiNumber; //�ý� ��ȣ
	int passengerCount; //�°� ��
	int money; //����
	
	//�ʱ�ȭ�� ����
	public Texi(String TexiNumber) {
		this.TexiNumber = TexiNumber;
	}
	
	//�ýø� Ÿ��
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	
	//��Ȳ�� ����
	public void showTexiInfo() {
		System.out.println(TexiNumber + "�ýÿ� " + passengerCount + "���� �°��� �¿��� �ý��� ������ " + money + "�� �Դϴ�.");
	}
	
	
}
