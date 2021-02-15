package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
			
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		//이순신님의 등급은 SILVER이며, 적립된 보너스 포인트는 1100점 입니다.지불금액은 10000원 입니다.
		//적립포인트 0.01 적립이 됬고, 지불금액은 그대로 
		
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");
		//김유신님의 등급은 VIP이며, 적립된 보너스 포인트는 10500점 입니다.지불금액은 9000원 입니다.
		//적립 포인트 0.05가 됬고, 지불금액 0.1할인 됨
		
		
		Customer customerNo = new VIPCustomer(10030, "노웅규");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) + "원 입니다.");
	}

}
