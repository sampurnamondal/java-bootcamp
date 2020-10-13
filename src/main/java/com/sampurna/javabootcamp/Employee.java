/*Using comparator and comparable*/

package com.sampurna.javabootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Integer id;
	private LocalDate DOJ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDOJ() {
		return DOJ;
	}

	public void setDOJ(LocalDate dOJ) {
		DOJ = dOJ;
	}
	
	public Employee(String name, Integer id, LocalDate DOJ) {
		this.name = name;
		this.id = id;
		this.DOJ = DOJ;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.id + " " + this.DOJ;
	}

	@Override
	public int compareTo(Employee o) {
		return (this.id.compareTo(o.getId()));
	}
	
	public static void main(String[] args) {
		
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee("John Smith", 1234, LocalDate.of(2019, 9, 8)));
		listOfEmp.add(new Employee("Lane Doe", 65, LocalDate.of(1990, 6, 5)));
		listOfEmp.add(new Employee("John Doe", 83335, LocalDate.of(2019, 9, 8)));
		
		Collections.sort(listOfEmp);
		System.out.println("BY ID");
		for(Employee person : listOfEmp) {
			System.out.println(person);
		}
		System.out.println("\n");
		
		EmployeeComparatorByDate employeeComparatorByDate = new EmployeeComparatorByDate();
		Collections.sort(listOfEmp, employeeComparatorByDate);
		System.out.println("BY DOJ");
		for(Employee person : listOfEmp) {
			System.out.println(person);
		}
		System.out.println("\n");
		
		Collections.sort(listOfEmp, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("BY NAME");
		for(Employee person : listOfEmp) {
			System.out.println(person);
		}
		
	}
}

class EmployeeComparatorByDate implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		int comapareValue = o1.getDOJ().compareTo(o2.getDOJ());
		if(comapareValue == 0) {
			return o1.getName().compareTo(o2.getName());
		}
		return comapareValue;
	}
}





