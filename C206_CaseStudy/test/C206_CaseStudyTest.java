import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	// prepare test data for the 7 items of the first daily menu
	private Item western1;
	private Item asian1;
	private Item veggie1;
	private Item drink1;
	private Item drink2;
	private Item fruit1;
	private Item fruit2;
	
	private ArrayList<Item> item_bank;
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		western1 = new Item(1, "", "", "", 3.50);
		asian1 = new Item(1, "", "", "", 3.50);
		veggie1 = new Item(1, "", "", "", 3.50);
		drink1 = new Item(1, "", "", "", 3.50);
		drink2 = new Item(1, "", "", "", 3.50);
		fruit1 = new Item(1, "", "", "", 3.50);
		fruit2 = new Item(1, "", "", "", 3.50);
		
		item_bank = new ArrayList<Item>(); // will contain 35 items (7 of each type)
	}
	
	@Test // view items in the item bank 
	public void testViewItem() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid item_bank arraylist to add to", item_bank);
		
		//test if the list of item_book retrieved from the C206_CaseStudy is empty
		String all_Item= C206_CaseStudy.retrieveAll_items(item_bank);
		String testOutput = "";
		assertEquals("Check that item_bank", testOutput, all_Item);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addItem(item_bank, western1);
		C206_CaseStudy.addItem(item_bank, asian1);
		assertEquals("Test if that item_bank arraylist size is 2?", 2, item_bank.size());
		
		//test if the expected output string same as the list of items retrieved from the C206_CaseStudy
		all_Item= C206_CaseStudy.retrieveAll_items(item_bank);

		testOutput = String.format("%-10d %-10s %-10s %-100s %-20.2f\n", 91, "", "", "", 3.0);
		testOutput += String.format("%-10d %-10s %-10s %-100s %-20.2f\n", 87, "", "", "", 3.50);
	
		assertEquals("Check that ViewAll_items", testOutput, all_Item);
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
		
	}
	
	@Test// Sprint 2 - Update items that are already in the item bank
	public void testUpdateItem() {
		
	}
	
	@After
	public void tearDown() throws Exception {
		western1 = null;
		asian1 = null;
		veggie1 = null;
		drink1 = null;
		drink2 = null;
		fruit1 = null;
		fruit2 = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
