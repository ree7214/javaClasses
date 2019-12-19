package com.class35;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetieveAll1 {

	public static void main(String[] args) {
		// create a map of a person(name,lastname, address, city, state)

		Map<String, String> personMap = new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");

		System.out.println(personMap);

		// how to retrieve a specific value?

		String value = personMap.get("State");
		System.out.println(value);

		// how to retrieve all keys and all values
		System.out.println("-----1st way----------");
		
		Set<String> keys = personMap.keySet();

		for (String key : keys) {
			System.out.println(key + ":" + personMap.get(key));
		}
		
		System.out.println("-----2nd way----------");
		
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
			//CE--- System.out.println(keysIterator.next()+":"+personMap.get(keysIterator.next()));
			String mapKey = keysIterator.next();
			String mapValue = personMap.get(mapKey);
			System.out.println(mapKey + ": " + mapValue);
		}
	}

}
