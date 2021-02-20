package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	
	//HashSet�� ����� ����� ����
	private HashSet<Member> hashSet;
	
	
	//MemberHashSet�� �ܽ�Ʈ��Ʈ(������)���� hashSet�� ����
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); //HashSet�� �ϳ� ����� ��
		
		
		
	}
	//����� �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	} 
	
	//���࿡ ����� �Ѹ� ������ �Ѵٸ�
	//��� id�� �˾ƾ� �����ϵ���
	public boolean removeMember(int memberId) { //
		//�Ѹ� ������ Iterator�� �����
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { //hasNext()�� ���� ������Ʈ�� �ִ��Ķ�� ���
			Member member = ir.next(); //member�� next(������)�ض�
			if( member.getMemberId() == memberId) { //member�� ����Ʈ�� ������ ���̵�� �Ű������� �Է��� ���̵� ���ٸ�
				hashSet.remove(member); //����� �����ض�
				return true; //true�� ��ȯ�Ѵ�.
			}
		}
		
		//���� ã�� ���̵� ���ٸ�
		System.out.println(memberId + "��ȣ�� �������� �ʽ��ϴ�.");
		return false; //����� ������ ���� ������ false�� ��ȯ�Ѵ�.
	}
	
	//��� ����� �����ִ� �޼ҵ�
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
