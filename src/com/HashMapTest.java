package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put(101, "delhi");
		map.put(102, "mumbai");
		map.put(109, "manali");
		map.put(105, "kerela");
		map.put(110, "khatima");
		
		System.out.println(map);
		
		Set s = map.keySet();
		System.out.println(s);
		Collection values = map.values();
		System.out.println(values);
		
		Set s1 = map.entrySet();
		System.out.println(s1);
		
		Iterator iterator = s1.iterator();
		while(iterator.hasNext()) {
			Map.Entry m1 = (Map.Entry)iterator.next();
			
			System.out.println(m1.getKey()+"..."+m1.getValue());
			
			if(m1.getKey().equals(101)) {
				m1.setValue("California");
			}
			
		}
		System.out.println(map);
		
			

	}

}
