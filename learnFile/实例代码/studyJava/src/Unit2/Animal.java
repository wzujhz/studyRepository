package Unit2;

/**
 * ����
 * 
 * @author JHZ
 *
 */
public class Animal {
	/* ���� */
	protected String name;
	/* ID */
	protected int id;

	/**
	 * ���췽��
	 * 
	 * @param myName
	 *            ����
	 * @param myid
	 *            ID
	 */
	public Animal(String myName, int myid) {
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

	/**
	 * ��˽
	 */
	private void hide() {
		System.out.println("����˽�е���˽��");
	}

	/**
	 * ����
	 */
	protected void introduction() {
		System.out.println("��Һã�����" + id + "��" + name + ".");
	}
}
