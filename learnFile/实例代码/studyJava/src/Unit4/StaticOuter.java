package Unit4;

/**
 * static�ڲ���
 * 
 * @author JHZ
 *
 */
public class StaticOuter {
	public static String msg = "lenovohit";

	static class Inner {
		public void print() {
			System.out.println(msg);
		}
	}
}
