package anagrams;

import java.util.ArrayList;
import java.util.Scanner;

public class DetectAnagrams {

	public static void print(){
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Anagram Strings");
		int numberOfStrings = sc.nextInt();
		ArrayList<String> anagrams= new ArrayList<>();
		for (int i = 0; i < numberOfStrings; i++) {
			anagrams.add(sc.next());
		}
		
	}

}
