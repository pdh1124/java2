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
	
	public boolean removeMember(int memberId) { //int�� Integer�� �ڵ����� ȣȯ�� �ȴ�. ����ڽ� ��ڽ��� �ڵ����� ��
		if( treeMap.containsKey(memberId)) { //key��(id)�� �ش�Ǵ� ���� �ִ���.
			treeMap.remove(memberId);
			return true;
		}
		else {
			System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
			return false;
		}
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = treeMap.keySet().iterator(); //keySet()�� ��� key��ü�� ��ȯ�� �ִµ� key�� �ߺ� �� �� ���� ������ Set Ÿ������ ��ȯ����
		//hashMap.values().iterator(); //values()�� ��� value ���� ��ȯ�� �ִµ� �ߺ��� �� �ֱ� ������ collection���� ��ȯ�� ��
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
	}
}
