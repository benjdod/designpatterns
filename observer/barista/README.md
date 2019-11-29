### `Drink` (*class*):
The `Drink` class is a simple representation of a prepared drink. It has two fields, drink name and customer name, which are both required by the constructor and accessible by the methods `getDrinkName()` and `getCustomerName()` respectively.

### `CoffeeCounter` (*observable class*):
The `CoffeeCounter` class is the observable class. It has two Lists: one for drinks, and one for observers. 

It is also uses the factory design pattern, featuring a private constructor and static instance getter method. In the `Main` example, the singular instance returned from `getCounter()` is assigned to a variable `c` so that we don't have to keep typing `CoffeeCounter.getCounter()` everytime we need the instance, but the concept remains the same.

### `CounterObserver` (*interface*):
`CounterObserver` specifies two methods, `drinkAdded(Drink d)` and `drinkRemoved(Drink d)`. Any class which implements this interface can be added to the CoffeeCounter's list of observers, and anytime a drink is added, the counter calls `drinkAdded(Drink d)` for each of the observers in the list. Similarly, anytime a drink is removed, the counter calls `drinkRemoved(Drink d)` in the same way.

### `Barista` (*observer class, implements `CounterObserver`*):
`Barista` represents the barista behind the counter calling out the drinks as they're added to the counter. As mentioned, it implements `CounterObserver`; its implementation of `drinkAdded()` simply calls out (prints out) the name of the drink and the name of the customer, and `drinkRemoved()` calls out "thank you" to the customer who ordered the drink. 
