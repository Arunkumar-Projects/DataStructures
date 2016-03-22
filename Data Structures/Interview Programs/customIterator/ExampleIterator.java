package customIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Arun");
		list.add("Kumar");
		list.add("Varada");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}

	}

}
