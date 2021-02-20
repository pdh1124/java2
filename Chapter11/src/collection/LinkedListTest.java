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
		
		//�߰��� �����͸� �ְų� ����
		myList.add(1, "E");
		System.out.println(myList); //[A, E, B, C, D]
		
		//���������� ���ﶧ
		myList.removeLast();
		System.out.println(myList); //[A, E, B, C]
		
		//����Ʈ �������̽��� �����Ѱ��ε�
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
