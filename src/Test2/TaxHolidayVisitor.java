import java.text.DecimalFormat;

/**
 * Created by Admin on 10-5-2016.
 */
public class TaxHolidayVisitor implements Visitor{

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxHolidayVisitor(){

    }

    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice()* .10)+liquorItem.getPrice()));
    }

    public double visit(Tobacco tobaccoItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice()* .30)+tobaccoItem.getPrice()));
    }

    public double visit(Necessity necessityItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }
}
