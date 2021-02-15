package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5]; //비어 있음
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		//copyLibaray를 직접 선언하고
		copyLibaray[0] = new Book();
		copyLibaray[1] = new Book();
		copyLibaray[2] = new Book();
		copyLibaray[3] = new Book();
		copyLibaray[4] = new Book();
		
		//copyLibaray에 있는 것을 library에 있는 걸로 복사 하고
		for(int i = 0; i < library.length; i++) { 
			copyLibaray[i].setTitle(library[i].getTitle());
			copyLibaray[i].setAuthor(library[i].getAuthor());
		}
		
		//library에 있는 0번째 책을 바꿈
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		
		//출력을 하면 library는 수정되어 있고
		for(Book book : library) { 
			book.showBookInfo();
		}
		
		//copyLibaray 수정 되기 전의 상태로 되어 있다.
		for(Book book : copyLibaray) { 
			book.showBookInfo();
		}
		
		
		//이것이 깊은 복사
	}

}
