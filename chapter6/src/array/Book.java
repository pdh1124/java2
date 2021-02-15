package array;

public class Book {

	private String title;
	private String author;
	
	//디폴트 생성자 만들어 놓고
	public Book() {}
	
	//매개변수가 있는 생성자 만들어 봄
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	//getter와 setter 생성
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//콘솔값에 띄우기
	public void showBookInfo() {
		System.out.println(title + "," + author);
	} 
	
	
}
