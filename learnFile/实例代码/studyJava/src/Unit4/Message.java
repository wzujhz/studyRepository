package Unit4;

/**
 * �ڷ����ж����ڲ���
 * 
 * @author JHZ
 *
 */
public class Message {// ��ͨ��
	private String msg = "lenovohit";

	public void fun() {
		class Inner {// �����ж�����ڲ���
			public void print() {
				System.out.println(Message.this.msg);
			}
		}
		new Inner().print();// ʵ�����ڲ�����󲢵���
	}
}
