package collection;

import java.util.ArrayList;

class MyStack {
	//String값을 매개변수로 받는 ArrayList를 만듦(import를 함)
	private ArrayList<String > arrayStack = new ArrayList<String >();
	
	//push(집어 넣는다.) : 오브젝트 하나 들어올 것
	public void push(String  data) {
		arrayStack.add(data); //arrayStack이란 배열에 맨 마지막에 data를 넣을 명령
	}
	
	//하나를 넣으면 하나가 반환되어야 함
	//pop
	public String  pop() {
		//맨 마지막것을 반환해야하기 때문에 size값을 알아야 함
		int len = arrayStack.size();
		if(len == 0 ) { //stack이 0(비어 있다면) -1번째를 줄 수 없으니까 
			System.out.println("스택이 비었습니다."); //비었다고 말을 해주고
			return null; //리턴을 한다. 값이 없기 때문에 null로 리턴함
		}
		
		return arrayStack.remove(len - 1); //len이 사이즈값을 알아내서 배열은 0부터 시작하기 때문에 -1를 넣어줌
	}
	
}


public class StackTest {
	
	public static void main(String [] args) {
		//MyStack이란 클래스에 들어간 인스턴스를 만듦
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop()); //C
		System.out.println(stack.pop()); //B
		System.out.println(stack.pop()); //A
		System.out.println(stack.pop()); //스택이 비었습니다. null
		
	}
}
