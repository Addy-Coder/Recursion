package Medium;

public class Knapsack_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] =  new int [] {60, 100, 120};
		int wt[] = new int [] { 10,20,30};
		int W = 50;
		int n = val.length;
		System.out.println(knapsack(W,wt,val,n));

	}

	private static int knapsack(int W, int[] wt, int[] val, int n) {
		// TODO Auto-generated method stub
//		Now mostly a recursion fuction is divided into two parts
//		1. Base Condition
//		2. Choice or Recursive call
//		
//		Few Things to remember when writing the choice or recursive call :
//			1. It is important to decrement or increment the value so that it does not fall into a infite loop
//			2. Imagine the stack when designing the call
//		
//		Things to remember while writing the base condition :
//			1. The trivial way to write the base condition is that to input a data and dry run the code so that 
//				at the end of the call we can get the base condition, however this is time consuming at some point.
//			2. The way we must write the base condition is by asking ourselves a basic question
//				"What is the minimum value that this problem can solve ??"
//			
//		In the case of 0-1 Knapsack :
//			1. We first make the choice tree:
//								 wt[i]
//							      / \
//							w[i]<=W   w[i]>W
//							  /  \         \
//						  Accept  Decline	Decline
//			2. Now we start with the base condition so ask the same question
//				i. 	if the Knapsack capacity (W) is zero the we cannot put anything in the bag hence profit return 0.
//				ii. if there is no items left then we can also return the profit to be 0 .		
//			3. Now we need to check whether the bag will get the maximum profit if the item is inside the bag or not.
		
		if(n == 0 || W == 0)
			return 0;
		
		if(wt[n-1]>W)
			return knapsack(W, wt, val, n-1);
		else
			return max(val[n-1]+knapsack(W-wt[n-1], wt, val, n-1),knapsack(W, wt, val, n-1));
		
	}

	private static int max(int a, int b) {
		// TODO Auto-generated method stub
		return a>b?a:b;
	}

}
