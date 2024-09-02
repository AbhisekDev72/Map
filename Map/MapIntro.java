package com.Map;

import java.util.*;
import java.util.Map;

public class MapIntro {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("sachin", 10);
		hm.put("dhoni", 7);
		hm.put("kohli", 18);
		hm.put("dravid", 19);
		
		System.out.println(hm);
		System.out.println(hm.put("sachin", 99));
		
		Set s = hm.keySet();
		System.out.println(s);
		Collection c = hm.values();
		System.out.println(c);
		
		//Changes will be shown in entryset if there is any change in key or value 
		Set s1 = hm.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + "------------------->" + m1.getValue());			
		}
	}
}
