package Unit2;

/**
 * ���
 * 
 * @author JHZ
 *
 */
public class Penguin {

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
	public Penguin(String myName, int myid) {
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
