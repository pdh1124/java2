package polymorphism;

public class Customer {
	
	//protected�� ���� Ŭ������ ������ �� �� �ְ� ��
	protected int customerID; //�� ���̵�
	protected String customerName; //�� ����
	protected String customerGrade; //����� - �⺻ �����ڿ��� �����Ǵ� �⺻ ����� SILVER
	int bonusPoint; //���� ���ʽ� ����Ʈ - ���� ��ǰ�� ������ ��� �����Ǵ� ���ʽ� ����Ʈ
	double bonusRatio; //���ʽ� ����Ʈ ���� ���� - ���� ��ǰ�� ������ �� ���űݾ��� ���� ������ ���ʽ� ����Ʈ�� ������. �̶� ���Ǵ� ���� ����
	                //�⺻ �����ڿ��� ���� �Ǵ� ���� ������ 1%. �� 10,000��¥�� ��ǰ�� �����ϸ� 100���� ����
	
	
	//����Ʈ ����Ʈ��Ʈ = �ʱ�ȭ
	/*�⺻ �ʱⰪ�� ���� �����ְ� �����ڰ� ������ �⺻������ �⺻�ʱⰪ�� ������ ���� ����
	public Customer() {
		customerGrade = "SILVER"; //ó�� ����� �ǹ�
		bonusRatio = 0.01;
		
		System.out.println("Customer() ������ ȣ��");
	}
	*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER"; //ó�� ����� �ǹ�
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) ������ ȣ��");
	}
	//���� ����ϴ� �Լ��� ����
	public int calcPrice(int price/*������ ����*/) {
		bonusPoint += price * bonusRatio; //���ʽ� ����Ʈ
		
		return price; //������ ������ ��ȯ�� ��
	}
	
	//���� ���� Ȯ���ϴ� �޼ҵ�
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ������ ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
	}
	
	
	
	
	
	//private �κ��� getter,setter�� ����
	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}
