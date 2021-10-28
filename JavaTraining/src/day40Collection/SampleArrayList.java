package day40Collection;

import java.util.ArrayList;
public class SampleArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Pune");// String class object is getting upcasted to the Object class object, Object obj="Pune";
		al.add("Mumbai");
		al.add("Chennai");
		al.add("Bangalore");
		System.out.println("ArrayList element count: "+al.size());
		System.out.println("ArrayList elements are: "+al);
		al.add(1, "Delhi");
		System.out.println("ArrayList element count: "+al.size());
		System.out.println("ArrayList elements are: "+al);
		
		al.add("Pune");
		System.out.println("ArrayList element count: "+al.size());
		System.out.println("ArrayList elements are: "+al);
		al.add(null);
		System.out.println("ArrayList element count: "+al.size());
		System.out.println("ArrayList elements are: "+al);
		/**
		 * int will be converted into Integer class object, dn it will upcasted in to Object class object
		 * 					//or
		 * first boxing operation --->Integer Class Object ---> Auto-upcasting to convert it to object class object
		 */
		al.add(411015);
		System.out.println("ArrayList element count: "+al.size());
		System.out.println("ArrayList elements are: "+al);
		
		al.add(true);//Boxing dn upcasting
		System.out.println("ArrayList element count: "+al.size());
		System.out.println("ArrayList elements are: "+al);
		
		
//		al.add(8, "Nagpur");//array index out of bound exception
//		System.out.println("ArrayList element count: "+al.size());
//		System.out.println("ArrayList elements are: "+al);
	}
}
