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
		System.out.println(name + "���ڶ�");
	}

	public void study() {
		System.out.println(name + "����ѧ");
	}

	public void introduction() {
		System.out.println("��Һã�����" + name + "��" + name + ".");
	}

}
