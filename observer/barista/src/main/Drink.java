package main;

public class Drink {
	private String _drinkname, _customername;

	public Drink (String drinkname, String customername) {
		_drinkname = drinkname;
		_customername = customername;
	}

	public String getDrinkName() {
		return _drinkname;
	}

	public String getCustomerName() {
		return _customername;
	}
}
