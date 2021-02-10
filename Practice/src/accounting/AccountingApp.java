package accounting;

public class AccountingApp {

	public static void main(String[] args) {
		
		//��ǰ ����ϱ�
		
		double valueOfSupply = Double.parseDouble(args[0]); //��ǰ ����
		//Double.parseDouble�� String�� double������ �ٲٴ� ���
		double vatRate = 0.1; //�ΰ����� �ۼ�Ʈ
		double expenseRate = 0.3; //����
		double vat = valueOfSupply * vatRate; //�ΰ��� 
		double total = valueOfSupply + vat; //�հ�
		double expense = valueOfSupply * expenseRate; //��ǰ�� ����
		double income = valueOfSupply - expense; //������
		double dividend1 = income * 0.5; //���� �й� 1
		double dividend2 = income * 0.3; //���� �й� 2
		double dividend3 = income * 0.2; //���� �й� 3
		
		System.out.println("value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1);
		System.out.println("Dividend 2 : " + dividend2);
		System.out.println("Dividend 3 : " + dividend3);
		

	}

}
