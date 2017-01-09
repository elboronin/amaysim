package amaysim.pojo;

public class Bulk_discount
{
    private String product_code;

    private String buy_amount;

    private String price_after_discount;

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

    public String getPrice_after_discount ()
    {
        return price_after_discount;
    }

    public void setPrice_after_discount (String price_after_discount)
    {
        this.price_after_discount = price_after_discount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [product_code = "+product_code+", buy_amount = "+buy_amount+", price_after_discount = "+price_after_discount+"]";
    }
}