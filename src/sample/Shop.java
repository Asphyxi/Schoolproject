package sample;

import static sample.Shop.ITEMS.*;

/**
 * Created by Admin on 22-2-2016.
 */
public class Shop {

    private static Shop instance;

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    private Shop() {

    }

    public enum ITEMS {
        A(10, 1),
        B(25, 5),
        C(50, 10),
        D(100, 10),
        E(250, 50);

        ITEMS(int cost, int increasedSize) {
            this.cost = cost;
            this.increasedSize = increasedSize;
        }
        private int increasedSize;
        private int cost;

        public int getCost() {
            return cost;
        }

        public int getIncreasedSize() {
            return increasedSize;
        }
    }

    public void buyItem(ITEMS item) {
        if(Doekoez.getInstance().getDoekoe() >= item.getCost() ) {
            Doekoez.getInstance().setDoekoe(
                    Doekoez.getInstance().getDoekoe() - item.getCost()
            );
                    Doekoez.getInstance().setTickSize(
                    Doekoez.getInstance().getTickSize() + item.getIncreasedSize()
            );
        }
    }


}
