package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


//가장 랭스가 긴애를 출력하고 싶은게 길다면 class를 새로 만들어서
class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		else {
			return s2;
		}
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		//인사를 정리해둔 String 형식의 배열이 있는데
		String[] greetings = {"안녕하세요~~", "hello", "Good morning", "반갑습니다."};
		
		//가장 랭스가 긴애를 출력하고 싶은
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			//s1의 데이터 byte의 길이와 s2의 데이터 byte의 길이를 비교함 (한글은 2, 영어는 1)
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			}
			else {
				return s2;
			}
		}));
		
		//Arrays.stream(greetings) greetings를 stream으로 가져오고 .reduce에 ()안에 람다식 대신 위에 만든 class를 new해서 띄우고 get으로 받아온다.
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
	}

}
