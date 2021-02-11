
public class WhyMethod3 {
	//메소드 생성
	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}
	
	//조금만 달라져도 메소드를 다시 정의해야 함
	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
	}
	
	//표현하고자 하는 텍스트에 따라 메소드를 따로 만들 필요 없음
	//(String text, String delimiter) = 매개변수, parameter라고 함
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
	public static void main(String[] args) {
		
		//100000000
//		System.out.println("-");
//		System.out.println("A");
//		System.out.println("A");
		//100000000
//		System.out.println("-");
//		System.out.println("A");
//		System.out.println("A");
		//메소드를 이용해 단축
		
		
		//100000000
//		printTwoTimesA(); //메소드 사용하는 것
		//100000000
//		printTwoTimesA(); //메소드 사용하는 것
		//100000000
//		printTwoTimesB(); //메소드 사용하는 것

		
		//100000000
		//("A", "-") = 인자, argument(아규먼트) 라고 함
		printTwoTimes("A", "-"); //메소드에 
		//100000000
		printTwoTimes("A", "*"); //메소드 사용하는 것
		//100000000
		printTwoTimes("B", "&");
		
		System.out.println(twoTimes("a", "*"));
	}

}
