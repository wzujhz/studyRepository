package Unit2;

/**
 * �綯����
 * 
 * @author JHZ
 *
 */
public class ElectricVehicle extends Car {

	@Override
	void whistle() {
		String isWhistle = "������";
		System.out.println(isWhistle);
	}

	@Override
	void brake() {
		System.out.println("��ɲ");

	}

	@Override
	void Engine() {
		System.out.println("�綯��");

	}

}
