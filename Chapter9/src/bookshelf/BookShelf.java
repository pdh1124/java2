package bookshelf;


//�̹� Sheilf��� ������ �ְ� ���� �� �����Ϸ��� Queue ����� ������ �ִ� �������̽��� �ִ�.
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		//enQueue�� ����(shelf)���ٰ� ���� ����
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		//å �ѱ��� ���� �����°��� get�� �ƴϰ� �������� ��
		//�� �տ� ���� ��ȯ���ִ°�
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
