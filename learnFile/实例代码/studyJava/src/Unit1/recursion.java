package Unit1;

/**
 * 递归
 * 
 * @author JHZ
 *
 */
public class recursion {

	/**
	 * 输入一个数，输出这个数，并开始依次减1，直到这个数减完为止。
	 * 
	 * @param num
	 */
	private static void subtraction(int num) {
		if (num == 0) {
			return;
		} else {
			System.out.println(num);
			num--;
			subtraction(num);
		}
	}

	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		subtraction(100);
	}

}
