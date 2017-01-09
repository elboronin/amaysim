package amaysim.pojo;

public class Pricing_rules
{
    private Promo promo;

    private Bundle bundle;

    private Three_for_two three_for_two;

    private Bulk_discount bulk_discount;
    

    public Pricing_rules() {
	}

	public Promo getPromo ()
    {
        return promo;
    }

    public void setPromo (Promo promo)
    {
        this.promo = promo;
    }

    public Bundle getBundle ()
    {
        return bundle;
    }

    public void setBundle (Bundle bundle)
    {
        this.bundle = bundle;
    }

    public Three_for_two getThree_for_two ()
    {
        return three_for_two;
    }

    public void setThree_for_two (Three_for_two three_for_two)
    {
        this.three_for_two = three_for_two;
    }

    public Bulk_discount getBulk_discount ()
    {
        return bulk_discount;
    }

    public void setBulk_discount (Bulk_discount bulk_discount)
    {
        this.bulk_discount = bulk_discount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [promo = "+promo+", bundle = "+bundle+", three_for_two = "+three_for_two+", bulk_discount = "+bulk_discount+"]";
    }
}