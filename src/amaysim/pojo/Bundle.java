package amaysim.pojo;

public class Bundle
{
    private String product_code;

    private String buy_amount;

    private String bundled_amount;

    private String product_code_for_bundle;

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

    public String getBundled_amount ()
    {
        return bundled_amount;
    }

    public void setBundled_amount (String bundled_amount)
    {
        this.bundled_amount = bundled_amount;
    }

    public String getProduct_code_for_bundle ()
    {
        return product_code_for_bundle;
    }

    public void setProduct_code_for_bundle (String product_code_for_bundle)
    {
        this.product_code_for_bundle = product_code_for_bundle;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [product_code = "+product_code+", buy_amount = "+buy_amount+", bundled_amount = "+bundled_amount+", product_code_for_bundle = "+product_code_for_bundle+"]";
    }
}