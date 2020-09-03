package jdk8;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Long> timeInteger = x -> System.out.println(x);
		BinaryOperator<Long> binaryFunction = (x,y)->y-x;
		LongBinaryOperator longFunction = (x,y)->y-x;

		LongConsumer time = x->System.out.print(x+"\n");
		time.accept(longFunction.applyAsLong(System.nanoTime(), System.nanoTime()));

		Consumer time2 = x->System.out.print(x+"\n");
		time2.accept(binaryFunction.apply(System.nanoTime(), System.nanoTime()));


		System.out.println(difference(System.nanoTime(), System.nanoTime()));
		time.accept((difference(System.nanoTime(), System.nanoTime())));

		
		
	}
	
	public static long difference(Long x, Long y) {
		return y-x;
	}

}
