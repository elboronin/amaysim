# amaysim

How to use:

		Pricing_rules pricing_rules = Pricing_rules_Util.load_pricing_rules();
		CartInterface cart = new ShoppingCart(pricing_rules);
    
    cart.add("ult_small");
    cart.add("ult_small");
    cart.add("ult_small");
    cart.add("ult_large");
    cart.items();
    cart.total();

Under test source folder, kindly run the TestCart.java as JUnit Test. Thanks!
