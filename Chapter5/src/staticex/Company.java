package staticex;

public class Company {
	
	//������ ��ü�� �̱��� ��������
	//���� ��� �б���� ���� �л��� ������ �б���� ���� �ϳ��϶�
	//ȸ�翡�� ������ ������ ȸ����ü�� �ϳ��϶�
	
	private static Company instance = new Company();
	
	private Company() {} //�ۼ� �� �θ� �������� �����ڸ� ������ ������ ����
	
	public static Company getInstance() {
		
		if( instance == null) {
			instance =new Company();
			
		}
		return instance;
		
	}
}
