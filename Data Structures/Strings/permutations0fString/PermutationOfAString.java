package permutations0fString;

public class PermutationOfAString {
	/* Function to swap values at two pointers */
	void swap(char x, char y)
	{
	    char temp;
	    temp = x;
	    x = y;
	    y = temp;
	}

	static void permute(char [] a, int l, int r)
	{
//	   int i;
//	   if (l == r){
//	     System.out.println()
//	   }
//	   else
//	   {
//	       for (i = l; i <= r; i++)
//	       {
//	          swap((a+l), (a+i));
//	          permute(a, l+1, r);
//	          swap((a+l), (a+i)); //backtrack
//	       }
//	   }
	}

	public static void main(String[] args) {
	    String str="HelloWorld";
	    char []ch= str.toCharArray();
	    int n=str.length();
	    permute(ch,0,n-1);
	    

	}

}
