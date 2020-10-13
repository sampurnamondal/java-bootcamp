/*Using Lambda Expressions to convert strings in list to uppercase */

package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintingCapLettersUsingLambda {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("India");
		nameList.add("France");
		nameList.add("London");
		
		Map<String, String> employees = new HashMap<>();
		employees.put("1", "Ann");
		employees.put("2", "Sam");

		nameList.forEach(name -> System.out.println(name.toUpperCase()));
		
		for(String name : nameList) {
			System.out.println(name.toUpperCase());
		}
		
		for(String id : employees.keySet()) {
			System.out.print("Employee id : " + id);
			System.out.println(" , Employee name : " + employees.get(id));
		}
		
		employees.forEach((id, name) -> System.out.println("Employee id : " + id + " " + "Employee name : " + name));
		
		
	}
}
