package amaysim.pojo;

public class Promo
{
    private String promo_code;

    private String discount;

    public String getPromo_code ()
    {
        return promo_code;
    }

    public void setPromo_code (String promo_code)
    {
        this.promo_code = promo_code;
    }

    public String getDiscount ()
    {
        return discount;
    }

    public void setDiscount (String discount)
    {
        this.discount = discount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [promo_code = "+promo_code+", discount = "+discount+"]";
    }
}
