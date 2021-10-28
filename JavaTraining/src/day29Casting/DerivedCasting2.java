package day29Casting;
class Member {
	// Memmber variable of this class
	String name;
	long phone;
	// Member function of this class
	void chat() {
		// Print message of Member/ Child class
		System.out.println(name + " : chatting in whatsapp group with "+phone);
	}
}
class Admin extends Member {
	// Member function of this class
	void addUser() {
		// Print message of Admin/ Parent class
		System.out.println(name + " : adding a new user in whatsapp group");
	}
}
class DerivedCasting2 {

	// Main driver method
	public static void main(String[] args) {
		// Creating an object Ad
		Member mem = new Admin();//implicit or auto upcasting		
		mem.name = "Sneha";
		mem.phone = 9876543210l;
		// Calling function
		mem.chat();		
		
		Admin ad = (Admin) mem; // Downcast to access specific property of subclass
		ad.addUser();
		ad.chat();
		System.out.println(ad.name);
		System.out.println(ad.phone);
		
		//Admin a1=new Member();//direct downcasting, invalid or not possible
	}
}
