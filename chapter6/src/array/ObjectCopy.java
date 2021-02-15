package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5]; //��� ����
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		System.arraycopy(library, 0, copyLibaray, 0, 5); //���� ���� => library�� �����ϸ� copyLibaray�� ���� ��
		
		for(int i = 0; i<copyLibaray.length; i++ ) {	
		}
		
		for(Book book : copyLibaray) { //���� for�� Book book Ÿ�Կ� ���� ������ �����ϰ� , copyLibaray�� ��ü�� ���ڴ�. (���� : �迭)
			book.showBookInfo();	
		}
		
		//���̺귯���� �ִ� 0��° å�� �ٲ�
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) { 
			book.showBookInfo();
		}
		
		for(Book book : copyLibaray) { 
			book.showBookInfo();
		}
	}

}
