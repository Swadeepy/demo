package com.example.demo.springbootjsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemospringbootjspApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootjspApplication.class, args);
		/*
		 * String Str = "Swadeep"; System.out.println(Str.charAt(3));
		 * System.out.println(Str.indexOf('d'));
		 * System.out.println(Str.compareToIgnoreCase("SwAdeep"));
		 */

		// Map Implementation

		/*
		 * Map<Integer, String> strmap = new HashMap<>();
		 * 
		 * strmap.put(1, "Swadeep"); strmap.put(2, "Sunny"); strmap.put(3, "Venu");
		 * 
		 * String strMapName = strmap.get(1); System.out.println(strMapName);
		 * 
		 * Iterator<Map.Entry<Integer, String>> iterator = strmap.entrySet().iterator();
		 * 
		 * while (iterator.hasNext()) { Map.Entry<Integer, String> entry =
		 * iterator.next(); Integer key = entry.getKey(); String value =
		 * entry.getValue();
		 * 
		 * if (value.equals("Sunny")) { // iterator.remove(); // removing the elements
		 * entry.setValue("Sindhu"); // updating the elements
		 * 
		 * }
		 * 
		 * }
		 * 
		 * Iterator<Integer> iterator1 = strmap.keySet().iterator();
		 * while(iterator1.hasNext()) {
		 * System.out.println(strmap.get(iterator1.next())); }
		 * 
		 * System.out.println(strmap);
		 */

		// List Implementation

		/*
		 * List<String> lst = new ArrayList<>(); lst.add("A"); lst.add("B");
		 * lst.add("B"); int i = 0; ListIterator<String> Iteratorlst =
		 * lst.listIterator(); while (Iteratorlst.hasNext()) { String str12 =
		 * Iteratorlst.next();
		 * 
		 * if (str12.equals("B") && i != 1) { Iteratorlst.set("C"); } i++; }
		 * System.out.println(lst);
		 */

		// Hash Set Implementation
		/*
		 * Set<String> strSet = new HashSet(); strSet.add("A"); strSet.add("B");
		 * strSet.add("C");
		 * 
		 * Iterator<String> iteratorset = strSet.iterator(); while
		 * (iteratorset.hasNext()) { String strset = iteratorset.next(); if (strset ==
		 * "A") { iteratorset.remove(); // strSet.add("D"); } }
		 * 
		 * System.out.println(strSet);
		 */

		// Streams

		List<String> wordlist = new ArrayList<>();
		wordlist.add("apple");
		wordlist.add("banana");
		wordlist.add("cherry");
		wordlist.add("date");

		List<String> Filteredwordlist = wordlist.stream().filter(s -> s.startsWith("a")).toList();
		
		Map<Integer,String> Mapword = new HashMap<>();
		Mapword.put(1, "apple");
		Mapword.put(2, "banana");
		Mapword.put(3, "cherry");
		Mapword.put(4, "date");
		

		System.out.println(Filteredwordlist);

	}

}
