import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		/*
		JoggingSpot_Main_Enhancement jogspot = new JoggingSpot_Main_Enhancement(); 
		jogspot.start();
	}
		
		
		
		public void start() {
			try { 
				int option = -1; 
				while (option != 4) {
					menu();
					option = Helper.readInt("Enter choice > ");
					if (option == 1) {
						addUserAccount();
					} 	
					else if (option == 2) {
						addMenuItems();
					} 
					else if (option == 3) {
						placeLunchBoxOrder();
					} 
					else if (option == 4) {
						orderbill();
					}
					else {
						System.out.println("Thank you for using Singapore Jogging Spots App!");
					}
				} 
			} catch (SQLException se) {
				System.out.println("SQL Error: " + se.getMessage());
			}
	}
	
	
	
	private void menu() {
		Helper.line(80, "=");
		System.out.println("School Lunch Box Online Ordering App");
		Helper.line(80, "=");
		if () {
			System.out.println("    1. View All Jogging Spots");
			System.out.println("    2. View Jogging Spots by Category");
			System.out.println("    3. Add New Jogging Spot");
			System.out.println("    4. Quit\n");
		} 
	}
*/
	
		// I did for here, Akim :)
	//	ArrayList<Item> western_bank = new ArrayList<Item>();
	//	ArrayList<Item> asian_bank = new ArrayList<Item>();
	//	ArrayList<Item> veggie_bank = new ArrayList<Item>();
	//	ArrayList<Item> drink1_bank = new ArrayList<Item>();
	//	ArrayList<Item> drink2_bank = new ArrayList<Item>();
	//	ArrayList<Item> fruit1_bank = new ArrayList<Item>();
	//	ArrayList<Item> fruit2_bank = new ArrayList<Item>();
		// Alternatively
		ArrayList<Item> item_bank = new ArrayList<Item>(); // will contain 35 items (7 of each type)
		
		item_bank.add(new Item(1, "", "", "", 3.50)); // Western1 - dailymenu1
		item_bank.add(new Item(6, "", "", "", 3.50)); // Asian1 - dailymenu1
		item_bank.add(new Item(11, "", "", "", 3.50)); // Veggie1 - dailymenu1
		item_bank.add(new Item(16, "", "", "", 3.50)); // Drink1 - dailymenu1
		item_bank.add(new Item(21, "", "", "", 3.50)); // Drink2 - dailymenu1
		item_bank.add(new Item(26, "", "", "", 3.50)); // Drink3 - dailymenu1
		item_bank.add(new Item(31, "", "", "", 3.50)); // Fruit1 - dailymenu1
		item_bank.add(new Item(31, "", "", "", 3.50)); // Fruit2 - dailymenu1
		
		item_bank.add(new Item(2, "", "", "", 3.50)); //... - dailymenu2
		item_bank.add(new Item(7, "", "", "", 3.50)); 
		item_bank.add(new Item(12, "", "", "", 3.50)); 
		item_bank.add(new Item(17, "", "", "", 3.50)); 
		item_bank.add(new Item(22, "", "", "", 3.50)); 
		item_bank.add(new Item(27, "", "", "", 3.50)); 
		item_bank.add(new Item(32, "", "", "", 3.50)); 
		item_bank.add(new Item(32, "", "", "", 3.50)); 
		
		item_bank.add(new Item(3, "", "", "", 3.50)); //... - dailymenu3
		item_bank.add(new Item(8, "", "", "", 3.50)); 
		item_bank.add(new Item(13, "", "", "", 3.50)); 
		item_bank.add(new Item(18, "", "", "", 3.50)); 
		item_bank.add(new Item(23, "", "", "", 3.50));
		item_bank.add(new Item(28, "", "", "", 3.50)); 
		item_bank.add(new Item(33, "", "", "", 3.50)); 
		item_bank.add(new Item(33, "", "", "", 3.50)); 
		
		item_bank.add(new Item(4, "", "", "", 3.50)); //... - dailymenu4
		item_bank.add(new Item(9, "", "", "", 3.50)); 
		item_bank.add(new Item(14, "", "", "", 3.50)); 
		item_bank.add(new Item(19, "", "", "", 3.50)); 
		item_bank.add(new Item(24, "", "", "", 3.50)); 
		item_bank.add(new Item(29, "", "", "", 3.50)); 
		item_bank.add(new Item(34, "", "", "", 3.50)); 
		item_bank.add(new Item(34, "", "", "", 3.50)); 
		
		item_bank.add(new Item(5, "", "", "", 3.50)); //... - dailymenu5
		item_bank.add(new Item(10, "", "", "", 3.50)); 
		item_bank.add(new Item(15, "", "", "", 3.50)); 
		item_bank.add(new Item(20, "", "", "", 3.50)); 
		item_bank.add(new Item(25, "", "", "", 3.50));  
		item_bank.add(new Item(30, "", "", "", 3.50)); 
		item_bank.add(new Item(35, "", "", "", 3.50)); 
		item_bank.add(new Item(35, "", "", "", 3.50)); 
	
		int option = 0;
	
		while (option != 5) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.viewAll_items(item_bank);

			} else if (option == 2) {
				C206_CaseStudy.setHeader("ADD ITEM");			

				// Add item
				Item new_item = inputDetails();
				C206_CaseStudy.addItem(item_bank, new_item);
				System.out.println("Item added!");

			} else if (option == 3) {
				// Delete item
				C206_CaseStudy.setHeader("DELETE ITEM");	
				System.out.println("Enter an Item ID to delete: ");
				C206_CaseStudy.deleteItem(item_bank, option);
				System.out.println("Item deleted!");
				
			} else if (option == 4) {
				// Update item
				C206_CaseStudy.setHeader("UPDATE");				
				C206_CaseStudy.updateItem(item_bank, option);
			

			} else if (option == 5) {
				System.out.println("Bye admin!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}	
	public static void menu() {
		C206_CaseStudy.setHeader("ITEM MENU");
		System.out.println("1. View items");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Update item"); // Still working on this (Sprint 2)
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
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
				item_bank.get(i).setCategory(new_category);
				item_bank.get(i).set_Name(new_name);
				item_bank.get(i).set_Description(new_description);
				item_bank.get(i).set_Price();
				isUpdate = true;
			}
		}
	}
}
