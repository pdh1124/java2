package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("�¹���1");
		bookQueue.enQueue("�¹���2");
		bookQueue.enQueue("�¹���3");
		
		System.out.println(bookQueue.deQueue()); //�¹���1
		System.out.println(bookQueue.deQueue()); //�¹���2
		System.out.println(bookQueue.deQueue()); //�¹���3
		//�� ������� ���´�.
	}
	

}
