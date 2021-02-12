//1.정리정돈은 서로 비슷한 것들끼리 모아서 이름을 붙인다.
//2.부가 가치세에 연관된 코드들만을 이동 시킴
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

	//0.... 라는 것은 다른 의미의 코드가 있다고 생각
	
    //... 
    public static void main(String[] args) {
	 
    	//4.클래스에 부가가치세에 연관된 코드를 옮겨 각각의 코드에 Accounting.을 붙인다.
		Accounting.valueOfSupply = 10000.0;
		System.out.println("Value of supply : " + Accounting.valueOfSupply);
		System.out.println("VAT : " + Accounting.getVAT());
		System.out.println("Total : " + Accounting.getTotal());
		 
    }
	
}
