package Unit4;

/**
 * 抽象内部类
 * 
 * @author JHZ
 *
 */
abstract class AbstractOuter {// 抽象外部类
	public abstract void printOuter();

	abstract class AbstractInner {// 抽象内部类
		public abstract void printInner();
	}

	class Inner {// 普通内部类
		public void print() {
			System.out.println("Hello World!");
		}
	}

}

/**
 * 继承外部抽象类
 * 
 * @author JHZ
 *
 */
class OuterImpl extends AbstractOuter {

	@Override
	public void printOuter() {
		new Inner().print(); // 实例化内部类的对象调用方法

	}

}
