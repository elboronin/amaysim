package amaysim.pojo;

public class Products
{
    private Ult_large ult_large;

    private One_gb one_gb;

    private Ult_medium ult_medium;

    private Ult_small ult_small;

    public Ult_large getUlt_large ()
    {
        return ult_large;
    }

    public void setUlt_large (Ult_large ult_large)
    {
        this.ult_large = ult_large;
    }

    public One_gb getOne_gb ()
    {
        return one_gb;
    }

    public void setOne_gb (One_gb one_gb)
    {
        this.one_gb = one_gb;
    }

    public Ult_medium getUlt_medium ()
    {
        return ult_medium;
    }

    public void setUlt_medium (Ult_medium ult_medium)
    {
        this.ult_medium = ult_medium;
    }

    public Ult_small getUlt_small ()
    {
        return ult_small;
    }

    public void setUlt_small (Ult_small ult_small)
    {
        this.ult_small = ult_small;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ult_large = "+ult_large+", one_gb = "+one_gb+", ult_medium = "+ult_medium+", ult_small = "+ult_small+"]";
    }
}
