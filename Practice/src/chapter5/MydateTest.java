package chapter5;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate d1 = new MyDate(22,1,2020);
		d1.showInfo();
		MyDate d2 = new MyDate(29,2,2021);
		d2.showInfo();
		MyDate d3 = new MyDate(29,2,2020);
		d3.showInfo();
		MyDate d4 = new MyDate(28,2,1992);
		d4.showInfo();

	}

}
