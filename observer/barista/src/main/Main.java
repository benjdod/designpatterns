package main;

public class Main {
	public static void main(String[] args) {
		CoffeeCounter c = CoffeeCounter.getCounter();
		Barista b = new Barista();
		c.addObserver(b);

		Drink kara = new Drink("Caramel Frappamiato", "Kara");
		Drink geoff = new Drink("Americano Italiano", "Geoff");
		Drink reginald = new Drink("Large Chai", "Reginald");
		Drink james = new Drink("Elderberry Sipper", "James");

		c.addDrink(kara);
		c.addDrink(geoff);
		c.addDrink(reginald);
		c.addDrink(james);

		c.removeDrink(geoff);
		c.removeDrink(reginald);

		// barista goes to the bathroom and stops watching the counter
		c.removeObserver(b);
		System.out.println("....");

		// nothing of the following is printed out because the barista is not 
		// watching the counter

		Drink binh = new Drink("Parsley Mocha", "Binh");
		Drink dave = new Drink("Pumpkin Spice Macha", "Dave");

		c.addDrink(binh);
		c.addDrink(dave);

		c.removeDrink(dave);


		// barista comes back
		c.addObserver(b);

		Drink davonte = new Drink("Cranberry Latte", "Davonte");
		c.addDrink(davonte);

		c.removeDrink(binh);
		c.removeDrink(kara);

	}
}
