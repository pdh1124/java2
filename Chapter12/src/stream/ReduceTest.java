package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


//���� ������ ��ָ� ����ϰ� ������ ��ٸ� class�� ���� ����
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
		
		//�λ縦 �����ص� String ������ �迭�� �ִµ�
		String[] greetings = {"�ȳ��ϼ���~~", "hello", "Good morning", "�ݰ����ϴ�."};
		
		//���� ������ ��ָ� ����ϰ� ����
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			//s1�� ������ byte�� ���̿� s2�� ������ byte�� ���̸� ���� (�ѱ��� 2, ����� 1)
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			}
			else {
				return s2;
			}
		}));
		
		//Arrays.stream(greetings) greetings�� stream���� �������� .reduce�� ()�ȿ� ���ٽ� ��� ���� ���� class�� new�ؼ� ���� get���� �޾ƿ´�.
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
	}

}
