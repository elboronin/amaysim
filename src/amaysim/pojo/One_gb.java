package amaysim.pojo;

public class One_gb
{
    private String name;

    private String unit_price;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUnit_price ()
    {
        return unit_price;
    }

    public void setUnit_price (String unit_price)
    {
        this.unit_price = unit_price;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", unit_price = "+unit_price+"]";
    }
}
