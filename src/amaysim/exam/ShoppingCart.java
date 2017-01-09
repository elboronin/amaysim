package amaysim.exam;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

import amaysim.pojo.Pricing_rules;
import amaysim.pojo.Products;

public class ShoppingCart implements CartInterface {
	private List<Cart> cart = new LinkedList<Cart>();
	private Pricing_rules pricing_rules;
	private Products products = ProductsUtil.load_Products();
	private List<Cart> addonCart = new LinkedList<Cart>();
	
	public ShoppingCart(Pricing_rules pricing) {
		this.pricing_rules = pricing;
	}

	@Override
	public void add(String item) {
		cart.add(new Cart(item));
	}

	@Override
	public void add(String item, String promo_code) {
		cart.add(new Cart(item, promo_code));
	}

	@Override
	public double total() {
		int ult_small = 0;
		int ult_medium = 0;
		int ult_large = 0;
		int one_gb = 0;
		boolean promo_code = false;
		double total = 0;
		
		for(Cart cartItem : cart) {
			if(cartItem.getPromo_code().equals("I<3AMAYSIM")) {
				promo_code = true;
			}
			switch(cartItem.getItem()) {
			case "ult_small" :
				ult_small++;
				break;
			case "ult_medium" :
				ult_medium++;
				break;
			case "ult_large" :
				ult_large++;
				break;
			case "one_gb" :
				one_gb++;
				break;
				default:
				
			}
		}
		if(ult_small > 0) {
			int whole_num = ult_small / Integer.parseInt(pricing_rules.getThree_for_two().getBuy_amount());
			int remainder = ult_small % Integer.parseInt(pricing_rules.getThree_for_two().getBuy_amount());
			
			if(whole_num > 0) {
				total = whole_num * Double.parseDouble(pricing_rules.getThree_for_two().getPay_amount()) * Double.parseDouble(products.getUlt_small().getUnit_price());
				if(remainder > 0) {
					total += remainder * Double.parseDouble(products.getUlt_small().getUnit_price());
				}
			} else{
				total = ult_small * Double.parseDouble(products.getUlt_small().getUnit_price());
			}
		}
		if(ult_medium > 0 ) {
			total += ult_medium * Double.parseDouble(products.getUlt_medium().getUnit_price());
		}
		
		if(ult_large > 0 ) {
			if( ult_large > Integer.parseInt(pricing_rules.getBulk_discount().getBuy_amount())) {
				total += ult_large * Double.parseDouble(pricing_rules.getBulk_discount().getPrice_after_discount());
			} else {
				total += ult_large * Double.parseDouble(products.getUlt_large().getUnit_price());
			}
		}

		if(one_gb > 0 ) {
			total += one_gb * Double.parseDouble(products.getOne_gb().getUnit_price());
		}
		if(promo_code==true) {
			total = total - (total * Double.parseDouble(pricing_rules.getPromo().getDiscount()));
		}
		DecimalFormat f = new DecimalFormat("##.00");
		return Double.parseDouble(f.format(total));
	}

	public void addBundle() {
		addonCart.add(new Cart("one_gb"));
	}
	@Override
	public int items() {
		int ult_medium = 0;
		for(Cart cartItem : cart) {
			if(cartItem.getItem().equals("ult_medium")) {
				ult_medium++;
			}
		}
		if(ult_medium > 0) {
			
			for (int i = 0; i < ult_medium; i++) {
				addBundle();
			}
		}
		for(Cart cartItem : cart) {
			System.out.println(cartItem.getItem());
		}
		
		for(Cart addon : addonCart) {
			System.out.println(addon.getItem());
		}
		
		List<Cart> totalCartItems = new LinkedList<Cart>();
		totalCartItems.addAll(cart);
		totalCartItems.addAll(addonCart);
		
		return totalCartItems.size();
	}

}
