package Unit3;

class Person implements Comparable<Person> {

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.age = age;
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {
		// if (obj.getClass() != this.getClass()) {
		// return false;
		// } else {
		// Person p = (Person) obj;
		// return p.getName().equals(this.name) && p.getAge().equals(this.age);
		// }

		Person p = (Person) obj;
		return p.getName().equals(this.name) && p.getAge().equals(this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person p) {
		return p.age - age;
	}

}
