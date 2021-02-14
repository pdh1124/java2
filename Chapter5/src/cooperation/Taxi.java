package cooperation;

public class Taxi {
	
	//a1. 변수 지정
	String companyName; //택시 종류
	int money; //돈
	
	//a2. 초기화
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	//a3. 택시의 수입
	public void take(int money) { //승차하면서 돈을 지불하기 때문에 매개변수에 돈을 받아줌 
		this.money += money; // 자기 자신의 돈에 지불 받은 돈을 증가
	}
	
	//a4. 택시 상황 출력
	public void showTaxInfo() {
		System.out.println(companyName + "택시 수입은 " + money + "원 입니다.");
	}
}
