package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		//String�� ���� List�� ������ �ְ� java.util�� import ���ش�. 
		List<String> sList = new ArrayList<String>();
		
		//����Ʈ �ȿ� ��� ����
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		//��Ʈ���� �ݷ������� ���� ���鶧��
		Stream<String> stream = sList.stream();
		//������ �� �ִ�. import�� �ؾ���
		
		//�ϳ��� ����� �ϰ� ������ (���ٽ�)
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//sList.stream() ��Ʈ���� ���� ��� .sorted() ������ �ϰ�(abc��) .forEach(s -> System.out.print(s + " ")); �ϳ��� ����ϴ� ���� 
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//�� �̸��� ���� ���̸� �˰� �ʹٸ�(map)
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
	}

}
