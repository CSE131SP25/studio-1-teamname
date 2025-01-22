package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("The first of two integers to be averaged?");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for n1: ");
		double n1 = in.nextDouble();
		System.out.print("Enter value for n2: ");
		double n2 = in.nextDouble();
		
		
		System.out.println((n1 + n2)/2); 
		// TODO Auto-generated method stub

	}

}
