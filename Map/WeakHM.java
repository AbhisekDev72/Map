package com.Map;

import java.util.*;

public class WeakHM {
	public static void main(String[] args) throws Exception {
		WeakHashMap hm = new WeakHashMap();
		Temp1 t = new Temp1();
		hm.put(t, "abhi");
			System.out.println(hm);
			
		t = null;   //garbage object
			
		System.gc();  //invoking garbage collection
		Thread.sleep(5000);
		System.out.println(hm);
			
/*	Garbage Collector will dominate WeakHashMap, that is if the Object is part of
	WeakHashMap and
	if that Object is Garbage Object, then immediately Garbage Collector will remove
    that Object from heap area.
*/
	}

}
class Temp1 {
	@Override
	public String toString() {
		return "temp";
	}
	@Override
	public void finalize() {
		System.out.println("Cleaning the Object");
	}

}

