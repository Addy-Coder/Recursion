package Medium;

//Lets Think : 
//	1. Now this probelm is very similar to subset sim problem but at the first instance it doesnt seems like it.
//	2. The way to think about this problem is that you have to understand one fundamental concept which is very trivial.
//	3. If we have an array of elements and we want to see if that can be equally partitioned or not then the first thing
//		that should come to our mind is that what is the way this is going to work.
//	4. Now think about this that if we add up all the elements and see that the value is even then we can have a possibilty
//		of dividing the array with equal terms of same sum.
//	5. Now if the sum is odd the how so ever we divide the array we will new get equal sum on both the subsets
//	6. Hence now its clear that we need to see if the number is even or odd, if odd then its not even possible.
//	7. Now think about the array {1,11,5,5} which gives the total sum of 22(even).
//	8. We are only interested in looking that if sum/2 number can be formed by adding any subsets, as if we manage to 
//		find a subset of which gives a sum of sum/2 the we can conclude that the other subset of the array has to give
//		the same sum as sum/2(since the sum of all the elements in the array is even).
//	9.  After this, the problem entirely transforms into an Subset Sum Problem, it does not need further explanation.

public class Equal_Partition {
	public static void main(String args[]) {
		int arr[] = {1, 11, 5 , 5};
		int n = arr.length;
		int sum= 0;
		for(int i = 0;i<n;i++) {
			sum += arr[i];
		}
		if(sum%2 == 0)
			System.out.println(equalPartition(sum/2,arr,n));
		else
			System.out.println("Not Possible when sum value is odd");
	}

	private static boolean equalPartition(int sum,int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return false;
		if(sum == 0)
			return true;
		
		if(arr[n-1]>sum)
			return equalPartition(sum, arr, n-1);
		else
			return equalPartition(sum, arr, n-1) || equalPartition(sum-arr[n-1], arr, n-1);
	}
}
