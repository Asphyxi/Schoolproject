/**
 * Created by Admin on 10-5-2016.
 */
public class VisitorTest {
    public static void main(String[] args) {

        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalc)+"\n");
        System.out.println(vodka.accept(taxCalc)+ "\n");
        System.out.println(cigars.accept(taxCalc)+"\n");

        System.out.println("Tax Holiday Prices\n");

        System.out.println(milk.accept(taxHolidayCalc)+"\n");
        System.out.println(vodka.accept(taxHolidayCalc)+"\n");
        System.out.println(cigars.accept(taxHolidayCalc)+"\n");

    }
}
