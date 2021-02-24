package thread;

import java.util.ArrayList;

class FastLibrary {
	
	//책들이 있다.
	public ArrayList<String> books =new ArrayList<String>();
	
	//도서관에 책이 있다.
	public FastLibrary() {
		books.add("태백산맥 1");
		books.add("태백산맥 2");
		books.add("태백산맥 3");

	}
	
	//빌려가는 것 - 제일 앞에 있는 것
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t =Thread.currentThread();
		
		//빌릴려고 했는데 책이 없다면 못빌리게 되게 한다.
		while(books.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		
		String title = books.remove(0);
		
		System.out.println(t.getName() + " : " + title + " lend");
		return title;
	}
	
	//반환한다.
	public synchronized void returnBook(String title) {
		
		Thread t =Thread.currentThread();
		
		books.add(title);
		notify();
		System.out.println(t.getName() + " : " + title + " return");
	}
	
	
}


//빌릴 학생을 만든다.
class Student extends Thread {
	
	//학생이 하는 일은 책을 하나 빌리고
	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) {
				return;
			}
			sleep(5000); //5초 동안 읽고(자고)
			LibraryMain.library.returnBook(title); //반납 한다.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		
		//학생 3명을 만들어서 돌려봄
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		
		
		

	}

}
