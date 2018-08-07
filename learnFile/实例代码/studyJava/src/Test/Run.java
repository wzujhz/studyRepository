package Test;

import Unit1.Fruit;

public class Run {

	public static void main(String[] args) {
		// 香蕉
		Fruit fruit1 = new Fruit("香蕉", "黄色", "较少");
		fruit1.eat();

		// 西瓜
		Fruit fruit2 = new Fruit("西瓜", "绿色", "多");
		fruit2.eat();

		System.out.println(fruit1.getName() + fruit1.getColor() + fruit1.getWater());

	}

}
