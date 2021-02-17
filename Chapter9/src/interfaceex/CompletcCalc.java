package interfaceex;

public class CompletcCalc extends Calculator {
	
	//Calculator에서 오버라이드 받지 못한 나머지
	@Override
	public int times(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			return ERROR;
		}
		else {
		return num1 / num2;
		}
	}
	
	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}

}
