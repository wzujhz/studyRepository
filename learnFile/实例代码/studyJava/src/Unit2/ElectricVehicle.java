package Unit2;

/**
 * 电动汽车
 * 
 * @author JHZ
 *
 */
public class ElectricVehicle extends Car {

	@Override
	void whistle() {
		String isWhistle = "有喇叭";
		System.out.println(isWhistle);
	}

	@Override
	void brake() {
		System.out.println("鼓刹");

	}

	@Override
	void Engine() {
		System.out.println("电动机");

	}

}
