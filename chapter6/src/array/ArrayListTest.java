package array;

import java.util.ArrayList; //java.util�� ArrayList��� �޼ҵ带 ��������

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); //<>�ȿ� ���� �����Ͱ��� ���� �� ����, String, int, class ���
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//length��� size()�� ���� �� �ִ�. ���̴� length�����̰� size�� �� ������ ��Ÿ��
		//���� 10���� ������Ʈ�� 3���� ������ length�� 10�̰� size�� 3�̴�.
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		} 
		for(String s : list) {
			System.out.println(s);
		}
	}

}
