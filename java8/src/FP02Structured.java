

import java.util.ArrayList;
import java.util.List;

public class FP02Structured {

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
		int sum = addListStructured(numbers);
		
		System.out.println(sum);
		

	}

	private static int addListStructured(List<Integer> numbers) {
		//how to loop?
		//how to store the sum?
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}
}
