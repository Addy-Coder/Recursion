package Basics;

import java.util.Scanner;

	public class Series1 {
		public static void main(String args[]) {
			
			num(5);
		}
	
		private static void num(int n) {
			// TODO Auto-generated method stub
			if(n>0) {
				System.out.println(n);
				num(n-1);
				
			}
			
		}
}
