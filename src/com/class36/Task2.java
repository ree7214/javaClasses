package com.class36;
//Task2
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/*Create a Map that will store Employee name and salary.
 Write a logic to retrieve an employee who gets the highest
 salary. Output should be in the below format
John Smith=$100000 */
	class Person{
		private String name, lastName;
		private int salary;
	 Person (String name, String lastName,int salary) {
			this.name = name;
			this.lastName=lastName;
			this.salary=salary;}
	 void display() {
			System.out.println(name+" "+lastName+" "+salary);
		}
	}
	public class Task2 {
	 public static void main(String[] args) {
			Map<Integer, Person> mapPerson=new LinkedHashMap<>();
			mapPerson.put(1, new Person("Maria", "Merriman", 100000));
			mapPerson.put(2, new Person("Michale", "Merriman", 150000));
			mapPerson.put(3, new Person("Danel", "Sweeney", 120000));
			mapPerson.put(4, new Person("Anna", "Sweeney", 800000));
			Collection<Person> coll=mapPerson.values();
			for (Person person : coll) {	
				person.display();
			}
			Set<Integer> key=mapPerson.keySet();
			for (Integer k:key) {
				System.out.println(k);
			}
	}}