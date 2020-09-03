package jdk8;


import java.util.ArrayList;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(9);
		numbers.add(13);
		numbers.add(4);
		numbers.add(6);
		numbers.add(2);
		numbers.add(12);
		numbers.add(15);		
		//printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
		

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			System.out.println(number);
		}

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

	}

}
