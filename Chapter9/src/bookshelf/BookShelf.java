package bookshelf;


//이미 Sheilf라는 선반이 있고 내가 막 구현하려는 Queue 기능을 가지고 있는 인터페이스가 있다.
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		//enQueue는 선반(shelf)에다가 집어 넣음
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		//책 한권이 빠져 나가는것은 get이 아니고 없어지는 것
		//맨 앞에 것을 반환해주는것
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
