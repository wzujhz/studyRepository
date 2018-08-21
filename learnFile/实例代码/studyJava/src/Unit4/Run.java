package Unit4;

public class Run {

	public static void main(String[] args) {
		// new Out().fun();
		// new Out2().fun();

		// Out2.Inner in = new Out2().new Inner();
		// in.print();

		// AbstractOuter out = new OuterImpl();
		// out.printOuter();

		StaticOuter.Inner in = new StaticOuter.Inner();
		in.print();

		// new Message().fun();

		// AbstractMessage msg = new AbstractMessage() {
		//
		// @Override
		// public void print() {
		// System.out.println(this.getMsg());
		//
		// }
		// };
		// msg.print();
	}

}
