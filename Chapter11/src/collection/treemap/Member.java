package collection.treemap;

public class Member {

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
	
}
