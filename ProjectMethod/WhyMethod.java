
public class WhyMethod {
	//�޼ҵ� ����
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
		//�޼ҵ带 �̿��� ����
		
		
		//100000000
		printTwoTimesA(); //�޼ҵ� ����ϴ� ��
		//100000000
		printTwoTimesA(); //�޼ҵ� ����ϴ� ��
		//100000000
		printTwoTimesA(); //�޼ҵ� ����ϴ� ��
		
		
	}

}
