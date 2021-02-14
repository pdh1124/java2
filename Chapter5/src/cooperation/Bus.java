package cooperation;

public class Bus {
	
	//4. 변수 지정
	int busNumber; //버스 번호
	int passengerCount; //승객수
	int money; //돈
	
	
	//5. 초기화
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//6. 승객을 태우는 메소드
	public void take(int money) {  //승차하면서 돈을 지불하기 때문에 매개변수에 돈을 받아줌
		this.money += money;  // 자기 자신의 돈에 지불 받은 돈을 증가
		passengerCount++;  //승객 수 증가
	}
	
	//7. 버스 상황 출력
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}
}
