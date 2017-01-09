package amaysim.pojo;

public class Three_for_two
{
    private String pay_amount;

    private String product_code;

    private String buy_amount;
    
    public Three_for_two() {
	}

	public String getPay_amount ()
    {
        return pay_amount;
    }

    public void setPay_amount (String pay_amount)
    {
        this.pay_amount = pay_amount;
    }

    public String getProduct_code ()
    {
        return product_code;
    }

    public void setProduct_code (String product_code)
    {
        this.product_code = product_code;
    }

    public String getBuy_amount ()
    {
        return buy_amount;
    }

    public void setBuy_amount (String buy_amount)
    {
        this.buy_amount = buy_amount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pay_amount = "+pay_amount+", product_code = "+product_code+", buy_amount = "+buy_amount+"]";
    }
}
