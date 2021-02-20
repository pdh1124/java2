package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) { //int�� Integer�� �ڵ����� ȣȯ�� �ȴ�. ����ڽ� ��ڽ��� �ڵ����� ��
		if( hashMap.containsKey(memberId)) { //key��(id)�� �ش�Ǵ� ���� �ִ���.
			hashMap.remove(memberId);
			return true;
		}
		else {
			System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
			return false;
		}
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator(); //keySet()�� ��� key��ü�� ��ȯ�� �ִµ� key�� �ߺ� �� �� ���� ������ Set Ÿ������ ��ȯ����
		//hashMap.values().iterator(); //values()�� ��� value ���� ��ȯ�� �ִµ� �ߺ��� �� �ֱ� ������ collection���� ��ȯ�� ��
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
	}
}
