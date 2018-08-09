package Unit4;

/**
 * 内部类基本结果
 * 
 * @author JHZ
 *
 */
public class Out {
	private String msg = "lenovohit";

	/**
	 * 匿名类
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
