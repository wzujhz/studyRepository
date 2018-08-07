package Unit2;

/**
 * @version
 * @author JHZ
 *
 */
public class PoliceCar extends Car {

	@Override
	void whistle() {
		System.out.println("警笛");

	}

	@Override
	void brake() {
		System.out.println("碟刹");

	}

	@Override
	void Engine() {
		System.out.println("二级汽油发动机");

	}

}
