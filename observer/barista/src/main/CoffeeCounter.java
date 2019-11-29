package main;

import java.util.ArrayList;

public class CoffeeCounter {
	
	// a List of drinks that the counter has on it
	private ArrayList<Drink> _drinks;	

	// and a List of observers who watch the counter
	private ArrayList<CounterObserver> _observers;

	private CoffeeCounter() {
		_drinks = new ArrayList<Drink>();
		_observers = new ArrayList<CounterObserver>();
	}

	private static CoffeeCounter _counter;

	public static CoffeeCounter getCounter() {
		if (_counter == null) {_counter = new CoffeeCounter();}
		return _counter;
	}


	// adding and removing drinks

	public void addDrink(Drink d) {
		_drinks.add(d);
		for (CounterObserver o : _observers) {
			o.drinkAdded(d);
		}
	}

	public void removeDrink(Drink d) {
		_drinks.remove(d);
		for (CounterObserver o : _observers) {
			o.drinkRemoved(d);
		}
	}


	// adding and removing observers 
	public void addObserver(CounterObserver o) {
		_observers.add(o);
	}

	public void removeObserver(CounterObserver o) {
		_observers.remove(o);
	}
}
