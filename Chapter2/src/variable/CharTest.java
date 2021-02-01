package variable;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A'; //한글자
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int ich = 66;
		System.out.println(ich);
		System.out.println((char)ich);
		
		char hangul = '\uAC00';
		System.out.println(hangul);
		
		
		char ch2 = '한';
		System.out.println(ch2);
		System.out.println((int)ch2);
	}

}
