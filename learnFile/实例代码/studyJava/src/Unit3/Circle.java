package Unit3;

public class Circle {
	public static void main(String[] args) {
	}

	private double radius = 0;

	public Circle(double radius) {
		this.radius = radius;
		System.out.println(Draw.str);
	}

	private Draw getDrawInstance() {
		return new Draw();
	}

	class Draw { // ÄÚ²¿Àà
		private static final String str = "aaa";

		public String drawSahpe() {
			return str;
		}
	}

}
