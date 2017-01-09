import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import amaysim.exam.CartInterface;
import amaysim.exam.Pricing_rules_Util;
import amaysim.exam.ShoppingCart;
import amaysim.pojo.Pricing_rules;

public class TestCart {

	Pricing_rules pricing_rules;
	CartInterface cart;
	
	@Before
	public void loadUtilityClasses() {
		pricing_rules = Pricing_rules_Util.load_pricing_rules();
		cart = new ShoppingCart(pricing_rules);
	}
	
	@Test
	public void testThreeForTwo() {
		cart.add("ult_small");
		cart.add("ult_small");
		cart.add("ult_small");
		cart.add("ult_large");
		double total = cart.total();
		assertEquals(Double.doubleToLongBits(total), Double.doubleToLongBits(94.70));
		assertEquals(cart.items(), 4);
		

	}
	
	@Test
	public void testBulkPromo() {
		cart.add("ult_small");
		cart.add("ult_small");
		cart.add("ult_large");
		cart.add("ult_large");
		cart.add("ult_large");
		cart.add("ult_large");
		assertEquals(Double.doubleToLongBits(cart.total()), Double.doubleToLongBits(209.40));
		assertEquals(cart.items(), 6);

	}
	
	@Test
	public void testBundlePromo() {
		cart.add("ult_small");
		cart.add("ult_medium");
		cart.add("ult_medium");
		assertEquals(Double.doubleToLongBits(cart.total()), Double.doubleToLongBits(84.70));
		assertEquals(cart.items(), 5);

	}
	
	@Test
	public void testPromoCode() {
		cart.add("ult_small");
		cart.add("one_gb", "I<3AMAYSIM");
		assertEquals(Double.doubleToLongBits(cart.total()), Double.doubleToLongBits(31.32));
		assertEquals(cart.items(), 2);
	}

}
