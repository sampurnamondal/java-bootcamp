/*Lambda Expressions implementation*/

package com.sampurna.javabootcamp;

interface NumberTestable {
	Boolean factorTest(Integer number, Integer toTestFactor);
}

interface StringReversible {
	String reverse(String text);
}

//generic functional interfaces
interface Testable<T> {
	T test(T t);
}

public class LambdaExpressions {
	
	public static void main(String[] args) {

		NumberTestable numberTestable = (number, toTestFactor) -> (number % toTestFactor == 0);

		StringReversible stringReversible = text -> {
			StringBuilder temporaryText = new StringBuilder(text);
			return temporaryText.reverse().toString();
		};

		Testable<String> testable = text -> text.toUpperCase();
		
		Testable<String> testable2 = text -> text.toLowerCase();

		Testable<Integer> testable1 = number -> {
			Integer factoral = 1;
			while (number > 0) {
				factoral *= number;
				number--;
			}
			return factoral;
		};

		System.out.println(numberTestable.factorTest(10, 3));
		System.out.println(stringReversible.reverse("Java Rocks"));
		System.out.println(testable.test("France"));
		System.out.println(testable1.test(4));
		
		//passing lambda expression as argument
		String output = someStringFunction(testable, "Germany!");
		System.out.println(output);
		System.out.println(someStringFunction(testable2, "ITaLy"));
	}

	private static String someStringFunction(Testable<String> testable, String text) {
		return testable.test(text);
	}

}
