package com.sampurna.javabootcamp;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredefinedFunctionalInterface {

	public static void main(String[] args) {

		Predicate<Integer> testEvenPredicate = number -> number % 2 == 0;   //takes T and returns boolean

		Function<Integer, Boolean> testOddFunction = number -> {
			return !(testEvenPredicate.test(number));                       //takes T and returns type R
		};
		
		Supplier<Integer> numberSupplier = () ->  123;                  //returns something
		
		//Consumer<Integer> doubleNumber = number -> number * 2;
		
		BinaryOperator<String> concatStringsBinary = (text, text1) -> text + text1;       //takes 2 objects of T, does operation and returns an object of type T

		UnaryOperator<String> convertToUppercaseUnary = text -> text.toUpperCase();   //takes an object of type T, does unary operation and return object of type T
		
		System.out.println(testEvenPredicate.test(12));
		System.out.println(testOddFunction.apply(12));
		System.out.println(numberSupplier.get());
		System.out.println(concatStringsBinary.apply("Hello", "World"));
		System.out.println(convertToUppercaseUnary.apply("here"));
	}

}
