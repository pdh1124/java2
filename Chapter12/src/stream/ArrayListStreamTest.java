package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		//String을 담은 List를 생성해 주고 java.util을 import 해준다. 
		List<String> sList = new ArrayList<String>();
		
		//리스트 안에 사람 생성
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		//스트림을 콜렉션으로 부터 만들때는
		Stream<String> stream = sList.stream();
		//가져올 수 있다. import도 해야함
		
		//하나씩 출력을 하고 싶으면 (람다식)
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//sList.stream() 스트림이 생성 됬고 .sorted() 정렬을 하고(abc순) .forEach(s -> System.out.print(s + " ")); 하나씩 출력하는 연산 
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//각 이름에 대한 길이를 알고 싶다면(map)
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
	}

}
