package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>(); 
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str); //강감찬, 이순신, 홍길동 순서로 되어 있음 (가나다 순)
			//왜냐면 String에 Comparable을 이미 구현하고 있어서 오름차순으로 구현되게 만들어져 있음

		}
	}

}
