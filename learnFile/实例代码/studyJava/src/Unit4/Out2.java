package Unit4;

/**
 * �ڲ�����ⲿ��������໥����
 * 
 * @author JHZ
 *
 */
public class Out2 {
	private String msg = "lenovohit";

	/**
	 * �ڲ���
	 * 
	 * @author JHZ
	 *
	 */
	class Inner {
		private String info = "hello";

		public void print() {
			System.out.println(Out2.this.msg);// �ڲ�������ⲿ��
		}
	}

	public void fun() {
		Inner in = new Inner();
		in.print();
		System.out.println(in.info);// �ⲿ������ڲ���
	}
}
