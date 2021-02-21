package collection;

import java.util.ArrayList;

class MyStack {
	//String���� �Ű������� �޴� ArrayList�� ����(import�� ��)
	private ArrayList<String > arrayStack = new ArrayList<String >();
	
	//push(���� �ִ´�.) : ������Ʈ �ϳ� ���� ��
	public void push(String  data) {
		arrayStack.add(data); //arrayStack�̶� �迭�� �� �������� data�� ���� ���
	}
	
	//�ϳ��� ������ �ϳ��� ��ȯ�Ǿ�� ��
	//pop
	public String  pop() {
		//�� ���������� ��ȯ�ؾ��ϱ� ������ size���� �˾ƾ� ��
		int len = arrayStack.size();
		if(len == 0 ) { //stack�� 0(��� �ִٸ�) -1��°�� �� �� �����ϱ� 
			System.out.println("������ ������ϴ�."); //����ٰ� ���� ���ְ�
			return null; //������ �Ѵ�. ���� ���� ������ null�� ������
		}
		
		return arrayStack.remove(len - 1); //len�� ������� �˾Ƴ��� �迭�� 0���� �����ϱ� ������ -1�� �־���
	}
	
}


public class StackTest {
	
	public static void main(String [] args) {
		//MyStack�̶� Ŭ������ �� �ν��Ͻ��� ����
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop()); //C
		System.out.println(stack.pop()); //B
		System.out.println(stack.pop()); //A
		System.out.println(stack.pop()); //������ ������ϴ�. null
		
	}
}
