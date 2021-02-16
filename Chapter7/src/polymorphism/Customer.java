package polymorphism;

public class Customer {
	
	//protected는 하위 클래스의 접근을 할 수 있게 함
	protected int customerID; //고객 아이디
	protected String customerName; //고객 성함
	protected String customerGrade; //고객등급 - 기본 생성자에서 지정되는 기본 등급은 SILVER
	int bonusPoint; //고객의 보너스 포인트 - 고객이 제품을 구매할 경우 누적되는 보너스 포인트
	double bonusRatio; //보너스 포인트 적립 비율 - 고객이 제품을 구매할 때 구매금액의 일정 비율이 보너스 포인트로 적립됨. 이때 계산되는 적립 비율
	                //기본 생성자에서 지정 되는 적립 비율은 1%. 즉 10,000원짜리 상품을 구매하면 100원이 적립
	
	
	//디폴트 컨스트럭트 = 초기화
	/*기본 초기값을 설정 안해주고 생성자가 있으면 기본적으로 기본초기값을 제공해 주지 않음
	public Customer() {
		customerGrade = "SILVER"; //처음 등급은 실버
		bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER"; //처음 등급은 실버
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 생성자 호출");
	}
	//가격 계산하는 함수를 만듦
	public int calcPrice(int price/*가격을 받음*/) {
		bonusPoint += price * bonusRatio; //보너스 포인트
		
		return price; //지불할 가격을 반환해 줌
	}
	
	//고객의 상태 확인하는 메소드
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}
	
	
	
	
	
	//private 부분의 getter,setter를 만듦
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
