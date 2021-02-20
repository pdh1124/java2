package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
			
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		
		
		System.out.println(myList); //[A, B, C, D]
		
		//중간에 데이터를 넣거나 뺄때
		myList.add(1, "E");
		System.out.println(myList); //[A, E, B, C, D]
		
		//마지막것을 지울때
		myList.removeLast();
		System.out.println(myList); //[A, E, B, C]
		
		//리스트 인터페이스를 구현한것인데
		for(int i = 0; i < myList.size();i++) {
			String s = myList.get(i);
			System.out.println(s);
			/*
				A
				E
				B
				C
			 */
		}
	}

}
