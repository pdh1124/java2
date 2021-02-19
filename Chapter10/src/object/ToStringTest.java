package object;

class Book{
	String title; //제목
	String author; //저자
	
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

public class ToStringTest /*extends Object라고 쓰지 않아도 자동으로 컴파일이 된다.*/ {

	public static void main(String[] args) {

		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		String str = new String("토지");
		
		//문자열이 나오는 이유는 String 클래스는 JDK클래스가 있고 
		System.out.println(str);
		System.out.println(str.toString());
	}

}
