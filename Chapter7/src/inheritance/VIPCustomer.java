package inheritance;

public class VIPCustomer extends Customer { //extends Customer�� ��� ���
	
	
//	private int customerID; //�� ���̵�
//	private String customerName; //�� ����
//	private String customerGrade; //����� - �⺻ �����ڿ��� �����Ǵ� �⺻ ����� SILVER
//	int bonusPoint; //���� ���ʽ� ����Ʈ - ���� ��ǰ�� ������ ��� �����Ǵ� ���ʽ� ����Ʈ
//	double bonusRatio; //���ʽ� ����Ʈ ���� ���� - ���� ��ǰ�� ������ �� ���űݾ��� ���� ������ ���ʽ� ����Ʈ�� ������. �̶� ���Ǵ� ���� ����
//	                //�⺻ �����ڿ��� ���� �Ǵ� ���� ������ 1%. �� 10,000��¥�� ��ǰ�� �����ϸ� 100���� ����
	
	
	double salesRatio; //���η�
	private int agentID; //VIP�� ���� ��� ����
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
}
