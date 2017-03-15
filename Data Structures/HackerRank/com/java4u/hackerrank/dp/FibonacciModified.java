package com.java4u.hackerrank.dp;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 
 * We define a modified Fibonacci sequence using the following definition:

Given terms  and  where , term  is computed using the following relation:
For example, if term  and , term , term , term , and so on.

Given three integers, , , and , compute and print term  of a modified Fibonacci sequence.

Note: The value of  may far exceed the range of a -bit integer. Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++), you will need to be more creative in your solution to compensate for the limitations of your chosen submission language.

Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

 may far exceed the range of a -bit integer.
Output Format

Print a single integer denoting the value of term  in the modified Fibonacci sequence where the first two terms are  and .

Sample Input

0 1 5
Sample Output

5
Explanation

The first two terms of the sequence are  and , which gives us a modified Fibonacci sequence of . Because , we print term , which is .
 * 
 */
public class FibonacciModified {
	 private static Map<Integer, BigInteger> memo = new HashMap<>();
	    private static BigInteger t1;
	    private static BigInteger t2;
	    public static BigInteger fibonacci(int n) {
	    if (n == 0 || n == 1) {
	        return t1;
	    }
	    if(n==2){
	        return t2;
	    }
	    if (memo.containsKey(n)) {
	        return memo.get(n);
	    }
	    BigInteger t =  fibonacci(n-1).pow(2);  
	    //System.out.println(t);   
	    BigInteger v  = fibonacci(n - 2).add(t);
	    memo.put(n, v);
	    return v;
	    }

	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner( System.in );
	        String input = keyboard.nextLine();     
	        String[] numbers = input.split(" ");
	        t1= new BigInteger(numbers[0]);
	        t2= new BigInteger(numbers[1]);
	        Integer n= new Integer(numbers[2]);
	        System.out.println(fibonacci(n));
	    }
}
