
public class WhyMethod3 {
	//�޼ҵ� ����
	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}
	
	//���ݸ� �޶����� �޼ҵ带 �ٽ� �����ؾ� ��
	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
	}
	
	//ǥ���ϰ��� �ϴ� �ؽ�Ʈ�� ���� �޼ҵ带 ���� ���� �ʿ� ����
	//(String text, String delimiter) = �Ű�����, parameter��� ��
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
		//�޼ҵ带 �̿��� ����
		
		
		//100000000
//		printTwoTimesA(); //�޼ҵ� ����ϴ� ��
		//100000000
//		printTwoTimesA(); //�޼ҵ� ����ϴ� ��
		//100000000
//		printTwoTimesB(); //�޼ҵ� ����ϴ� ��

		
		//100000000
		//("A", "-") = ����, argument(�ƱԸ�Ʈ) ��� ��
		printTwoTimes("A", "-"); //�޼ҵ忡 
		//100000000
		printTwoTimes("A", "*"); //�޼ҵ� ����ϴ� ��
		//100000000
		printTwoTimes("B", "&");
		
		System.out.println(twoTimes("a", "*"));
	}

}
