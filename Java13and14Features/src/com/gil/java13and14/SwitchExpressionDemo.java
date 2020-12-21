package com.gil.java13and14;

public class SwitchExpressionDemo {
	public static void main(String[] args) {
		int key = 2;
		// assigning switch to a variable
		String result = switch (key) {
		case 1: {
			/*
			 * Return return is use it to return the execution from within a function yield
			 * is used it to return the execution
			 * 
			 * with a value from the case.
			 */
			yield "Choice 1";
		}
		default:
			yield " lol error " ;
			//throw new IllegalArgumentException("Unexpected value: " + key);
		};
		System.out.println(result);
		
		
		
		
		//Switch Lambda Syntax
		int choice = 1;
		
		String response = switch (choice) {
		case 1 ->{
			yield "You have no money";
		}
		case 2 ->{
			yield "Withdrawing..";			
		}
		case 3->{
			yield "Deposit in progress..";
		}
		
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + choice);
		};
		
		System.out.println(response);
	}
}
