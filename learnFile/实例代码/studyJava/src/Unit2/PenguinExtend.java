package Unit2;

public class PenguinExtend extends Animal {
	/**
	 * ���췽��
	 * 
	 * @param myName
	 * @param myid
	 */
	public PenguinExtend(String myName, int myid) {
		super(myName, myid);
	}

	/**
	 * ��Ӿ
	 */
	public void swim() {
		System.out.println("����" + name + ",������Ӿ��");
	}

	/**
	 * ����
	 */
	public void introduction() {
		System.out.println("��Һã��������Լ��Ľ��ܣ�����" + id + "��" + name + ".");
	}
}
