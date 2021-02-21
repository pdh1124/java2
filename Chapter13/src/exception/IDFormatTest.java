package exception;

public class IDFormatTest {

	private String userID;
	
	//get�� ��� ����
	public String getUserID() { 
		return userID;
	}

	//set�Ҷ� exception�� ó���ؾ� ��
	public void setUserID(String userID) throws IDFormatException { 
		
		//throws�� �μ����� �̷�� ���̰�
		//throw�� �μ����� �߻� ��Ű�� ��
		if(userID == null) {
			throw new IDFormatException("���̵�� null �� �� �����ϴ�.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		this.userID = userID;
	}

	




	public static void main(String[] args) {
		
		//ID�� 8�� ���� 20�� �̻��� ��� ���� �߻� �ϵ���
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		
		try { //throws�� �߱� ������ try-catch�� �ؾ� �Ѵ�.
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		
		myId = "123456";
		try { //throws�� �߱� ������ try-catch�� �ؾ� �Ѵ�.
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}	
		
		myId = "123456789";
		try { //throws�� �߱� ������ try-catch�� �ؾ� �Ѵ�.
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}	

				
	}

}
