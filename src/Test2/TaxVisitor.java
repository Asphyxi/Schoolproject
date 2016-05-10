import java.text.DecimalFormat;

/**
 * Created by Admin on 10-5-2016.
 */
public class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor(){
    }

    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18)+ liquorItem.getPrice()));
    }

    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32)+ tobaccoItem.getPrice()));
    }

    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }
}
