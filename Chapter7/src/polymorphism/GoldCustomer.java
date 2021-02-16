package polymorphism;

public class GoldCustomer extends Customer {

	//����� ���� �ʴ´ٸ� Customer.java�� �������� �� ������ �� 
	//�����Ǵ� ������ ������ ��
	//Test.java���� if ������ gold�϶� silver�϶� VIP�ϋ��� ���� �� ������ ����� �Ѵ�.
		
	
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
	
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
}
