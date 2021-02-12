//&-1 은 클래스 화
//&-2 은 인스턴스 화

//1-1.정리정돈은 서로 비슷한 것들끼리 모아서 이름을 붙인다.
//2-1.부가 가치세에 연관된 코드들만을 이동 시킴
class Accounting {
	
	//2-2 static을 삭제
	public double valueOfSupply;
	public static double vatRate = 0.1;
	//4-2 생성자 생성
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

	//0-1.... 라는 것은 다른 의미의 코드가 있다고 생각
	
    //... 
	
	//1-2 밑에 코드를 인스턴스화로 만들때
	//3-2 인스턴스화를 할때 생성자화를 할때는
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
    	
    	//4-1.클래스에 부가가치세에 연관된 코드를 옮겨 각각의 코드에 Accounting.을 붙인다.
    	//0-2.안에 호출 할때마다 공급가액을 수정해서 올려야 할때
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
