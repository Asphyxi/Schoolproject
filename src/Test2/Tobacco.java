/**
 * Created by Admin on 10-5-2016.
 */
public class Tobacco implements Visitable{

    private double price;

    Tobacco(double item){
        price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice(){
        return price;
    }
}
