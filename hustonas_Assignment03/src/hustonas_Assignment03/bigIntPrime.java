/***************************************
 * Name: Ash Huston
 * Assignment #: Assignment01
 * Course #, Section: Course 2045 Section 01
 * Due Date: 01/30/2018
 * Description: This method is used to determine if a number of type BigInteger is prime or not.
 */
package hustonas_Assignment03;

import java.math.BigInteger;

public class bigIntPrime {
	/**
	 * This method is used to determine if a number is 
	 * prime or not using BigInteger operators
	 * @param num the number to be tested.
	 * @return returns true if the number is prime and false if the number is not prime.
	 */
	public static boolean isPrime(BigInteger num){
		//Declare and istantiate objects to use with the method
		//BigInteger seven = new BigInteger("7");
		//BigInteger five = new BigInteger("5");
		//BigInteger three = new BigInteger("3");
		BigInteger two = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		
		//Execptions
		if (num.equals(one)){System.out.println("23");return false;}
		if (num.equals(two)){System.out.println("24");return true;}
		//Eliminates even numbers
		if ((num.mod(two)).compareTo(zero)==0){System.out.println("25");return false;}
		
		/*This loop checks each odd number from 3 upward until it finds one that evenly 
		 * divides the test number. It will return false if it finds one and it will 
		 * return true if it makes it to halfway to the size of the test number.
		 */
		for (BigInteger i = new BigInteger("3"); num.compareTo(i)>=0; i = i.add(two)){
			if ((num.mod(i)).compareTo(zero)==0){System.out.println(i);return false;}
			if (((num.add(one)).mod(two)).compareTo(i)==0){return true;}
		}
		return true;
	}
}
