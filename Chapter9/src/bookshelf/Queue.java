package bookshelf;

public interface Queue {
	
	//enQueue는 집어 넣는 메소드
	void enQueue(String title);
	//String을 반환해주는 deQueue라는 메소드가 있음
	String deQueue();
	
	int getSize();
}
