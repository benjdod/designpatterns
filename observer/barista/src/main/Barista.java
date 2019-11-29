package main;

public class Barista implements CounterObserver {

	// this is the observer class, it is added to an observable, and 
	// when update(Drink d) is called, it prints out the name and customer 
	// associated with the drink. 

	private int _count;

	public Barista() {
		_count = 0;
	}
	
	public void drinkAdded(Drink d) {
		System.out.println("\"" + d.getDrinkName() + " for " + d.getCustomerName() + "!\"");
		_count++;
		if (_count % 3 == 0) {
			System.out.println("        (When does my shift end...)");
		}
	}

	public void drinkRemoved(Drink d) {
		System.out.println("\"Have a good day " + d.getCustomerName() + "!\"");
	}
}
