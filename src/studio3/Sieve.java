package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Between 1 and a number, what would you like that number to be?");
		int n = in.nextInt();
		boolean[] array = new boolean [n+1] ;
		
		for (int i = 1; i <= n; i++)
		{array[i] = true;
		}
		
		for (int j = 2; j< (n/2); j++){
			for (int k = 2; (j*k)<= n; k++) {
				array[j*k] = false;
				
		}
		
			}
	for (int l = 2; l < n+1; l++) {
	if (array[l]) {
	System.out.println(l);
	}
}
	}}


