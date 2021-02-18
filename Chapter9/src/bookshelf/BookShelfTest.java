package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("태백산맥1");
		bookQueue.enQueue("태백산맥2");
		bookQueue.enQueue("태백산맥3");
		
		System.out.println(bookQueue.deQueue()); //태백산맥1
		System.out.println(bookQueue.deQueue()); //태백산맥2
		System.out.println(bookQueue.deQueue()); //태백산맥3
		//들어간 순서대로 나온다.
	}
	

}
