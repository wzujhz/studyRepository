package Unit3;

public class Run {
	public static void main(String[] args) {
		// Person person = new Person("lis", 14);
		// System.out.println(person.getClass());
		// Integer integer = 200;
		// Integer integer2 = 200;
		// String string = "123";
		// String string2 = "a1";
		// System.out.println(integer.MAX_VALUE);
		// System.out.println(integer.BYTES);
		// System.out.println(Integer.parseInt(string));
		// System.out.println(Integer.parseInt(string2));

		// java对象比较

		Person p = new Person("zhangsan", 10);
		Person p2 = new Person("zhangsan", 10);

		System.out.println("p1是否等于p2:" + (p.equals(p2)));
	}
}
