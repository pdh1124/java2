
public class OutputMethod {

	//void 대신 String을 적는 이유는 return 값이 문자열이기 때문 
	public static String a() {
		//어떤 명령 후
		return "a";
	}
	
	//void 대신 int를 적는 이유는 return 값이 숫자열이기 때문
	public static int one() {
		//어떤 명령 후
		return 1;
		//return 뒤에 아무리 많은 코드가 있어서 return에 끝난다.
	}
	
	//void라는 것은 return값이 없을때 사용
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());

	}

}
