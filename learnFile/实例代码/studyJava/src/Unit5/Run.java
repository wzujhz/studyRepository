package Unit5;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// ============ Old Class ===========
		BoxOld boxOld = new BoxOld();
		boxOld.setObject("我是属性");

		Box1 boxOld1 = new Box1();
		boxOld1.setObject(1);

		// ============New Class ==============
		Box<String> boxNew = new Box<String>();
		boxNew.setObject("我是属性");

		Box<Integer> box1New = new Box<Integer>();
		box1New.setObject(1);

		List<Integer> array = new ArrayList<Integer>();
		array.add(1);

		Pair<String, Integer> pair = new Pair<String, Integer>("One", 1);
		Pair<String, Integer> pair2 = new Pair<String, Integer>("One", 1);
		Pair<String, Integer> pair3 = new Pair<String, Integer>("Two", 2);
		System.out.println(Util.compare(pair, pair3));
	}

}
