//&-1 �� Ŭ���� ȭ
//&-2 �� �ν��Ͻ� ȭ

//1-1.���������� ���� ����� �͵鳢�� ��Ƽ� �̸��� ���δ�.
//2-1.�ΰ� ��ġ���� ������ �ڵ�鸸�� �̵� ��Ŵ
class Accounting {
	
	//2-2 static�� ����
	public double valueOfSupply;
	public static double vatRate = 0.1;
	//4-2 ������ ����
	public Accounting(double valueOfsupply) {
		this.valueOfSupply = valueOfSupply; 
		
	}
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp {

	//0-1.... ��� ���� �ٸ� �ǹ��� �ڵ尡 �ִٰ� ����
	
    //... 
	
	//1-2 �ؿ� �ڵ带 �ν��Ͻ�ȭ�� ���鶧
	//3-2 �ν��Ͻ�ȭ�� �Ҷ� ������ȭ�� �Ҷ���
    public static void main(String[] args) {
    	Accounting a1 = new Accounting(10000.0);
    	//a1.valueOfSupply = ;
    	Accounting a2 = new Accounting(20000.0);
    	//a2.valueOfSupply = 20000.0;
    	
    	System.out.println("Value of supply : " + a1.valueOfSupply);
    	System.out.println("Value of supply : " + a2.valueOfSupply);
    	
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("VAT : " + a2.getVAT());
    	
    	System.out.println("Total : " + a1.getTotal());
    	System.out.println("Total : " + a2.getTotal());
    	
    	//4-1.Ŭ������ �ΰ���ġ���� ������ �ڵ带 �Ű� ������ �ڵ忡 Accounting.�� ���δ�.
    	//0-2.�ȿ� ȣ�� �Ҷ����� ���ް����� �����ؼ� �÷��� �Ҷ�
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("VAT : " + Accounting.getVAT());
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("VAT : " + Accounting.getVAT());
//		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Total : " + Accounting.getTotal());
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("Total : " + Accounting.getTotal());
		
		 
    }
	
}
