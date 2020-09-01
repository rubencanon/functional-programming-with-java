

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

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

	}
}
