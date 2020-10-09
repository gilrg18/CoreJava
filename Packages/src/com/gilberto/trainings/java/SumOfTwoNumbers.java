package com.gilberto.trainings.java;
import java.util.Scanner;
public class SumOfTwoNumbers {
	public static void main(String[] args) {
		
		System.out.println("Enter Two Integers");
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.next());
		System.out.println("Number 1: "+num1);
		int num2 = Integer.parseInt(scanner.next());
		System.out.println("Number 2: "+num2);
		scanner.close();
		int result = num1 + num2;
		System.out.println("Sum is " + result);
		
	}
}
