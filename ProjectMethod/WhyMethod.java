
public class WhyMethod {
	//메소드 생성
	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}
	public static void main(String[] args) {
		
		//100000000
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
		//100000000
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
		//메소드를 이용해 단축
		
		
		//100000000
		printTwoTimesA(); //메소드 사용하는 것
		//100000000
		printTwoTimesA(); //메소드 사용하는 것
		//100000000
		printTwoTimesA(); //메소드 사용하는 것
		
		
	}

}
