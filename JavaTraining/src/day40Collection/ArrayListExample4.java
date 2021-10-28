package day40Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample4 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: "+al.isEmpty());  
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("al collection elements: "+al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Ajay");
		al2.add("Hanumat");
		System.out.println("al2 collection elements: "+al2);
		al.retainAll(al2);
		System.out.println("after retainAll, al collection elements: "+al);
		System.out.println("iterating the elements after retaining the elements of al2");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("****************2nd Iteration using same iterator object***********************");
//		Iterator itr2 = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("****************2nd time Iteration using new iterator object***********************");
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		List l1=new ArrayList();
		l1.add("Amit");
		l1.add(true);
		l1.add(null);
		l1.add("Amit");
		
		List<String> l2=new ArrayList<String>();
		l2.add("Amit");
		l2.add(null);
		l2.add("Amit");
	}
}







