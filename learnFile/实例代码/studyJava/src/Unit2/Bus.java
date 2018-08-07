package Unit2;

/**
 * 公交车
 * 
 * @author JHZ
 *
 */
public class Bus extends Car {

	@Override
	void whistle() {
		System.out.println("鸣笛声音需要很大");

	}

	@Override
	void brake() {
		System.out.println("鼓刹");

	}

	@Override
	void Engine() {
		System.out.println("一级柴油发动机");

	}

}
