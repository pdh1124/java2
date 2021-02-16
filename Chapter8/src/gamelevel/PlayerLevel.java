package gamelevel;

public abstract class PlayerLevel {

	//����
	//player�� ������ �ϴµ� 3���� ����� ������
	//�ʺ��ڴ� õõ�� �޸��⸸ ������
	//�߱��ڴ� ������ �޸��� ���������� ������
	//����ڴ� ��û ������ �޸��� ������ �ϰ� �� ���� ������ ����
	//go()��� ��ɾ ������ 3���� ����� �����ϰ� �� �� ���ٴ� ���� ������ �޼����� ����
	
	
	//����� �߻� Ŭ������ ����
	public abstract void run(); //�޸���
	public abstract void jump(); //����
	public abstract void turn(); //��
	public abstract void showLevelMessage(); //���¸� �˷���
	
	//go()��� ��ɾ�
	final public void go(int count) {
		run(); //�޸���
		for(int i = 0 ; i < count; i++) {//count��ŭ ������
			jump();
		}
		turn(); //��
	}

}
