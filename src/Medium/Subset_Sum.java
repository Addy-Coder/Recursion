package Medium;

public class Subset_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[] = {3,34,4,12,5,2};
		int sum = 9;
		int n = set.length;
		if(subsetSum(set,sum,n) == true)
			System.out.println("There exists a solution");
		else
			System.out.println("There DO NOT exist a solution");

	}

	private static boolean subsetSum(int[] set, int sum, int n) {
		// TODO Auto-generated method stub
//		So lets think :
//			1. This is kind of a type of Knapsack problem but with a little twist
//			2. Base Condition :
//				i. 	if the sum is 0 the return true as there will always exist the sum==0.
//				ii. if there are no elements in the set then we return false as we will never get the answer
//			3. Choice : 
//							      sum
//							   /       \
//						set[i]<=sum 	set[i]>sum
//						   /  \             \ 
//						Accept Decline       Decline
		if(n==0)
			return false;
		if(sum==0)
			return true;
		
		if(set[n-1]>sum)
			return subsetSum(set, sum, n-1);
		else
			return subsetSum(set, sum-set[n-1], n-1) || subsetSum(set, sum, n-1);
						
	}

}
