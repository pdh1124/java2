package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		
		
		//다 출력이 되는데 순서대로 출력이 되지 않음
		//그렇다고 가나다 순으로 저장되는 것도 아님, 해시방식으로 저장됨
		//중복을 허용하지 않음 (아이디, 주민번호, 학번, 사번 등을 관리할 때 사용)
		System.out.println(set); //[김유신, 강감찬, 이순신]	
		
		//Array방식으로 하게 되면
		ArrayList<String> set2 = new ArrayList<String>();
		set2.add("이순신");
		set2.add("김유신");
		set2.add("강감찬");
		set2.add("이순신");
		
		//순서대로 나오고 중복도 가능
		System.out.println(set2); //[이순신, 김유신, 강감찬, 이순신]
		
		
		//하나씩하나씩 돌아가면서 쓰고 싶으면 Iterator를 사용하면 됨
		Iterator<String> ir = set.iterator();
		
		//전체를 반환하는 반복문
		while(ir.hasNext()) { //hasNext()는 다음 엘리먼트가 있느냐라고 물어봄
			String str = ir.next(); //next()는 가져오라는 것 => 다음 엘리먼트가 있다면 가져와라
			System.out.println(str);
		}
	}
}
