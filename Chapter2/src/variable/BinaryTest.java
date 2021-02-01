package variable;

public class BinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10을 각각 진수로 쓰면
		int num = 10;
		int bNum = 0B1010; //2진수 0B를 앞에 쓰면 됨
		int oNum = 012; //8진수 앞에 0을 쓰면 됨
		int xNum = 0XA; //16진수 앞에 0X를 넣으면 됨
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
