package main;

public interface CounterObserver {

	// the observer interface. This specifies one method with a 
	// single Drink as its input

	public void drinkAdded(Drink d);
	public void drinkRemoved(Drink d);
}
