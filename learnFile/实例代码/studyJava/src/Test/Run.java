package Test;

import Unit1.Fruit;

public class Run {

	public static void main(String[] args) {
		// �㽶
		Fruit fruit1 = new Fruit("�㽶", "��ɫ", "����");
		fruit1.eat();

		// ����
		Fruit fruit2 = new Fruit("����", "��ɫ", "��");
		fruit2.eat();

		System.out.println(fruit1.getName() + fruit1.getColor() + fruit1.getWater());

	}

}
