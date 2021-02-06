package cooperation;

public class Bus {
	
	//버스라는 클래스를 만듦
	int busNumber; //버스번호
	int passengerCount; //승객 수
	int money; //수입
	
	//초기화 하기 위해서 Constructor(생성자)를 만든다.
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		//요즘 잔돈 필요 없다고 가정하고 만들지 않음
	}
	
	//승객을 태우는 메서드
	public void take(int money) { //승객이 돈을 지불하게 되면
		this.money += money; //버스가 지닌돈에 += 지불된 돈
		passengerCount++; //승객이 1명씩 탑승
	}
	// 태울때 마다 돈이 증가하게 됨
	
	
	//버스의 상황을 띄운다.
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
	
}
