package amaysim.exam;

import amaysim.pojo.Pricing_rules;

public class CartApp {

	public static void main(String[] args) {
		Pricing_rules pricing_rules = Pricing_rules_Util.load_pricing_rules();
		CartInterface cart = new ShoppingCart(pricing_rules);
		
//		cart.add("ult_small");
//		cart.add("ult_small");
//		cart.add("ult_small");
//		cart.add("ult_large");
		
//		cart.add("ult_small");
//		cart.add("ult_small");
//		cart.add("ult_large");
//		cart.add("ult_large");
//		cart.add("ult_large");
//		cart.add("ult_large");

		cart.add("ult_small");
		cart.add("ult_medium");
		cart.add("ult_medium");

//		cart.add("ult_small");
//		cart.add("one_gb", "I<3AMAYSIM");
		
		System.out.println();
		cart.items();
		System.out.println();
		cart.total();
	}
		


}
