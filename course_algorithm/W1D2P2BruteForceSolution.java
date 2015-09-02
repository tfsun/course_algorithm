package course_algorithm;

public class W1D2P2BruteForceSolution {

	private static boolean isSubsetSum(int set[], int n, int sum) 
	{
	   if (sum == 0)
	     return true;
	   if (n == 0 && sum != 0)
	     return false;
	 
	   if (set[n-1] > sum)
	     return isSubsetSum(set, n-1, sum);
	 
	   return isSubsetSum(set, n-1, sum) || isSubsetSum(set, n-1, sum-set[n-1]);
	}
	public static void main(String[] args) {
		  int set[] = {1, 10, 7, 25, 4};
		  int sum = 35;
		  
		  if (isSubsetSum(set, set.length, sum) == true)
		     System.out.println("subset with given sum exists!");
		  else
			  System.out.println("subset with given sum does't exist!");
	}

}
