//1.���������� ���� ����� �͵鳢�� ��Ƽ� �̸��� ���δ�.
//2.�ΰ� ��ġ���� ������ �ڵ�鸸�� �̵� ��Ŵ
class Accounting {
	public static double valueOfSupply;
	public static double vatRate = 0.1;
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp {

	//0.... ��� ���� �ٸ� �ǹ��� �ڵ尡 �ִٰ� ����
	
    //... 
    public static void main(String[] args) {
	 
    	//4.Ŭ������ �ΰ���ġ���� ������ �ڵ带 �Ű� ������ �ڵ忡 Accounting.�� ���δ�.
		Accounting.valueOfSupply = 10000.0;
		System.out.println("Value of supply : " + Accounting.valueOfSupply);
		System.out.println("VAT : " + Accounting.getVAT());
		System.out.println("Total : " + Accounting.getTotal());
		 
    }
	
}
