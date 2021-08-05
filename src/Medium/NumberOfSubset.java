package Medium;

public class NumberOfSubset {
	
	public static void main(String args[]) {
		int set[] = {1,2,3,4,5};
		int sum = 7;
		int n = set.length;
		System.out.println(numSubset(set,sum,n));
	}

	private static int numSubset(int[] set, int sum, int n) {
		// TODO Auto-generated method stub
//		Lets think
//		1. This is problem is exactly equal to the subset sum problem we will write the exact same code with 
//			few modifications.
//		2. Base Condition:
//			i. 	if sum is 0 then we return 1 as we will always find the sum with value 0.
//			ii.	if n is 0 i.e. we dont have any elements we will never find the sum whatsoever.
//		3. Choice :
//							     set[i]
//							     /    \
//						sum>=set[i]  set[i]>sum
//						  /      \         \
//					 Accept  +   Reject    Reject
//					
//		4. Only thing is to remember that we need to return the number of subset possible which we can get if
//				just add the numbers which we get from the ACCEPT and REJECT phase.
		
	
		if(sum==0)
			return 1;
		if(n==0)
			return 0;
		if(set[n-1]>sum)
			return numSubset(set, sum, n-1);
		else
			return numSubset(set, sum, n-1)+numSubset(set, sum-set[n-1], n-1);
	}
	
}
