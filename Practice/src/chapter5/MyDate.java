package chapter5;

public class MyDate {
	
	//1. 변수 지정 (private : 보호)
	private int day; //일
	private int month; //월
	private int year; //년
	private boolean isValid = false;
	
	public MyDate(int day, int month, int year) {
	
		
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			if(day < 0 || day > 31) {
				isValid = false;
			}
			else {
				isValid = true;
				this.day = day;
			}
		case 4: case 6: case 9: case 11:
			if(day < 0 || day > 30) {
				isValid = false;
			}
			else {
				isValid = true;
				this.day = day;
			}
		case 2:
			if(( ( year % 4 ==0 &&  year % 100 !=0 ) || year % 400 ==0)) { //윤년 (2월 29일이 있는 해)
				if(day < 0 || day > 29) {
					isValid = false;
				}
				else {
					isValid = true;
					this.day = day;
				}
			}
			else {
				if(day < 0 || day > 28) {
					isValid = false;
				}
				else {
					isValid = true;
					this.day = day;
				}
			}
		}
	}

	
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
			
		} else {
			isValid = true;
			this.month = month;
		}
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 0) {
			isValid = false;
		} else {
			isValid = true;
			this.year = year;
		}
		
	}
	
	public void showInfo() {
		if(isValid == true) {
		System.out.println(year + "년 " + month + "월 " + day + "일, 유효한 날짜 입니다.");
		} else {
			System.out.println("유효하지 않는 날짜 입니다.");
		}
	}
	
	
}
