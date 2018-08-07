package Unit2;

/**
 * 动物
 * 
 * @author JHZ
 *
 */
public class Animal {
	/* 姓名 */
	protected String name;
	/* ID */
	protected int id;

	/**
	 * 构造方法
	 * 
	 * @param myName
	 *            姓名
	 * @param myid
	 *            ID
	 */
	public Animal(String myName, int myid) {
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

	/**
	 * 隐私
	 */
	private void hide() {
		System.out.println("这是私有的隐私！");
	}

	/**
	 * 介绍
	 */
	protected void introduction() {
		System.out.println("大家好！我是" + id + "号" + name + ".");
	}
}
