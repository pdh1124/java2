package exception;

public class IDFormatTest {

	private String userID;
	
	//get은 상관 없고
	public String getUserID() { 
		return userID;
	}

	//set할때 exception을 처리해야 됨
	public void setUserID(String userID) throws IDFormatException { 
		
		//throws는 인셉션을 미루는 것이고
		//throw는 인셉션을 발생 시키는 것
		if(userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디가 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}

	




	public static void main(String[] args) {
		
		//ID가 8자 이하 20자 이상일 경우 오류 발생 하도록
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		
		try { //throws를 했기 때문에 try-catch를 해야 한다.
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		
		myId = "123456";
		try { //throws를 했기 때문에 try-catch를 해야 한다.
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}	
		
		myId = "123456789";
		try { //throws를 했기 때문에 try-catch를 해야 한다.
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}	

				
	}

}
