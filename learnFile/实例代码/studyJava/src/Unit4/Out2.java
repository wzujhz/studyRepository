package Unit4;

/**
 * 内部类和外部类的属性相互访问
 * 
 * @author JHZ
 *
 */
public class Out2 {
	private String msg = "lenovohit";

	/**
	 * 内部类
	 * 
	 * @author JHZ
	 *
	 */
	class Inner {
		private String info = "hello";

		public void print() {
			System.out.println(Out2.this.msg);// 内部类访问外部类
		}
	}

	public void fun() {
		Inner in = new Inner();
		in.print();
		System.out.println(in.info);// 外部类访问内部类
	}
}
