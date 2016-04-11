package program2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;

public class LexographicalSubStringSorting {

	public static void main(String[] args) {
		getAllSubStrings("welcometojava", 2);
		// List<String> list = new ArrayList<String>();
		// list.add("wel");
		// list.add("elc");
		// list.add("lco");
		// list.add("com");
		// list.add("ome");
		// list.add("met");
		// list.add("eto");
		// list.add("toj");
		// list.add("oja");
		// list.add("jav");
		// list.add("ava");
		// List<String> newList = sortStringsLexographically(list);
		// System.out.println(newList.toString());
		// System.out.println(newList.get(0));
		// System.out.println(newList.get(newList.size() - 1));

	}

	private static List<String> getAllSubStrings(String s, int newlength) {
		try {
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0, j = newlength; (i <= s.length() - newlength) && (j > s.length()); i++) {
				System.out.println(s.substring(i, j));
				list.add(s.substring(i, j));
			}
			for (String str : list) {
				System.out.println(str);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static List<String> sortStringsLexographically(List<String> list) {
		TreeSet<String> set = new TreeSet<String>();
		for (String s : list) {
			set.add(s);
		}
		return new ArrayList<String>(set);
	}

}
