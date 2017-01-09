package amaysim.exam;

public class Cart {
	private String item;
	private String promo_code;

	public Cart(String item) {
		this.item = item;
		this.promo_code = "";
	}

	public Cart(String item, String promo_code) {
		this.item = item;
		this.promo_code = promo_code;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPromo_code() {
		return promo_code;
	}

	public void setPromo_code(String promo_code) {
		this.promo_code = promo_code;
	}
	
}
