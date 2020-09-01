

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class FP03LambdaExpressions {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<String> courses = new ArrayList<String>();
		courses.add("Spring");
		courses.add("Spring Boot");
		courses.add("API" );
		courses.add("Microservices");
		courses.add("AWS");
		courses.add("PCF");
		courses.add("Azure");
		courses.add("Docker");
		courses.add("Kubernetes");
		courses.stream().sorted().forEach( (String x) -> System.out.println(x));
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(9);
		numbers.add(13);
		numbers.add(4);
		numbers.add(6);
		numbers.add(2);
		numbers.add(12);
		numbers.add(15);
		Integer sum = numbers.stream().reduce(0, (Integer x,Integer y) -> x + y);
		
		Supplier<Integer> randomSupplier = () -> {
			 // create instance of Random class 
	        Random rand = new Random(); 
	        return rand.nextInt(1000); 
		};
		
		System.out.println(randomSupplier.get());
		
		//Playing with Return Statements
		
		//Playing with Braces
		
		
	}
}
