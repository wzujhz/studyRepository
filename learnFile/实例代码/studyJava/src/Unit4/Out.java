package Unit4;

/**
 * �ڲ���������
 * 
 * @author JHZ
 *
 */
public class Out {
	private String msg = "lenovohit";

	/**
	 * ������
	 * 
	 * @author JHZ
	 *
	 */
	class Inner {
		public void print() {
			System.out.println(Out.this.msg);
			// System.out.println(msg);
		}
	}

	public void fun() {
		Inner in = new Inner();
		in.print();
	}
}
