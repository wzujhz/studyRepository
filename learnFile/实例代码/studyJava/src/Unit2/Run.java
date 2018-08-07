package Unit2;

public class Run {

	public static void main(String[] args) {
		// MouseExtend me = new MouseExtend("老鼠", 1);
		// me.introduction();

		Animal a = new Animal("动物", 2);
		a.introduction();
		Animal p = (Animal) new PenguinExtend("企鹅", 2);
		p.introduction();
		
		System.out.println(a instanceof Animal);
		System.out.println(p instanceof Animal);
	}

}
