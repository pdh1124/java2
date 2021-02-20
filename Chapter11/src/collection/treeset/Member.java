package collection.treeset;

public class Member implements Comparable<Member> {

	private int memberId; //���ID
	private String memberName; //��� �̸�
	
	public Member() {}; //����Ʈ ������
	public Member(int memberId, String memberName) { //��Ҹ� �޾��ִ� �Ű������� �� ������
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//getter setter �����
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//toString
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberId + " �Դϴ�.";
	}
	@Override
	public int hashCode() {
		//���� ����϶� ���� hashCode�� ������ �Ǵϱ�.
		//������ ����� memberId�� ��ȯ�ϸ� �� 
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			return (this.memberId == member.memberId);
		}
		
		//����� �ƴϸ� ���͵� �ƴϴ� false�� ������ ��
		return false;
	}
	@Override
	public int compareTo(Member member) {
		
		//ID ����
		//return (this.memberId - member.memberId);
		
		//�̸� ����
		return this.memberName.compareTo(member.getMemberName());
	}
	
	
	
	
	
}
