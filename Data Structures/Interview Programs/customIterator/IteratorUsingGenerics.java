package customIterator;

import java.util.ArrayList;

public class IteratorUsingGenerics {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Kagami");
		list.add("Altiux");
		list.add("BitKemy");
		list.add("MobiMart");
		for (String company : list) {
			System.out.println(company);
		}

	}

}
