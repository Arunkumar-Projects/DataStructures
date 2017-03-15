package com.java4u.hackerrank.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * How many different ways can you make change for an amount, given a list of coins? In this problem, your code will need to efficiently compute the answer.

Task

Write a program that, given

The amount  to make change for and the number of types  of infinitely available coins
A list of  coins - 
Prints out how many different ways you can make change from the coins to STDOUT.

The problem can be formally stated:

Given a value , if we want to make change for  cents, and we have infinite supply of each of  valued coins, how many ways can we make the change? The order of coins doesn’t matter.

Solving the overlapping subproblems using dynamic programming

You can solve this problem recursively, but not all the tests will pass unless you optimise your solution to eliminate the overlapping subproblems using a dynamic programming solution

Or more specifically;

If you can think of a way to store the checked solutions, then this store can be used to avoid checking the same solution again and again.
Input Format

First line will contain 2 integer N and M respectively. 
Second line contain M integer that represent list of distinct coins that are available in infinite amount.

Constraints

The list of coins will contain distinct integers.
Output Format

One integer which is the number of ways in which we can get a sum of N from the given infinite supply of M types of coins.

Sample Input

4 3
1 2 3 
Sample Output

4
Sample Input #02

10 4
2 5 3 6
Sample Output #02

5
Explanation

Example 1: For  and  there are four solutions: 

Example 2: For  and  there are five solutions: .

Hints

Think about the degenerate cases:

How many ways can you give change for 0 cents?
How many ways can you give change for >0 cents, if you have no coins?
If you are having trouble defining your solutions store, then think about it in terms of the base case 

For help on reading from STDIN, see the HackerRank environment help page under the "Sample Problem Statement" section.
 * 
 */
public class CoinChangeProblem {
    static long countWays(int S[], int m, int n)
    {
      long[] table = new long[n+1];
 
        // Initialize all table values as 0
        Arrays.fill(table, 0);   
 
        // Base case (If given value is 0)
        table[0] = 1;

        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
 
        return table[n];
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( System.in );
        String input = keyboard.nextLine();
        String[] numbers = input.split(" ");
        int m= Integer.parseInt(numbers[0]);
        int n= Integer.parseInt(numbers[1]);
        ArrayList<Integer> list= new ArrayList<Integer>();
        while(keyboard.hasNext()){
            list.add(keyboard.nextInt());
        }
        int [] S =list.stream().mapToInt(i->i).toArray();
        //System.out.println(m);
        //System.out.println(n);    
        System.out.println(countWays(S,n,m));
    }
}
