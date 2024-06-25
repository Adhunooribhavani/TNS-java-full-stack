package javafullstack;

import java.util.Scanner;

public class BiggestofThree {

	public static void main(String[] args) {
		//creates a scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number:");
		int num3 = scanner.nextInt();
		//Determine the largest number
		int largest;
		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		//printed the largest number
		System.out.println("The largest number is: "+ largest);
		//close the scanner to free up resources
		scanner.close();
		}
	}
