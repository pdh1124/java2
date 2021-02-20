package collection.treeset;

public class Member implements Comparable<Member> {

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
	@Override
	public int hashCode() {
		//같은 멤버일때 같은 hashCode를 가지면 되니까.
		//동일한 멤버가 memberId를 반환하면 됨 
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			return (this.memberId == member.memberId);
		}
		
		//멤버가 아니면 볼것도 아니니 false를 넣으면 됨
		return false;
	}
	@Override
	public int compareTo(Member member) {
		
		//ID 차순
		//return (this.memberId - member.memberId);
		
		//이름 차순
		return this.memberName.compareTo(member.getMemberName());
	}
	
	
	
	
	
}
