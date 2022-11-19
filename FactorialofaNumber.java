package workshop;

import java.util.Scanner;

public class FactorialofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();
		int i, factorial = 1;
		
		for(i = 1; i<=num; i++) {
			
			factorial = factorial*i;
		}
		System.out.println("Factorial of Number "+num+" is "+factorial);
	}

}
