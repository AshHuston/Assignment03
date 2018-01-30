/***************************************
 * Name: Anthony Walriven
 * Assignment #: Assignment03
 * Course #, Section: Course 2045C Section 001
 * Due Date: 01/30/2018
 * Description: This method is used to determine if a number of type BigInteger is prime or not.
 * Main written and commented by Anthony Walriven, using GitHub to pass the program to Ash 
 */

package bigIntPrime;

import java.math.BigInteger;

import bigIntPrime.bigIntPrime;

public class Main {

	public static void main(String[] args) {

		// Test method for expected answer, using predetermined values
		// Expected answer is False
		BigInteger value1 = new BigInteger("9223372036854775808");
		boolean test1 = bigIntPrime.isPrime(value1);
		
		// Test method for expected answer, using predetermined values
		// Expected answer is True
		BigInteger value2 = new BigInteger("899809363");
		boolean test2 = bigIntPrime.isPrime(value2);
		
		// Test method for expected answer, using predetermined values
		// Expected answer is False
		BigInteger value3 = new BigInteger("153141883460469231731627303715884105759");
		boolean test3 = bigIntPrime.isPrime(value3);
		
		// if/else statement to ensure all test worked properly
		// Print a statement if all test did NOT work properly
		if (((!test1)&&(test2))&&(!test3)) 
		{
			System.out.println("The method is working properly!");
		} 
		else 
		{
			System.out.println("The method is not working properly :(");
			
		}
		
	}

}
