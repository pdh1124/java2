package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5]; //비어 있음
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibaray, 0, 5); //얇은 복사 => library를 수정하면 copyLibaray도 수정 됨
		
		for(int i = 0; i<copyLibaray.length; i++ ) {	
		}
		
		for(Book book : copyLibaray) { //향상된 for문 Book book 타입에 대한 변수를 선언하고 , copyLibaray의 전체를 돌겠다. (변수 : 배열)
			book.showBookInfo();	
		}
		
		//라이브러리에 있는 0번째 책을 바꿈
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) { 
			book.showBookInfo();
		}
		
		for(Book book : copyLibaray) { 
			book.showBookInfo();
		}
	}

}
