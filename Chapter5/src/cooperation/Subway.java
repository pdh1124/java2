package cooperation;

public class Subway {
	
	//8. 변수 지정
	int lineNumber; //지하철 노선번호
	int passengerCount; //승객수
	int money; //돈
	
	//9. 초기화
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//10. 승객을 태우는 메소드
	public void take(int money) { //승차하면서 돈을 지불하기 때문에 매개변수에 돈을 받아줌
		this.money += money; // 자기 자신의 돈에 지불 받은 돈을 증가
		passengerCount++; //승객 수 증가.
	}
	
	//11. 지하철 현황 출력
	public void showSubwayInfo() {
		System.out.println(lineNumber + "호선라인의 지하철 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}
}
