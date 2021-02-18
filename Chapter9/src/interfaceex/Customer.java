package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
		
	}
	
	
	//Buy.java에 있는 order와 Sell.java에 있는 order가 하면 Buy의 order를 쓰든 Sell에 order를 쓰든 해야 함
	//아니면 직접 재정의를 해도 됨
	@Override
	public void order() {
		System.out.println("customer order");
		
	}
	
	public void sayHello() {
		System.out.println("hello");
	}

}
