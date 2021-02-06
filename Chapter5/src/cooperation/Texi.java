package cooperation;

public class Texi {
	
	//추가문제

	//택시라는 클래스를 만듦
	String TexiNumber; //택시 번호
	int passengerCount; //승객 수
	int money; //수입
	
	//초기화를 해줌
	public Texi(String TexiNumber) {
		this.TexiNumber = TexiNumber;
	}
	
	//택시를 타면
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	
	//상황을 띄우면
	public void showTexiInfo() {
		System.out.println(TexiNumber + "택시에 " + passengerCount + "명의 승객을 태워서 택시의 수입은 " + money + "원 입니다.");
	}
	
	
}
