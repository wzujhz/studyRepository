package Unit4;

/**
 * �ڳ�������ʹ�������ڲ���
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
