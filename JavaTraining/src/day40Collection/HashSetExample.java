package day40Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String args[]) {
		// Creating HashSet and adding elements
		Set<String> set = new HashSet<String>();
		// in set if you try to add duplicate element dn it will neglect that element
		// instead of throwing an error or exception
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");// it don't get added in set
		set.add("Ajay");
		System.out.println("After invoking remove(object) method: " + set);
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("removing Ravi from set: " + set.remove("Ravi"));
		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		System.out.println("set1 elements: " + set1);
		set.addAll(set1);
		System.out.println("Updated List: " + set);
		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);
		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: " + set);
		// Removing all the elements available in the set
		set.clear();
		System.out.println("After invoking clear() method: " + set);
		
		List<String> l1=new ArrayList<String>();
		l1.add("Pune");
		l1.add("Bangalore");
		l1.add("Pune");
		l1.add("Mumbai");
		System.out.println("****************l1: "+l1);
		Set s1=new HashSet();
		s1.addAll(l1);
		System.out.println("****************s1: "+s1);
		Set s2=new HashSet(l1);
		System.out.println("****************s2: "+s2);
		
		String str="I am from pune and pune is IT HUB, I am staying in Dhanori";
		String[] sr1=str.split(" ");
		
		List<String> list=Arrays.asList(sr1);
		Set<String> st=new HashSet(list);
		Iterator<String> it=st.iterator();
		for(int i=0;i<st.size();i++) {
			String name= it.next();
			System.out.println(name+":  "+Collections.frequency(list, name));
		}
	}
}















