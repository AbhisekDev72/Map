package com.Map;

import java.util.*;

public class IdentityHM {

	public static void main(String[] args) {
//		HashMap hm = new HashMap();
//		Integer i1 = new Integer(10);
//		Integer i2 =new Integer (10);
//		hm.put(i1, "sachin");
//		hm.put(i2, "kohli");
//		System.out.println(hm);//(i1.equals(i2)) //{10=kohli}
		
		IdentityHashMap ihm = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 =new Integer (10);
		ihm.put(i1, "sachin");
		ihm.put(i2, "kohli");
		System.out.println(ihm);//{10=kohli, 10=sachin}
	}

}
