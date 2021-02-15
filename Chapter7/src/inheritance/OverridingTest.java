package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
			
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo() + "���ұݾ��� " + priceLee + "�� �Դϴ�.");
		//�̼��Ŵ��� ����� SILVER�̸�, ������ ���ʽ� ����Ʈ�� 1100�� �Դϴ�.���ұݾ��� 10000�� �Դϴ�.
		//��������Ʈ 0.01 ������ ���, ���ұݾ��� �״�� 
		
		System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� " + priceKim + "�� �Դϴ�.");
		//�����Ŵ��� ����� VIP�̸�, ������ ���ʽ� ����Ʈ�� 10500�� �Դϴ�.���ұݾ��� 9000�� �Դϴ�.
		//���� ����Ʈ 0.05�� ���, ���ұݾ� 0.1���� ��
		
		
		Customer customerNo = new VIPCustomer(10030, "�����");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo() + "���ұݾ��� " + customerNo.calcPrice(10000) + "�� �Դϴ�.");
	}

}
