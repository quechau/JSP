package SetDemo;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("B");
		System.out.println(set);
		System.out.println(set.size());
		set.add("D");
		System.out.println(set);
		System.out.println(set.size());
	}

}
