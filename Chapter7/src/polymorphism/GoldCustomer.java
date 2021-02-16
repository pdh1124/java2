package polymorphism;

public class GoldCustomer extends Customer {

	//상속을 하지 않는다면 Customer.java에 변수들을 다 가져온 후 
	//수정되는 변수를 지정한 뒤
	//Test.java에서 if 문으로 gold일때 silver일때 VIP일떄를 각각 다 지정을 해줘야 한다.
		
	
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
