package exception;

public class IDFormatException extends Exception { //extends Exception : Exception���� ��� �޾ƾ� ��(��ó�� �� �������� extends�ص� �Ǵµ� �� �𸣰����� Exception�� extends�ϸ� ��) 
	
	public IDFormatException(String message) { //message���� ��� ����Exception�� �޼ҵ尡 �ִ�.
		super(message);
	}
	
}
