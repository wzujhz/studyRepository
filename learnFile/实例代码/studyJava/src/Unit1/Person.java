package Unit1;

/**
 * 人物
 * 
 * @author JHZ
 *
 */
public class Person {

	static String userName = "这是我的名字";
	static String ys = "这是我的隐私";

	public static String getUserName() {
		userName = "这是我的假名字";
		return userName;
	}

}
