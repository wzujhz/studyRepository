package Unit3;

class Person {

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ĞÕÃû:" + name;
	}
}
