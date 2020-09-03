package jdk8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FP03MethodReferences {
	
	private static void print(String str) {
		System.out.println(str);
	}

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
		
		courses.stream()
		 //.map(str -> str.toUpperCase())
		 .map(String::toUpperCase)
		 .forEach(FP03MethodReferences::print);
		
		Supplier<String> supplier = String::new;
		
		String xx = supplier.get();
	
		Stream<Integer> stm = Stream.of(1,56,45,12,8,98,78,98,12,10);
//		System.out.println(
//		stm.filter(x-> x>10).count()
//				);
//
//		
//		Stream<Integer> stm = Stream.of(1,56,45,12,8,98,78,98,12,10);
//		System.out.println(
//		stm.filter(x-> x>10).count()
//				);
//
//		System.out.println(
//		stm.filter(x-> x>10).count()
//				);
		System.out.println(
		stm.filter(x-> x>9).reduce(0,Integer::sum)
				);

		
		Stream<String> stmStr = Stream.of("Ruben Cañon", "AVL", "Elisha Cuthbert");
		System.out.println(
				stmStr.map(nombre->nombre.split("")).flatMap(Arrays::stream)
						);

		
	}
}
