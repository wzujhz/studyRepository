package Test;

import java.util.ArrayList;
import java.util.List;

public class main {

	private static final String Pupil = null;

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.remove("aaa");
		strings.add("bbb");
		for (String s : strings) {

		}
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			if (i == 2) {
				break;
			}
		}
	}

}
