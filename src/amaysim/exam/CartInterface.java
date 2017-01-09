package amaysim.exam;

public interface CartInterface {
	String SMALL = "ult_small";
	String MEDIUM = "ult_medium";
	String LARGE = "ult_large";
	String ONEGB = "one_gb";
	
	public void add (String item);
	public void add (String item, String promo_code);
	public double total();
	public int items();

}
