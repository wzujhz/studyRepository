package Unit2;

/**
 * ����
 * 
 * @author JHZ
 *
 */
public class Mouse {
	/* ���� */
	private String name;
	/* ID */
	private int id;

	/**
	 * ���췽��
	 * 
	 * @param myName
	 * @param myid
	 */
	public Mouse(String myName, int myid) {
		name = myName;
		id = myid;
	}

	/**
	 * ��
	 */
	public void eat() {
		System.out.println(name + "���ڳ�");
	}

	/**
	 * ˯
	 */
	public void sleep() {
		System.out.println(name + "����˯");
	}
}
