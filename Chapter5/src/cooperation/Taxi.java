package cooperation;

public class Taxi {
	
	//a1. ���� ����
	String companyName; //�ý� ����
	int money; //��
	
	//a2. �ʱ�ȭ
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	//a3. �ý��� ����
	public void take(int money) { //�����ϸ鼭 ���� �����ϱ� ������ �Ű������� ���� �޾��� 
		this.money += money; // �ڱ� �ڽ��� ���� ���� ���� ���� ����
	}
	
	//a4. �ý� ��Ȳ ���
	public void showTaxInfo() {
		System.out.println(companyName + "�ý� ������ " + money + "�� �Դϴ�.");
	}
}
