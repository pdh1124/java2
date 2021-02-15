package inheritance;

public class VIPCustomer extends Customer { 
//extends Customer의 기능 상속
	
	
//	private int customerID; //고객 아이디
//	private String customerName; //고객 성함
//	private String customerGrade; //고객등급 - 기본 생성자에서 지정되는 기본 등급은 SILVER
//	int bonusPoint; //고객의 보너스 포인트 - 고객이 제품을 구매할 경우 누적되는 보너스 포인트
//	double bonusRatio; //보너스 포인트 적립 비율 - 고객이 제품을 구매할 때 구매금액의 일정 비율이 보너스 포인트로 적립됨. 이때 계산되는 적립 비율
//	                //기본 생성자에서 지정 되는 적립 비율은 1%. 즉 10,000원짜리 상품을 구매하면 100원이 적립
	
	
	double salesRatio; //할인률
	private int agentID; //VIP고객 전담 담당 상담원
	
	/*
	public VIPCustomer() {
		
		//super(); //상위클래스의 메모리 위치(this는 자기 자신을 불러낸다면 super는 상위클래스로 불러낸다)
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/
	//생성자에서 super로 상위클래스에 있는 고객정보를 받는다.
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); 

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
}
