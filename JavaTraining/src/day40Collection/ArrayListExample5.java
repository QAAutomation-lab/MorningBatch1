package day40Collection;

import java.util.ArrayList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArrayListExample5 {
	public static void main(String[] args) {
		// Creating list of Books
		List<Book> l1 = new ArrayList<Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		System.out.println(b1.id);
		System.out.println(b1.name);
		System.out.println(b1.author);
		System.out.println(b1.publisher);
		System.out.println(b1.quantity);
		// Adding Books to list
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		// Traversing list
		for (Book b : l1) {//Book b=l1=b1=new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}