import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	// prepare test data for the 7 items of the first daily menu
	private Bill bills1;
	private Bill bills2;
	private Bill bills3;
	private ArrayList<Bill> billList = new ArrayList<Bill>();
	
	private Item western1;
	private Item asian1;
	private Item veggie1;
	private Item drink1;
	private Item drink2;
	private Item drink3;
	private Item fruit1;
	private Item fruit2;
	private Item fruit3;
	
	private ArrayList<Item> item_bank;
	
	private DailyMenu dm1;
	private DailyMenu dm2;
	private DailyMenu dm3;
	private DailyMenu dm4;
	private DailyMenu dm5;
	private DailyMenu dm5Changed;
	
	private ArrayList<DailyMenu> weeklyMenuList;
	
	private Account p1;
	private Account p2;
	private Account p3;
	
	private Student s1;
	private Student s2;
	private Student s3;
	
	
	private ArrayList<Account> parentList;
	private ArrayList<Student> studentList;
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		bills1 = new Bill(11, "Western cuisine", "Watermelon", "Orange juice", 4.00);
		bills2 = new Bill(22, "Japanese cuisine", "Grapes", "Strawberry Tea", 3.60);
		bills3 = new Bill(9, "Vegeterian food", "Orange", "Milo", 2.00);
		
		billList = new ArrayList<Bill>();
		
		western1 = new Item(1, "Western", "Bolognese Pasta", "Spaghetti, Minced meat, Tomato sauce ", 3.50);
		asian1 = new Item(6, "Asian", "Nasi Lemak", "Fragrant rice, Sambal, Eggs", 3.50);
		veggie1 = new Item(11, "Vegeterian", "Mixed Vegie Rice", "Rice, Mixed Vegetables", 3.50);
		drink1 = new Item(16, "Cold beverage", "Strawberry tea", "Strawberry tea ", 3.50);
		drink2 = new Item(21, "Juice", "Watermelon juice", "Crushed watermelon with ice", 3.50);
		drink3 = new Item(26, "Hot beverage", "Hot Milo", "Hot Milo", 3.50);
		fruit1 = new Item(31, "Fruit", "Watermelon", "-", 3.50);
		fruit2 = new Item(31, "Fruit", "Apple", "-", 3.50);
		fruit3 = new Item(32, "Fruit", "Papaya", "-", 3.50);
		
		item_bank = new ArrayList<Item>(); // will contain 35 items (7 of each type)
		
		
		dm1 = new DailyMenu(1, "Monday", "Spaghetti", "Chicken Rice", "Dumpling Noodle Soup",
				"Low-fat Milk", "Apple Juice", "Milo", "Watermelon", "Honeydew", "Apple");
		dm2 = new DailyMenu(2, "Tuesday", "Burger with fries", "Fried Rice", "Fried Bee Hoon", "Ribena",
				"Chocolate Milk", "Wintermelon Tea", "Banana", "Grapes", "Green apple");
		dm3 = new DailyMenu(3, "Wednesday", "Chicken Chop", "Wanton Mee", "Egg Fried Rice", "Green Tea",
				"Soya Milk", "Carrot Juice", "Melon", "Kiwi", "Mango");
		dm4 = new DailyMenu(4, "Thursday", "Cheese baked rice", "Hor Fan", "Tofu Porridge", "Low-fat Milk",
				"Strawberry Milk", "Ribena", "Apple", "Watermelon", "Banana");
		dm5 = new DailyMenu(5, "Friday", "Pizza", "Fried noodles", "Kway Teo", "Milo", "Orange Juice",
				"Green Tea", "Grapes", "Honeydew", "Mango"); 
		dm5Changed = new DailyMenu(5, "Friday", "Fish and Chips", "Fried noodles", "Kway Teo", "Milo", "Orange Juice",
				"Green Tea", "Grapes", "Honeydew", "Mango"); 
		
		weeklyMenuList= new ArrayList<DailyMenu>();
		
		p1= new Account("John lee", 200301 , "P303043", "hayshyn3@gmail.com", "strawberryWongkar");
		p2= new Account("Kelly yeo", 200140, "P34310", "Kellyyeo@gmail.com", "CJBond321");
		p3 = new Account("Isacc Louis Kumar", 202190, "P40001","Annathe@gmail.com", "NelsonistheBest");
		
		s1= new Student("John JR", 200301,"ClassADBEST");
		s2=new Student("Sherlynn Yeo", 200140, "IFT2022AD");
		s3= new Student("Vijay Louis", 202190, "Suntv321");
		
		parentList= new ArrayList<Account>();
		studentList= new ArrayList<Student>();
		
		
	}
	
	@Test // view items in the item bank 
	public void testretrieveAllItem() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid item_bank arraylist to add Item object to", item_bank);
		
		//test if the list of item_bank retrieved from the C206_CaseStudy is empty
		String all_Item= C206_CaseStudy.retrieveAll_items(item_bank);
		String testOutput = "";
		assertEquals("Check that item_bank is empty", testOutput, all_Item);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addItem(item_bank, western1);
		C206_CaseStudy.addItem(item_bank, asian1);
		assertEquals("Test if the item_bank arraylist size is 2", 2, item_bank.size());
		
		//test if the expected output string same as the list of items retrieved from the C206_CaseStudy
		all_Item= C206_CaseStudy.retrieveAll_items(item_bank);

		testOutput = String.format("%-10d %-10s %-10s %-100s %-20.2f\n", 1, "Western", "Bolognese Pasta", "Spaghetti, Minced meat, Tomato sauce ", 3.50);
		testOutput += String.format("%-10d %-10s %-10s %-100s %-20.2f\n", 6, "Asian", "Nasi Lemak", "Fragrant rice, Sambal, Eggs", 3.50);
	
		assertEquals("Check that all the menu_items retrieved from the item bank is the same as the output made to test", testOutput, all_Item);
	}
	
	@Test // add items in the item bank
	public void testAddItem() {
		// item_bank is not null, so that can add a new item
		assertNotNull("Test if there is valid item_bank arrayList to add item to", item_bank);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addItem(item_bank, western1);
		assertEquals("Test if that item_bank arraylist size is 1?", 1, item_bank.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that western1, item, is added same as 1st item of the list?", western1, item_bank.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addItem(item_bank, asian1);
		C206_CaseStudy.addItem(item_bank, veggie1);
		assertEquals("Test that Camcorder arraylist size is 3?", 3, item_bank.size());
		assertSame("Test that Camcorder is added same as 3rd item of the list?", veggie1, item_bank.get(2));
	}
	
	@Test // delete items from the item bank 
	public void testDeleteItem() {
		// One time added; one removed
		assertNotNull("Test if there is valid item_bank arrayList to add item to so that it can be deleted from the arrayList", item_bank);
		C206_CaseStudy.addItem(item_bank, western1);
		assertEquals("Test if that item_bank arraylist size is 1?", 1, item_bank.size());
		C206_CaseStudy.deleteItem(item_bank, western1.get_itemID());
		assertEquals(0, item_bank.size());
		
		boolean exists = false;
		for (Item i: item_bank) {
			if (i.equals(i.get_itemID())) {
				exists = true;
			}
		}
		
		assertFalse(exists);
	}
	
	@Test// Sprint 2 - Update items that are already in the item bank
	public void testUpdateItem() {
		
	}
	
	@Test
	public void testCreateMenu() {
	// Item list is not null, so that can add a new item - boundary
			assertNotNull("Check if there is valid Menu arraylist to add to", weeklyMenuList);
			//Given an empty list, after adding 1 item, the size of the list is 1 - normal
			//The item just added is as same as the first item of the list
			C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm1);
			assertEquals("Check that Menu arraylist size is 1", 1, weeklyMenuList.size());
			assertSame("Check that newly Menu item added is the same as second item in the list", dm1, weeklyMenuList.get(0));
			
			//Add another item. test The size of the list is 2? -normal
			//The item just added is as same as the second item of the list
			C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm2);
			assertEquals("Check that Menu arraylist size is 2", 2, weeklyMenuList.size());
			assertSame("Check that newly Menu item added is the same as second item in the list", dm2, weeklyMenuList.get(1));
		}

	@Test
	public void testViewWeeklyMenu() {
		// Test if Menu list is not null but empty -boundary
		assertNotNull("Test if there is valid Menu arraylist to retrieve item", weeklyMenuList);
		
		//test if the list of Menu retrieved from the C206_CaseStudy is empty - boundary
		String weeklyMenu= C206_CaseStudy.retrieveWeeklyMenu(weeklyMenuList);
		String testOutput = "";
		assertEquals("Check that viewWeeklyMenu", testOutput, weeklyMenu);
	
		//Given an empty list, after adding 5 items, test if the size of the list is 5 - normal
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm1);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm2);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm3);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm4);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm5);
		assertEquals("Test that WeeklyMenu arraylist size is 5", 5, weeklyMenuList.size());
	
		
		//test if the expected output string same as the list of Menu retrieved from the C206_CaseStudy	
		weeklyMenu= C206_CaseStudy.retrieveWeeklyMenu(weeklyMenuList);
		;
		testOutput = String.format("%-5d %-10s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s\n", 1, "Monday", "Spaghetti", "Chicken Rice", "Dumpling Noodle Soup",
				"Low-fat Milk", "Apple Juice", "Milo", "Watermelon", "Honeydew", "Apple");
		testOutput += String.format("%-5d %-10s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s\n",2, "Tuesday", "Burger with fries", "Fried Rice", "Fried Bee Hoon", "Ribena",
				"Chocolate Milk", "Wintermelon Tea", "Banana", "Grapes", "Green apple");
		testOutput += String.format("%-5d %-10s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s\n",3, "Wednesday", "Chicken Chop", "Wanton Mee", "Egg Fried Rice", "Green Tea",
				"Soya Milk", "Carrot Juice", "Melon", "Kiwi", "Mango");
		testOutput += String.format("%-5d %-10s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s\n",4, "Thursday", "Cheese baked rice", "Hor Fan", "Tofu Porridge", "Low-fat Milk",
				"Strawberry Milk", "Ribena", "Apple", "Watermelon", "Banana");
		testOutput += String.format("%-5d %-10s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s\n",5, "Friday", "Pizza", "Fried noodles", "Kway Teo", "Milo", "Orange Juice",
				"Green Tea", "Grapes", "Honeydew", "Mango"); 
				
		assertEquals("Test that ViewWeeklyMenu", testOutput, weeklyMenu);
		

}

	
	@Test
	public void testDeleteWeeklyMenu() {
		
		// Test if Menu list is not null but empty -boundary
		assertNotNull("Test if there is valid Menu arraylist to retrieve item", weeklyMenuList);
		
		//Add 5 items. Test the size of the list is 5? -normal
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm1);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm2);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm3);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm4);
		C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm5);
		assertEquals("Test that WeeklyMenu arraylist size is 5", 5, weeklyMenuList.size());
	
		//Clear the list. Test the list is empty -normal
		C206_CaseStudy.deleteWeeklyMenu(weeklyMenuList);
		assertTrue("Check that Menu arraylist size is empty", weeklyMenuList.isEmpty());	
	}
	
	@Test
	public void testUpdateWeeklyMenu() {
		// Test if Menu list is not null but empty -boundary
				assertNotNull("Test if there is valid Menu arraylist to retrieve item", weeklyMenuList);
				
				C206_CaseStudy.createWeeklyMenu(weeklyMenuList, dm5);
				assertEquals("Test that WeeklyMenu arraylist size is 1", 1, weeklyMenuList.size());
				
				C206_CaseStudy.updateWeeklyMenu(weeklyMenuList);
				assertNotSame("Check that newly updated Menu item is the not same as second item in the list", dm5Changed, dm5);	

	}
	
	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	@Test
	 public void testAddOrderBill() {
		  assertNotNull("Test if there is an existing billList arrayList to add to", billList);
		  C206_CaseStudy.addOrderBill(billList, bills1);
		  assertEquals("Test if that billList arraylist size is 1?", 1, billList.size());
		  assertSame("Test that Bill is added same as 1st item of the list?", bills1, billList.get(0));
		  C206_CaseStudy.addOrderBill(billList, bills2);
		  C206_CaseStudy.addOrderBill(billList, bills3);
		  assertEquals("Test that billList arraylist size is 3?", 3, billList.size());
		  assertSame("Test that orderList is added same as 3rd item of the list?", bills3, billList.get(2));

	}
	 @Test
	 public void testViewOrderBill() {
	  assertNotNull("Test if there is valid orderList arraylist to add to", billList);
	  String allOrderBill= C206_CaseStudy.retreiveAllOrderBills(billList);
	  String testOutput = "";
	  assertEquals("Check that ViewOrderBills", testOutput, allOrderBill);
	  C206_CaseStudy.addOrderBill(billList, bills1);
	  C206_CaseStudy.addOrderBill(billList, bills2);
	  C206_CaseStudy.addOrderBill(billList, bills3);
	  assertEquals("Test if that billList arraylist size is 3?", 3, billList.size());
	  allOrderBill= C206_CaseStudy.retreiveAllOrderBills(billList);
	  testOutput += String.format("%-15d %-15s %-30s %-10s %-15.2f\n", 11, "Western cuisine", "Watermelon", "Orange juice", 4.00);
	  testOutput += String.format("%-15d %-15s %-30s %-10s %-15.2f\n", 22, "Japanese cuisine", "Grapes", "Strawberry Tea", 3.60);
	  testOutput += String.format("%-15d %-15s %-30s %-10s %-15.2f\n", 9, "Vegeterian food", "Orange", "Milo", 2.00);
	  assertEquals("Check that ViewAllOrderBills", testOutput, allOrderBill);
	  
	  
	 }
	 @Test
	 public void testDeleteOrderBill() {
	  C206_CaseStudy.addOrderBill(billList, bills1);
	  C206_CaseStudy.addOrderBill(billList, bills2);
	  C206_CaseStudy.addOrderBill(billList, bills3);

	  assertNotNull("Test if there is an existing billList arrayList to delete ", billList);
	  C206_CaseStudy.deleteOrderBills(billList, bills1.getBill_id());
	  assertEquals("Test if that billList arraylist size is 2?", 2, billList.size());
	  C206_CaseStudy.deleteOrderBills(billList, bills2.getBill_id());
	  assertEquals("Test that billList arraylist size is 1?", 1, billList.size());
	  C206_CaseStudy.deleteOrderBills(billList, bills3.getBill_id());
	  assertEquals("Test that billList arraylist size is 0?", 0, billList.size());
	  
	 }
	
	@After
	public void tearDown() throws Exception {
		western1 = null;
		asian1 = null;
		veggie1 = null;
		drink1 = null;
		drink2 = null;
		drink3 = null;
		fruit1 = null;
		fruit2 = null;
		fruit3 = null;
		item_bank = null;
		
		dm1 = null;
		dm2 = null;
		dm3 = null;
		dm4 = null;
		dm5 = null;
		dm5Changed = null;
		
		weeklyMenuList = null;
	}
	
	
	@Test
	public void testAddParents(){
		// Item list is not null, so that can add a new item
				assertNotNull("Test if there is valid parent arraylist to add to", parentList);
				
				//Given an empty list, after adding 1 item, the size of the list is 1
				C206_CaseStudy.addAccount(parentList, p1);		
				assertEquals("Test if that Parent arraylist size is 1?", 1, parentList.size());
				
				//The item just added is as same as the first item of the list
				assertSame("Test that Parent is added same as 1st parent of the list?", p1, parentList.get(0));
				
				//Add another item. test The size of the list is 3?
				C206_CaseStudy.addAccount(parentList, p2);
				C206_CaseStudy.addAccount(parentList, p3);
				assertEquals("Test that Parent arraylist size is 3?", 3, parentList.size());
				assertSame("Test that Parent is added same as 3rd item of the list?", p3, parentList.get(2));
	}
	
	@Test
	public void testAddStudents() {
		
		// Item list is not null, so that can add a new item
				assertNotNull("Test if there is valid student arraylist to add to", studentList);
				
				//Given an empty list, after adding 1 item, the size of the list is 1
				C206_CaseStudy.addStudent(studentList, s1);		
				assertEquals("Test if that student arraylist size is 1?", 1, studentList.size());
				
				//The item just added is as same as the first item of the list
				assertSame("Test that student is added same as 1st item of the list?", s1, studentList.get(0));
				
				//Add another item. test The size of the list is 3?
				C206_CaseStudy.addStudent(studentList, s2);
				C206_CaseStudy.addStudent(studentList, s3);
				assertEquals("Test that student arraylist size is 3?", 3, studentList.size());
				assertSame("Test that student is added same as 3rd item of the list?", s3, studentList.get(2));
	}
	
	
	@Test
	public void testretrieveAllParent() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid parent arraylist to add to", parentList);
		
		//test if the list of parents retrieved from the SourceCentre is empty
		String allParent= C206_CaseStudy.retrieveAllParent(parentList);
		String testOutput = "";
		assertEquals("Check that ViewAllParentlist", testOutput, allParent);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addAccount(parentList, p1);
		C206_CaseStudy.addAccount(parentList, p2);
		assertEquals("Test if that parent arraylist size is 2?", 2, parentList.size());
		
		//test if the expected output string same as the list of parents retrieved from the SourceCentre
		allParent= C206_CaseStudy.retrieveAllParent(parentList);
		
		testOutput = String.format("%-10s %-15d %-15s %-20s %-5s\n","John lee", 200301,"P303043", "hayshyn3@gmail.com", "strawberryWongkar");
		testOutput += String.format("%-10s %-15d %-15s %-20s %-5s\n",  "Kelly yeo", 200140, "P34310", "Kellyyeo@gmail.com", "CJBond321");
	
		assertEquals("Check that ViewAllParents", testOutput, allParent);
		
	}
	
	@Test
	public void testretrieveAllStudents() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid student arraylist to add to", studentList);
		
		//test if the list of parents retrieved from the SourceCentre is empty
		String allStudents= C206_CaseStudy.retrieveAllStudents(studentList);
		String testOutput = "";
		assertEquals("Check that ViewAllStudentlist", testOutput, allStudents);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addStudent(studentList, s1);
		C206_CaseStudy.addStudent(studentList, s2);
		assertEquals("Test if that student arraylist size is 2?", 2, studentList.size());
		
		//test if the expected output string same as the list of parents retrieved
		allStudents= C206_CaseStudy.retrieveAllStudents(studentList);
		
		testOutput += String.format("%-20s %-15s %-15s\n","John JR", 200301,"ClassADBEST");
		testOutput += String.format("%-20s %-15s %-15s\n", "Sherlynn Yeo", 200140, "IFT2022AD" );
	
		assertEquals("Check that ViewAllStudents", testOutput, allStudents);
		
	}
	
	
	
	 @Test 
	 public void testDeleteParent() {
		  C206_CaseStudy.addAccount(parentList, p1);
		  C206_CaseStudy.deleteAccount(parentList,p1.getParentID());
		  assertEquals(0,parentList.size());
		  
		  boolean exists=false;
		  for(Account p: parentList) {
			  if(p.equals(p.getParentID()));  {
				  exists=true;
			  }
		  
		  }
		  assertFalse(exists);
		 


		
		  }
			
	
	  @Test 
	  public void testDeleteStudents() {
		  C206_CaseStudy.addStudent(studentList, s1);
		  C206_CaseStudy.deleteStudent(studentList, s1.getStudentID());
		  assertEquals(0,studentList.size());
	  
		  boolean exists=false;
		  for(Student s: studentList) {
			  if(s.equals(s.getStudentID()));  {
				  exists=true;
		  }
	  
	  }
	  assertFalse(exists);
	 


	
	  }
	
	
	



}
