package Unit4;

/**
 * 在抽象类上使用匿名内部类
 * 
 * @author JHZ
 *
 */
abstract class AbstractMessage {
	private String msg = "lenovohit";

	public String getMsg() {
		return this.msg;
	}

	public abstract void print();
}
