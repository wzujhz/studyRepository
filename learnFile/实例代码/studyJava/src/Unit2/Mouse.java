package Unit2;

/**
 * 老鼠
 * 
 * @author JHZ
 *
 */
public class Mouse {
	/* 名字 */
	private String name;
	/* ID */
	private int id;

	/**
	 * 构造方法
	 * 
	 * @param myName
	 * @param myid
	 */
	public Mouse(String myName, int myid) {
		name = myName;
		id = myid;
	}

	/**
	 * 吃
	 */
	public void eat() {
		System.out.println(name + "正在吃");
	}

	/**
	 * 睡
	 */
	public void sleep() {
		System.out.println(name + "正在睡");
	}
}
