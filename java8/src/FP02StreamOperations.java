

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {

	@SuppressWarnings("unused")
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
		numbers.stream()
			.distinct() //Stream<T> Intermediate
			.sorted() //Stream<T>
			.forEach(System.out::println); //void

		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number) //Stream<R>
				.collect(Collectors.toList()); //R

		List<Integer> evenNumbersOnly = numbers.stream()
				.filter(x -> x % 2 == 0) //Stream<T>
				.collect(Collectors.toList());
		
		int sum = numbers.stream()
				.reduce(0, (x,y) -> x*x + y*y); //T
		
		int greatest = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
		
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
		List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
				.sorted(Comparator.comparing(course -> course.length()))
				.collect(Collectors.toList());
		
	}
}
