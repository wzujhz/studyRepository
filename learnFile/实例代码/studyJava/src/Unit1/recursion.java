package Unit1;

/**
 * �ݹ�
 * 
 * @author JHZ
 *
 */
public class recursion {

	/**
	 * ����һ��������������������ʼ���μ�1��ֱ�����������Ϊֹ��
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
	 * ����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		subtraction(100);
	}

}
