package com.p2.hashset;

import java.util.Vector;

	public class BelajarVector{
		public static void main( String[] arg){
		Vector v = new Vector();
		v.add("Zak");
		v.add("Gordon");
		v.add(0,"Duke");
		v.add("Lara");
		v.add("Zak");
		v.add(1,"Steffi");
		
		String nama=(String) v.get(2);
		System.out.println(nama);
}
}