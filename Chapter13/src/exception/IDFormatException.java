package exception;

public class IDFormatException extends Exception { //extends Exception : Exception에서 상속 받아야 함(근처에 더 가까운곳에 extends해도 되는데 잘 모르겠으면 Exception에 extends하면 됨) 
	
	public IDFormatException(String message) { //message같은 경우 상위Exception에 메소드가 있다.
		super(message);
	}
	
}
