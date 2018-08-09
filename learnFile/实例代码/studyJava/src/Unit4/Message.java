package Unit4;

/**
 * 在方法中定义内部类
 * 
 * @author JHZ
 *
 */
public class Message {// 普通类
	private String msg = "lenovohit";

	public void fun() {
		class Inner {// 方法中定义的内部类
			public void print() {
				System.out.println(Message.this.msg);
			}
		}
		new Inner().print();// 实例化内部类对象并调用
	}
}
