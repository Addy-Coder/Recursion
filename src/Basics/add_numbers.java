package Basics;

import java.util.Scanner;

// This is a Program to add numbers
// Input : 5
// Output : 5 + 4 + 3 + 2 + 1 = 15

public class add_numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println(add(5));
//		add(5);
	}

	private static int add(int n) {
		if(n == 0)
			return n;
		return n+add(n-1);
	}
}
