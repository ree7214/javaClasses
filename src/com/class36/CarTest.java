package com.class36;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//create a car class that will have varibles, methods, and constructor
	//create a map that will hold car number and car objects store in it.
class Car{
	
	String make, model;
	
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
		
	}
	
	public void display() {
		
		System.out.println(make+" "+model);
	}
	
}

public class CarTest {
	
	public static void main(String[] args) {
	//collection    keytype   valuetype		variable name 	 new   	LinkedHashMap<----keeping order
		Map      <Integer,    Car>          mapCar=          new LinkedHashMap<>();
		
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "S"));
		
		//display only value objects
		Collection<Car>coll=mapCar.values();
		for(Car c:coll) {
			System.out.println(c.make+" "+c.model);
			c.display();
		}
		
		//map key to its corresponding value (entrySet or keySet)
		
		Set<Entry<Integer,Car>>set=mapCar.entrySet();
		for(Entry<Integer,Car>ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
		System.out.println("Key "+i+" is associated with value of "+c.make);	
		}
		// usting keyset to map keys to values
		
		Set<Integer>keySet=mapCar.keySet();
		
		for(int key:keySet) {
			//              Integer + map Object->value object (car type)  
		//	System.out.println(key+" "+mapCar.get(key).make+" "+mapCar.get(key).model);
			
			// breaking it down and storing
			
			Car car = mapCar.get(key);
		String carDetails = car.make+car.model;
		System.out.println(key+"="+carDetails);
			
			
		}
		//using Iterator to iterate through value, keySet entrySet
		
		

	}

}
