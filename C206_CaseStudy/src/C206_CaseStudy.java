import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Bill> billList = new ArrayList<Bill>();

		billList.add(new Bill(11, "Western cuisine", "Watermelon", "Orange juice", 4.00));
		billList.add(new Bill(22, "Japanese cuisine", "Grapes", "Strawberry Tea", 3.60));
		billList.add(new Bill(9, "Vegeterian food", "Orange", "Milo", 2.00));

		ArrayList<DailyMenu> weeklyMenuList = new ArrayList<DailyMenu>();

		weeklyMenuList.add(new DailyMenu(1, "Monday", "Spaghetti", "Chicken Rice", "Dumpling Noodle Soup",
				"Low-fat Milk", "Apple Juice", "Milo", "Watermelon", "Honeydew", "Apple"));
		weeklyMenuList.add(new DailyMenu(2, "Tuesday", "Burger with fries", "Fried Rice", "Fried Bee Hoon", "Ribena",
				"Chocolate Milk", "Wintermelon Tea", "Banana", "Grapes", "Green apple"));
		weeklyMenuList.add(new DailyMenu(3, "Wednesday", "Chicken Chop", "Wanton Mee", "Egg Fried Rice", "Green Tea",
				"Soya Milk", "Carrot Juice", "Melon", "Kiwi", "Mango"));
		weeklyMenuList.add(new DailyMenu(4, "Thursday", "Cheese baked rice", "Hor Fan", "Tofu Porridge", "Low-fat Milk",
				"Strawberry Milk", "Ribena", "Apple", "Watermelon", "Banana"));
		weeklyMenuList.add(new DailyMenu(5, "Friday", "Pizza", "Fried noodles", "Kway Teo", "Milo", "Orange Juice",
				"Green Tea", "Grapes", "Honeydew", "Mango"));

		ArrayList<Item> item_bank = new ArrayList<Item>(); // will contain 35 items (7 of each type)
		item_bank.add(new Item(1, "Western", "Bolognese Pasta", "Spaghetti, Minced meat, Tomato sauce ", 3.50)); // Western1 - dailymenu1
		item_bank.add(new Item(6, "Asian", "Nasi Lemak", "Fragrant rice, Sambal, Eggs", 3.50)); // Asian1 - dailymenu1
		item_bank.add(new Item(11, "Vegeterian", "Mixed Vegie Rice", "Rice, Mixed Vegetables", 3.50)); // Veggie1 - dailymenu1
		item_bank.add(new Item(16, "Cold beverage", "Strawberry tea", "Strawberry tea ", 3.50)); // Drink1 - dailymenu1
		item_bank.add(new Item(21, "Juice", "Watermelon juice", "Crushed watermelon with ice", 3.50)); // Drink2 - dailymenu1
		item_bank.add(new Item(26, "Hot beverage", "Hot Milo", "Hot Milo", 3.50)); // Drink3 - dailymenu1
		item_bank.add(new Item(31, "Fruit", "Watermelon", "-", 3.50)); // Fruit1 - dailymenu1
		item_bank.add(new Item(31, "Fruit", "Apple", "-", 3.50)); // Fruit2 - dailymenu1
		item_bank.add(new Item(31, "Fruit", "Orange", "-", 3.50)); // Fruit3 - dailymenu1
		
		item_bank.add(new Item(2, "Western", "Aglio Olio", "Sphaghetti, Mushroom, Chicken", 3.50)); //... - dailymenu2
		item_bank.add(new Item(7, "Asian", "Bento rice", "Rice, Chicken Set, Vegetables", 3.50)); 
		item_bank.add(new Item(12, "Vegeterian", "Chicken Rice", "Fragrant rice, Chicken, Sambal", 3.50)); 
		item_bank.add(new Item(17, "Cold beverage", "Peach tea", "Peach tea ", 3.50)); 
		item_bank.add(new Item(22, "Juice", "Orange juice", "Crushed orange with ice", 3.50)); 
		item_bank.add(new Item(27, "Hot beverage", "Hot milo", "Hot milo", 3.50)); 
		item_bank.add(new Item(32, "Fruit", "Pear", "-", 3.50)); 
		item_bank.add(new Item(32, "Fruit", "Apple", "-", 3.50)); 
		item_bank.add(new Item(32, "Fruit", "Papaya", "-", 3.50));
		
		item_bank.add(new Item(3, "Western", "Bolognese Pasta", "Spaghetti, Minced meat, Tomato sauce ", 3.50)); //... - dailymenu3
		item_bank.add(new Item(8, "Asian", "Nasi Lemak", "Fragrant rice, Sambal, Eggs", 3.50)); 
		item_bank.add(new Item(13, "Vegeterian", "Mixed Vegie Rice", "Rice, Mixed Vegetables", 3.50)); 
		item_bank.add(new Item(18, "Cold beverage", "Strawberry tea", "Strawberry tea ", 3.50)); 
		item_bank.add(new Item(23, "Juice", "Orange juice", "Crushed orange with ice", 3.50));
		item_bank.add(new Item(28, "Hot beverage", "Hot milo", "Hot milo", 3.50)); 
		item_bank.add(new Item(33, "Fruit", "Watermelon", "-", 3.50)); 
		item_bank.add(new Item(33, "Fruit", "Apple", "-", 3.50)); 
		item_bank.add(new Item(33, "Fruit", "Orange", "-", 3.50)); 
		
		
		item_bank.add(new Item(4, "Western", "Aglio Olio", "Sphaghetti, Mushroom, Chicken", 3.50)); //... - dailymenu4
		item_bank.add(new Item(9, "Asian", "Bento rice", "Rice, Chicken Set, Vegetables", 3.50)); 
		item_bank.add(new Item(14, "Vegeterian", "Mixed Vegie Rice", "Rice, Mixed Vegetables", 3.50)); 
		item_bank.add(new Item(19, "Cold beverage", "Peach tea", "Peach tea ", 3.50)); 
		item_bank.add(new Item(24, "Juice", "Orange juice", "Crushed orange with ice", 3.50)); 
		item_bank.add(new Item(29, "Hot beverage", "Hot milo", "Hot milo", 3.50)); 
		item_bank.add(new Item(34, "Fruit", "Papaya", "-", 3.50)); 
		item_bank.add(new Item(34, "Fruit", "Watermelon", "-", 3.50)); 
		item_bank.add(new Item(34, "Fruit", "Orange", "-", 3.50)); 
		
		item_bank.add(new Item(5, "Western", "Fish & Chips", "Fried fish, Lemon, Tartar Sauce", 3.50)); //... - dailymenu5
		item_bank.add(new Item(10, "Asian", "Ramen", "Noodles, Soup, Chicken", 3.50)); 
		item_bank.add(new Item(15, "Vegeterian", "Egg wrap", "Tortilla wrap, Egg, Lettuce", 3.50)); 
		item_bank.add(new Item(20, "Cold beverage", "Peach tea", "Peach tea ", 3.50)); 
		item_bank.add(new Item(25, "Juice", "Orange juice", "Crushed orange with ice", 3.50));  
		item_bank.add(new Item(30, "Hot beverage", "Hot milo", "Hot milo", 3.50)); 
		item_bank.add(new Item(35, "Fruit", "Papaya", "-", 3.50)); 
		item_bank.add(new Item(35, "Fruit", "Orange", "-", 3.50)); 
		item_bank.add(new Item(35, "Fruit", "Orange", "-", 3.50));

		int loginoption = 0;
		int adminoption = 0;
		int useroption = 0;

		while (loginoption != 3) {

			loginMenu();
			loginoption = Helper.readInt("Enter an option > ");

			if (loginoption == 1) {
				// User login
				String username = Helper.readString("Enter your studentID > ");
				String password = Helper.readString("Enter your password > ");
				// validateLogin();
				loginoption = 0;
				while (useroption != 4) {
					userMenu();
					useroption = Helper.readInt("Enter an option > ");
					if (useroption == 1) {
						C206_CaseStudy.viewWeeklyMenu(weeklyMenuList);
					} else if (useroption == 2) {
						lunchBoxMenu();
						int lunchbox = Helper.readInt("Enter an option > ");
						if (lunchbox == 1) {
							//
						} else if (lunchbox == 2) {
							//
						} else if (lunchbox == 3) {
							//
						} else {
							System.out.println("Invalid option");
						}
					} else if (useroption == 3) {
						//
					} else if (useroption == 4) {
						System.out.println("Goodbye!");
					} else {
						System.out.println("Invalid!");
					}
				}

			} else if (loginoption == 2) {
				// admin login
				String username = Helper.readString("Enter your adminID > ");
				String password = Helper.readString("Enter your password > ");
				// validateLogin();
				adminoption = 0;
				while (adminoption != 6) {
					adminMenu();
					adminoption = Helper.readInt("Enter an option > ");
					if (adminoption == 1) {
						accountMenu();
						int accmenu = Helper.readInt("Enter an option > ");
						if (accmenu == 1) {
							//
						} else if (accmenu == 2) {
							//
						} else if (accmenu == 3) {
							//
						} else {
							System.out.println("Invalid option");
						}
					} else if (adminoption == 2) {
						menuItemMenu();
						int menuitem = Helper.readInt("Enter an option > ");
						if (menuitem == 1) {
							viewAll_items(item_bank);
						} else if (menuitem == 2) {
							setHeader("ADD ITEM");
							// Add item
							Item new_item = inputDetails();
							addItem(item_bank, new_item);
							System.out.println("Item added!");
						} else if (menuitem == 3) {
							setHeader("DELETE ITEM");	
							int delete_id = Helper.readInt("Enter an Item ID to delete: ");
							C206_CaseStudy.deleteItem(item_bank, delete_id);
							System.out.println("Item deleted!");
						} else if (menuitem == 4) {
							// Update item
							setHeader("UPDATE");
							updateItem(item_bank, menuitem);
						} 
						
						else {
							System.out.println("Invalid option");
						}
					} else if (adminoption == 3) {
						weeklyMenu();
						int weeklymenu = Helper.readInt("Enter an option > ");
						if (weeklymenu == 1) {
							DailyMenu dm = inputMenu();
							createWeeklyMenu(weeklyMenuList, dm);
						} else if (weeklymenu == 2) {
							viewWeeklyMenu(weeklyMenuList);
						} else if (weeklymenu == 3) {
							deleteWeeklyMenu(weeklyMenuList);
						} else if (weeklymenu == 4) {
							updateWeeklyMenu(weeklyMenuList);
						} else if (weeklymenu == 5) {
							System.out.println("Goodbye!");
						}
						else {
							System.out.println("Invalid option");
						}
					} else if (adminoption == 4) {
						lunchBoxMenu();
						int lunchbox = Helper.readInt("Enter an option > ");
						if (lunchbox == 1) {
							//
						} else if (lunchbox == 2) {
							//
						} else if (lunchbox == 3) {
							//
						} else {
							System.out.println("Invalid option");
						}
					} else if (adminoption == 5) {
						billMenu();
						int bill = Helper.readInt("Enter an option > ");
						if (bill == 1) {
							//
						} else if (bill == 2) {
							//
						} else if (bill == 3) {
							//
						} else {
							System.out.println("Invalid option");
						}
					} else if (adminoption == 6) {
						System.out.println("Goodbye!");
					} else {
						System.out.println("Invalid!");
					}

				}
			} else if (loginoption == 3) {
				System.out.println("Logged out!");
			} else {
				System.out.println("Invalid option");
			}
		}

	}

	public static void loginMenu() {
		C206_CaseStudy.setHeader("LOGIN TO LUNCH BOX APP");
		System.out.println("1. User");
		System.out.println("2. Admin");
		System.out.println("3. Log out");
	}

	public static void adminMenu() {
		C206_CaseStudy.setHeader("LUNCH BOX APP");
		System.out.println("1. Manage Account");
		System.out.println("2. Manage Menu Bank");
		System.out.println("3. Manage Weekly Menu");
		System.out.println("4. Manage Lunch Box Order");
		System.out.println("5. Manage Bill");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

	public static void userMenu() {
		C206_CaseStudy.setHeader("LUNCH BOX APP");
		System.out.println("1. View Weekly Menu");
		System.out.println("2. Maintain Lunch Box Order");
		System.out.println("3. View Order Bill");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void accountMenu() {
		C206_CaseStudy.setHeader("MAINTAIN ACCOUNT");
		System.out.println("1. View account");
		System.out.println("2. Add account");
		System.out.println("3. Delete account");
		System.out.println("4. Update account");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}

	public static void menuItemMenu() {
		C206_CaseStudy.setHeader("MAINTAIN MENU ITEMS");
		System.out.println("1. View menu items");
		System.out.println("2. Add menu items");
		System.out.println("3. Delete menu items");
		System.out.println("4. Update menu items");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}

	public static void weeklyMenu() {
		C206_CaseStudy.setHeader("MAINTAIN WEEKLY MENU");
		System.out.println("1. Create Weekly Menu");
		System.out.println("2. View Weekly Menu");
		System.out.println("3. Delete Weekly Menu");
		System.out.println("4. Update Weekly Menu");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}

	public static void lunchBoxMenu() {
		C206_CaseStudy.setHeader("MAINTAIN LUNCH BOX ORDER");
		System.out.println("1. Add/Place Lunch Box Order");
		System.out.println("2. View Lunch Box Order");
		System.out.println("3. Delete/Cancel Lunch Box Order");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void billMenu() {
		C206_CaseStudy.setHeader("MAINTAIN ORDER BILL");
		System.out.println("1. Create Order Bill");
		System.out.println("2. View Order Bill");
		System.out.println("3. Delete Order Bill");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void subMenu() {
		System.out.println("1. Western");
		System.out.println("2. Asian");
		System.out.println("3. Vegetarian");
		System.out.println("4. Drink 1");
		System.out.println("5. Drink 2");
		System.out.println("6. Drink 3");
		System.out.println("7. Fruit 1");
		System.out.println("8. Fruit 2");
		System.out.println("9. Fruit 3");
		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		Helper.line(300, "-");
		System.out.println(header);
		Helper.line(300, "-");
	}

	//================================= Option 1 View items =================================
		public static String retrieveAll_items(ArrayList<Item> item_bank) {
			String output = "";

			for (int i = 0; i < item_bank.size(); i++) {

				output += String.format("%-10d %-10s %-10s %-100s %-20.2f\n", item_bank.get(i).get_itemID(),
						item_bank.get(i).get_Category(),
						item_bank.get(i).get_Name(), 
						item_bank.get(i).get_Description(),
						item_bank.get(i).get_Price());
			}
			return output;
		}
		public static void viewAll_items(ArrayList<Item> item_bank) {
			C206_CaseStudy.setHeader("VIEW ITEMS");
			String output = String.format("%-10s %-10s %-10s %-100s %-20s\n", "ITEM ID", "CATEGORY",
					"NAME", "DESCRIPTION","PRICE");
			 output += retrieveAll_items(item_bank);	
			System.out.println(output);
		}

		//================================= Option 2 Add an item =================================
		public static Item inputDetails() {
			 int itemID = Helper.readInt("Enter item ID: ");
			 String category = Helper.readString("Enter category: ");
			 String name = Helper.readString("Enter name: ");
			 String description = Helper.readString("Enter description: ");
			 double price = Helper.readDouble("Enter price: ");
			
			 Item new_item = new Item(itemID, category, name, description, price);
			return new_item;
		}
		
		public static void addItem(ArrayList<Item> item_bank, Item new_item) {
			
			item_bank.add(new_item);
			
		}

		//================================= Option 3 Delete an item =================================
		public static void deleteItem(ArrayList<Item> item_bank, int itemID) {
			boolean isDelete = false;
			
			for (int i = 0; i < item_bank.size(); i++) {
				if (itemID==(item_bank.get(i).get_itemID())){
					item_bank.remove(i);
					isDelete = true;
				}
			}
		}

		//================================= Option 4 Update an item =================================
		public static void updateItem(ArrayList<Item> item_bank, int itemID) {
			boolean isUpdate = false;
			int new_itemID = Helper.readInt("Enter item ID: ");
			 String new_category = Helper.readString("Enter category: ");
			 String new_name = Helper.readString("Enter name: ");
			 String new_description = Helper.readString("Enter description: ");
			 double new_price = Helper.readDouble("Enter price: ");
			
			for (int i = 0; i < item_bank.size(); i++) {
				if (itemID==(item_bank.get(i).get_itemID())){
					item_bank.get(i).set_itemID(new_itemID);
					item_bank.get(i).set_Category(new_category);
					item_bank.get(i).set_Name(new_name);
					item_bank.get(i).set_Description(new_description);
					item_bank.get(i).set_Price();
					isUpdate = true;
				}
			}
		}

	// ================================= Option 1 Create weekly menu
	// =================================

	public static DailyMenu inputMenu() {
		int id = Helper.readInt("Enter ID > ");
		String menu = Helper.readString("Enter Date > ");
		String western = Helper.readString("Enter Western > ");
		String asian = Helper.readString("Enter Asian > ");
		String vege = Helper.readString("Enter Vegetarian > ");
		String d1 = Helper.readString("Enter 1st Drink > ");
		String d2 = Helper.readString("Enter 2nd Drink > ");
		String d3 = Helper.readString("Enter 3rd Drink > ");
		String f1 = Helper.readString("Enter 1st Fruit > ");
		String f2 = Helper.readString("Enter 2nd Fruit > ");
		String f3 = Helper.readString("Enter 3rd Fruit > ");

		DailyMenu dm = new DailyMenu(id, menu, western, asian, vege, d1, d2, d3, f1, f2, f3);
		return dm;

	}

	public static void createWeeklyMenu(ArrayList<DailyMenu> weeklyMenuList, DailyMenu dm) {
		weeklyMenuList.add(dm);
		System.out.println("Menu added!");

	}

	// ================================= Option 2 View weekly menu
	// =================================

	public static String retrieveWeeklyMenu(ArrayList<DailyMenu> weeklyMenuList) {
		String output = "";
		// write your code here

		for (int i = 0; i < weeklyMenuList.size(); i++) {

			output += String.format("%-5d %-10s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s\n",
					weeklyMenuList.get(i).getMenuID(), weeklyMenuList.get(i).getDate(),
					weeklyMenuList.get(i).getWestern(), weeklyMenuList.get(i).getAsian(),
					weeklyMenuList.get(i).getVeggie(), weeklyMenuList.get(i).getDrink1(),
					weeklyMenuList.get(i).getDrink2(), weeklyMenuList.get(i).getDrink3(),
					weeklyMenuList.get(i).getFruit1(), weeklyMenuList.get(i).getFruit2(),
					weeklyMenuList.get(i).getFruit3());

		}
		return output;
	}

	public static void viewWeeklyMenu(ArrayList<DailyMenu> weeklyMenuList) {
		if (menuEmpty(weeklyMenuList)) {
			System.out.println("Menu not found!");
		} else {
			C206_CaseStudy.setHeader("WEEKLY MENU");
			String output = String.format("%-5s %-10s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s\n", "ID",
					"DATE", "WESTERN", "ASIAN", "VEGETARIAN", "DRINK 1", "DRINK 2", "DRINK 3", "FRUIT 1", "FRUIT 2",
					"FRUIT 3");
			output += retrieveWeeklyMenu(weeklyMenuList);
			System.out.println(output);
		}
	}

	public static boolean menuEmpty(ArrayList<DailyMenu> weeklyMenuList) {
		if (weeklyMenuList.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	// ================================= Option 3 Delete weekly menu
	// =================================

	public static void deleteWeeklyMenu(ArrayList<DailyMenu> weeklyMenuList) {
		System.out.println("DELETE WEEKLY MENU");
		viewWeeklyMenu(weeklyMenuList);
		char confirmation = Helper.readChar("Are you sure to delete the Weekly Menu? (y/n) > ");
		if (confirmation == 'y' || confirmation == 'Y') {
			weeklyMenuList.clear();
			System.out.println("Weekly Menu deleted!");
		} else if (confirmation == 'n' || confirmation == 'N') {
			System.out.println("Weekly Menu not deleted!");
		} else {
			System.out.println("Invalid input!");
		}
	}

	// ================================= Option 4 Delete weekly menu
	// =================================

	public static void updateWeeklyMenu(ArrayList<DailyMenu> weeklyMenuList) {
		System.out.println("UPDATE WEEKLY MENU");
		viewWeeklyMenu(weeklyMenuList);
		int id = Helper.readInt("Enter the menu ID you wish to update > ");
		for (DailyMenu dm : weeklyMenuList) {
			if (dm.getMenuID() == id) {
				int index = weeklyMenuList.indexOf(dm);
				subMenu();
				int option = Helper.readInt("Enter option to update > ");
				if (option == 1) {
					String newWestern = Helper.readString("Enter the new Western > ");
					weeklyMenuList.get(index).setWestern(newWestern);
					System.out.println("Western has been updated!");
				} else if (option == 2) {
					String newAsian = Helper.readString("Enter the new Asian > ");
					weeklyMenuList.get(index).setAsian(newAsian);
					System.out.println("Asian has been updated!");
				} else if (option == 3) {
					String newVege = Helper.readString("Enter the new Vegetarian > ");
					weeklyMenuList.get(index).setVeggie(newVege);
					System.out.println("Vegetarian has been updated!");
				} else if (option == 4) {
					String newD1 = Helper.readString("Enter the new Drink 1 > ");
					weeklyMenuList.get(index).setDrink1(newD1);
					System.out.println("Drink 1 has been updated!");
				} else if (option == 5) {
					String newD2 = Helper.readString("Enter the new Drink 2 > ");
					weeklyMenuList.get(index).setDrink2(newD2);
					System.out.println("Drink 2 has been updated!");
				} else if (option == 6) {
					String newD3 = Helper.readString("Enter the new Drink 3 > ");
					weeklyMenuList.get(index).setDrink3(newD3);
					System.out.println("Drink 3 has been updated!");
				} else if (option == 7) {
					String newF1 = Helper.readString("Enter the new Fruit 1 > ");
					weeklyMenuList.get(index).setFruit1(newF1);
					System.out.println("Fruit 1 has been updated!");
				} else if (option == 8) {
					String newF2 = Helper.readString("Enter the new Fruit 2 > ");
					weeklyMenuList.get(index).setFruit2(newF2);
					System.out.println("Fruit 2 has been updated!");
				} else if (option == 9) {
					String newF3 = Helper.readString("Enter the new Fruit 3 > ");
					weeklyMenuList.get(index).setFruit3(newF3);
					System.out.println("Fruit 3 has been updated!");
				} else {
					System.out.println("Invalid option!");
				}
			}
		}
	}

	// ================================= Option 1 View Order Bill
	// =================================
	public static String retreiveAllOrderBills(ArrayList<Bill> billList) {
		// TODO Auto-generated method stub
		String output = "";

		for (int i = 0; i < billList.size(); i++) {
			output += String.format("%-15d %-15s %-30s %-10s %-15.2f\n", billList.get(i).getBill_id(),
					billList.get(i).getMeal(), billList.get(i).getDrink(), billList.get(i).getFruit(),
					billList.get(i).getAmount());
		}
		return output;
	}

	public static void ViewAllOrderBills(ArrayList<Bill> billList) {

		String output = String.format("%-15d %-15s %-30s %-10s %-15.2f\n", "BILL ID", "MEAL", "DRINK", "FRUIT",
				"AMOUNT");
		output += retreiveAllOrderBills(billList);
		System.out.println(output);
	}

	public static Bill inputOrderBill() { // change
		int bill_id = Helper.readInt("Enter bill id > ");
		String meal = Helper.readString("Enter meal > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");
		double amount = Helper.readDouble("Enter amount > ");

		Bill b = new Bill(bill_id, meal, drink, fruit, amount);
		return b;
	}

//================================= Option 2 Add Order Bill =================================
	public static void addOrderBill(ArrayList<Bill> billList, Bill b) {
		// TODO Auto-generated method stub
		// inputOrderBill();

		billList.add(b);

	}

	// ================================= Option 3 Delete Order Bill
	// =================================
	public static void deleteOrderBills(ArrayList<Bill> billList, int bill_id) {
		for (int i = 0; i < billList.size(); i++) {
			if (bill_id == (billList.get(i)).getBill_id()) {
				billList.remove(i);
			}

		}
	}
}
