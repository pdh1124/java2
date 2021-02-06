package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
//		date.day = 10;
//		date.month = 7;
//		date.year = 2010;
		
		
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(10);
		
		
		date.showDate();
		
		MyDate date2 = new MyDate();
		date2.setYear(2002);
		
	}

}
