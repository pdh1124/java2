package chapter5;

public class MydateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(31, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
	}

}
