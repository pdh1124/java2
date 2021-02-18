package bookshelf;

import java.util.ArrayList; //ArrayList<String>는 import를 해줘야 한다.

public class Shelf {
	
	//배열을 두고 <문자열>타입으로 받는다.
	//그리고 하위 클래스에서 쓸수 있도록 protected를 넣는다.
	protected ArrayList<String> shelf; 
	
	
	//보통 ArrayList를 콘스트럭트에서 많이 함
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	//protected이기 때문에 getter,setter 메소드가 있어야 하는데 getter만 만들어 준다.
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	//선반에 물건이 몇개가 있는지 확인
	public int getCount() {
		return shelf.size(); //사이즈를 세서 return 해주면 됨
	}
}
