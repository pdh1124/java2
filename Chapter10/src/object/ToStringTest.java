package object;

class Book implements Cloneable { //implements Cloneable��� ������ �����ϵ��� ��ø� ����� ��
	String title; //����
	String author; //����
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		//return super.toString();
		return author + "," + title;
	}
	
	//å�� �����ϴ� �޼ҵ� ����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ToStringTest /*extends Object��� ���� �ʾƵ� �ڵ����� �������� �ȴ�.*/ {

	public static void main(String[] args) throws CloneNotSupportedException { //throws CloneNotSupportedException�� �Ͽ� Ŭ���� �����ϵ��� ��

		Book book = new Book("����", "�ڰ渮");
		
		System.out.println(book);
		
		String str = new String("����");
		
		//���ڿ��� ������ ������ String Ŭ������ JDKŬ������ �ְ� 
		System.out.println(str);
		System.out.println(str.toString());
		
		
		
		//����
		Book book2 = (Book)book.clone(); 
		System.out.println(book2);
		
		
	}

}
