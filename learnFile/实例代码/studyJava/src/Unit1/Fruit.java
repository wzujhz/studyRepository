package Unit1;

/**
 * 水果类
 * 
 * @author JHZ
 *
 */
public class Fruit {

	private String name;
	private String color;
	private String water;

	public Fruit(String name, String color, String water) {
		System.out.println("种" + name);
		this.name = name;
		this.color = color;
		this.water = water;
	}

	/**
	 * 吃水果
	 */
	public void eat() {
		System.out.println("我在吃" + name);
	}

	public static void main(String[] args) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

}
