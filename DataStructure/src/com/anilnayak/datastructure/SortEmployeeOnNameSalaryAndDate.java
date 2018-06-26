package com.anilnayak.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	private Date  date;
	public Employee() {
		
	}
	public Employee(String name, Double salary, Date date) {
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", date=" + date + "]";
	}
	@Override
	public int compareTo(Employee emp) {
	
		return this.name.compareTo(emp.name) + 
				(this.salary.compareTo(emp.salary))+
				(this.date.compareTo(emp.date));
	}
	
	
	
}

public class SortEmployeeOnNameSalaryAndDate {

	public static void main(String[] args) {

		 Employee emp1 = new Employee("ank", 2000.00, new Date(2016 - 1900, 11, 14));
         Employee emp2 = new Employee("dav", 500.00, new Date(2016 - 1900, 11, 23));
         Employee emp3 = new Employee("ank", 1000.00, new Date(2016 - 1900, 11, 22));
         Employee emp4 = new Employee("sam", 9000.00, new Date(2016 - 1900, 11, 29));
       
         
         List<Employee> l = new ArrayList<Employee>();
         l.add(emp1);
         l.add(emp2);
         l.add(emp3);
         l.add(emp4);
         
         Collections.sort(l);
         
         System.out.println(l);
	}

}
