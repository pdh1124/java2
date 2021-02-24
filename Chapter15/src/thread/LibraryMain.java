package thread;

import java.util.ArrayList;

class FastLibrary {
	
	//å���� �ִ�.
	public ArrayList<String> books =new ArrayList<String>();
	
	//�������� å�� �ִ�.
	public FastLibrary() {
		books.add("�¹��� 1");
		books.add("�¹��� 2");
		books.add("�¹��� 3");

	}
	
	//�������� �� - ���� �տ� �ִ� ��
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t =Thread.currentThread();
		
		//�������� �ߴµ� å�� ���ٸ� �������� �ǰ� �Ѵ�.
		while(books.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		
		String title = books.remove(0);
		
		System.out.println(t.getName() + " : " + title + " lend");
		return title;
	}
	
	//��ȯ�Ѵ�.
	public synchronized void returnBook(String title) {
		
		Thread t =Thread.currentThread();
		
		books.add(title);
		notify();
		System.out.println(t.getName() + " : " + title + " return");
	}
	
	
}


//���� �л��� �����.
class Student extends Thread {
	
	//�л��� �ϴ� ���� å�� �ϳ� ������
	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) {
				return;
			}
			sleep(5000); //5�� ���� �а�(�ڰ�)
			LibraryMain.library.returnBook(title); //�ݳ� �Ѵ�.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		
		//�л� 3���� ���� ������
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
