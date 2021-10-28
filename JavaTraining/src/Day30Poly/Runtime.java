package Day30Poly;

class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}

class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}

class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}

class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}

public class Runtime {
	public static void main(String args[]) {
		Animal A = new Animal();
		A.eat();// Animals Eat
		Animal h = new herbivores(); // upcasting
		h.eat();// Herbivores Eat Plants
		Animal o = new omnivores(); // upcasting
		o.eat();// Omnivores Eat Plants and meat
		Animal c = new carnivores(); // upcasting
		c.eat();// Carnivores Eat meat

	}
}