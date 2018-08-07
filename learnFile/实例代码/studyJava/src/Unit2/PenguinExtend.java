package Unit2;

public class PenguinExtend extends Animal {
	/**
	 * 构造方法
	 * 
	 * @param myName
	 * @param myid
	 */
	public PenguinExtend(String myName, int myid) {
		super(myName, myid);
	}

	/**
	 * 游泳
	 */
	public void swim() {
		System.out.println("我是" + name + ",我在游泳！");
	}

	/**
	 * 介绍
	 */
	public void introduction() {
		System.out.println("大家好！这是我自己的介绍！我是" + id + "号" + name + ".");
	}
}
