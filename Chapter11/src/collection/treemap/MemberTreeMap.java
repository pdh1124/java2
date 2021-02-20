package collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) { //int와 Integer가 자동으로 호환이 된다. 오토박싱 언박싱이 자동으로 됨
		if( treeMap.containsKey(memberId)) { //key값(id)에 해당되는 값이 있느냐.
			treeMap.remove(memberId);
			return true;
		}
		else {
			System.out.println("회원 번호가 없습니다.");
			return false;
		}
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = treeMap.keySet().iterator(); //keySet()는 모든 key객체를 반환해 주는데 key는 중복 될 수 없기 때문에 Set 타입으로 반환해줌
		//hashMap.values().iterator(); //values()는 모든 value 값을 반환해 주는데 중복될 수 있기 때문에 collection으로 반환이 됨
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
	}
}
