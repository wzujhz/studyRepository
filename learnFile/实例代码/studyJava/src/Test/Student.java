package Test;

/**
 * 
 * @author woaijun
 *
 */
public class Student {
	private String name;

	Student() {
		String myName = null;
		name = myName;
		int myid = 0;
		int id = myid;
	}

	public Student(Object myName, Object myid) {
		// TODO Auto-generated constructor stub
	}

	public void read() {
		System.out.println(name + "正在读");
	}

	public void study() {
		System.out.println(name + "正在学");
	}

	public void introduction() {
		System.out.println("大家好！我是" + name + "号" + name + ".");
	}

}
