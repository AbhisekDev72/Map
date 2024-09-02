package com.Map;

import java.util.*;

//Hashtable default storage is 11

public class HashCodeIntro {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new Temp2(5),"A");
		ht.put(new Temp2(2),"B");
		ht.put(new Temp2(6),"C");
		ht.put(new Temp2(15),"D"); 
		ht.put(new Temp2(23),"E");
		ht.put(new Temp2(16),"F");
		System.out.println(ht);
	}
}
class Temp2{
	int i;
	public Temp2(int i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		return i;
	}
	@Override
	public String toString() {
		return i +" ";
	}
}
