package collection.treemap;

public class Member {

	private int memberId; //멤버ID
	private String memberName; //멤버 이름
	
	public Member() {}; //디폴트 생성자
	public Member(int memberId, String memberName) { //요소를 받아주는 매개변수가 들어간 생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//getter setter 만들기
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
		return memberName + "회원님의 아이디는 " + memberId + " 입니다.";
	}
	
}
