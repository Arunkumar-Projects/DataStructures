package factorialNumber;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FactorialNumber {

	public int fact(int n){
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
	
	public static Map<Integer,BigInteger> preprocess(int n)
	  {
	    //the preprocessing step needs to be run once
	    Map<Integer,BigInteger> factorials = new HashMap<Integer,BigInteger>();
	    factorials.put(0,new BigInteger("1"));
	    for(Integer i=1; i <= n; ++i)
	    {
	      BigInteger fact = new BigInteger(i.toString()).multiply(factorials.get(i - 1));
	      factorials.put(i,fact);
	    }
	    return factorials;
	  }
	  public static void main(String [] args)
	  {
		
	    //The argument to preprocess cn be variable
	    Map<Integer,BigInteger> computedFactorials = preprocess(2000);
	    //Now you can get the factorial of any number in [0,2n] in O(1) time
	    System.out.println("Factorial of 1000 is " + computedFactorials.get(1000));
	    System.out.println("Factorial of 2000 is " + computedFactorials.get(2000));
	  }
	

}
