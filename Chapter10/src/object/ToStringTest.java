package object;

class Book{
	String title; //����
	String author; //����
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString();
		//return author + "," + title;
	}
	
	
}

public class ToStringTest /*extends Object��� ���� �ʾƵ� �ڵ����� �������� �ȴ�.*/ {

	public static void main(String[] args) {

		Book book = new Book("����", "�ڰ渮");
		
		System.out.println(book);
		
		String str = new String("����");
		
		//���ڿ��� ������ ������ String Ŭ������ JDKŬ������ �ְ� 
		System.out.println(str);
		System.out.println(str.toString());
	}

}
