package inheritance;

public class VIPCustomer extends Customer { 
//extends Customer�� ��� ���
	
	
//	private int customerID; //�� ���̵�
//	private String customerName; //�� ����
//	private String customerGrade; //����� - �⺻ �����ڿ��� �����Ǵ� �⺻ ����� SILVER
//	int bonusPoint; //���� ���ʽ� ����Ʈ - ���� ��ǰ�� ������ ��� �����Ǵ� ���ʽ� ����Ʈ
//	double bonusRatio; //���ʽ� ����Ʈ ���� ���� - ���� ��ǰ�� ������ �� ���űݾ��� ���� ������ ���ʽ� ����Ʈ�� ������. �̶� ���Ǵ� ���� ����
//	                //�⺻ �����ڿ��� ���� �Ǵ� ���� ������ 1%. �� 10,000��¥�� ��ǰ�� �����ϸ� 100���� ����
	
	
	double salesRatio; //���η�
	private int agentID; //VIP�� ���� ��� ����
	
	/*
	public VIPCustomer() {
		
		//super(); //����Ŭ������ �޸� ��ġ(this�� �ڱ� �ڽ��� �ҷ����ٸ� super�� ����Ŭ������ �ҷ�����)
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	*/
	//�����ڿ��� super�� ����Ŭ������ �ִ� �������� �޴´�.
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); 

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
}
