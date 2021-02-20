package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	
	
	//HashSet�� ����� ����� ����
	private TreeSet<Member> treeSet;
	
	
	//MemberHashSet�� �ܽ�Ʈ��Ʈ(������)���� hashSet�� ����
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(); //HashSet�� �ϳ� ����� ��
		
		
		
	}
	//����� �߰�
	public void addMember(Member member) {
		treeSet.add(member);
	} 
	
	//���࿡ ����� �Ѹ� ������ �Ѵٸ�
	//��� id�� �˾ƾ� �����ϵ���
	public boolean removeMember(int memberId) { //
		//�Ѹ� ������ Iterator�� �����
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) { //hasNext()�� ���� ������Ʈ�� �ִ��Ķ�� ���
			Member member = ir.next(); //member�� next(������)�ض�
			if( member.getMemberId() == memberId) { //member�� ����Ʈ�� ������ ���̵�� �Ű������� �Է��� ���̵� ���ٸ�
				treeSet.remove(member); //����� �����ض�
				return true; //true�� ��ȯ�Ѵ�.
			}
		}
		
		//���� ã�� ���̵� ���ٸ�
		System.out.println(memberId + "��ȣ�� �������� �ʽ��ϴ�.");
		return false; //����� ������ ���� ������ false�� ��ȯ�Ѵ�.
	}
	
	//��� ����� �����ִ� �޼ҵ�
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
