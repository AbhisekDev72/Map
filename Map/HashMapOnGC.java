package com.Map;

import java.util.*;

public class HashMapOnGC {

	public static void main(String[] args) throws Exception {
		HashMap hm = new HashMap();
		Temp t = new Temp();
		hm.put(t, "abhi");
		System.out.println(hm);
		
		t = null;   //garbage object
		
		System.gc();  //invoking garbage collection
		Thread.sleep(5000);
		System.out.println(hm);
		
/*		HashMap will always dominate Garbage Collector, that is if the Object is a part
		of HashMap and if the Object is Garbage Object, still Garbage Collector won't remove that
		Object from heap area.
*/
	}

}
class Temp {
	@Override
	public String toString() {
		return "temp";
	}
	@Override
	public void finalize() {
		System.out.println("Cleaning the Object");
	}
}
