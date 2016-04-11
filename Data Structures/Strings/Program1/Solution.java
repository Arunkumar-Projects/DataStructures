package Program1;

import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        A.trim();
		B.trim();
        System.out.println(A.length()+B.length());
        islexographicalOrder(A, B);
       	String a=firstCharacterUpper(A);
		String b=firstCharacterUpper(B);
		System.out.println(a+" "+b);
	}

	private static String firstCharacterUpper(String a) {
		
		String output = a.substring(0, 1).toUpperCase() + a.substring(1);
		return output;
	}
    
    private static void islexographicalOrder(String a, String b) {
		if (a.compareTo(b) > 0) {
			System.out.println("Yes");
		} else if (a.compareTo(b) < 0) {
			System.out.println("No");
		} else {
			System.out.println("No");
		}
	}

}