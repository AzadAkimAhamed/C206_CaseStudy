
public class LunchBoxOrder {

	private int OrderID;
	private String date;
	private double price;
	private String Setmeal;
	private String drink;
	private String fruit;

	public LunchBoxOrder(int orderID, String date, String setmeal, String drink, String food, double price) {
		this.OrderID = orderID;
		this.date = date;
		this.price = price;
		this.Setmeal = setmeal;
		this.drink = drink;
		this.fruit = fruit;

	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int OrderID) {
		this.OrderID = OrderID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSetmeal() {
		return Setmeal;
	}

	public void setSetmeal(String setmeal) {
		Setmeal = setmeal;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public static void add(LunchBoxOrder lunchBoxOrder) {
		// TODO Auto-generated method stub

	}

}
