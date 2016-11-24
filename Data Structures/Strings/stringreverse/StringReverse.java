package stringreverse;

public class StringReverse {

	static String UsingXOR(String str) {
		char[] array = str.toCharArray();
		int i=0;
		int length = array.length;
		while(i<length) {
			array[i] ^= array[length - i - 1];
			array[length - i - 1] ^= array[i];
			array[i] ^= array[length - i - 1];
			i++;
			--length;
		}
		return String.valueOf(array);
	}

	public static void main(String[] args) {
		String input1="JAMES BOND";
		System.out.println(UsingXOR(input1));
	}

}
