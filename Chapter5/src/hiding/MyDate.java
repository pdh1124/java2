package hiding;

public class MyDate {

	//public : 외부에 모두 오픈하겠다.
	//private : 클래스 내부에서만 쓰겠다. 오픈하지 않겠다.
	//protected : 클래스간의 상속 관계가 있는데 상위 클래스의 가진 프라이빗 변수나 메서드를 하위 클래스의 퍼블릭하게 오픈하고 싶을때 사용.
	//아무것도 안쓰는 경우 : 기본 접근 제어자로 같은 패키지 내에서만 참고 가능
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	

	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if (isValid) {
		System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
}
