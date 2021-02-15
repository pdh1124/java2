package array;

import java.util.ArrayList; //java.util에 ArrayList라는 메소드를 제공해줌

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); //<>안에 여러 데이터값을 넣을 수 있음, String, int, class 등등
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//length대신 size()로 꺼낼 수 있다. 차이는 length길이이고 size는 들어간 갯수만 나타냄
		//만약 10개에 엘리먼트가 3개가 들어갔으면 length는 10이고 size는 3이다.
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		} 
		for(String s : list) {
			System.out.println(s);
		}
	}

}
