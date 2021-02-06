package cooperation;

public class Subway {
	
	//지하철의 클래스를 만듦
	int lineNumber; //노선 번호
	int passengerCount; //승객 수
	int money; //수입
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	//승객을 태우는 메서드
	public void take(int money) { //승객이 돈을 지불하게 되면
		this.money += money; //버스가 지닌돈에 += 지불된 돈
		passengerCount++; //승객이 1명씩 탑승
	}
	
	//지하철의 상황을 띄운다.
		public void showSubwayInfo() {
			System.out.println(lineNumber + "번 라인의 지하철의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
		}
} 
