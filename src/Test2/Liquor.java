/**
 * Created by Admin on 10-5-2016.
 */
public class Liquor implements Visitable{

    private double price;

    Liquor(double item){
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice(){
        return price;
    }
}
