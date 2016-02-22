package sample;

import javafx.scene.control.Label;

public class Controller {
    public Label countLabel;

    public void add() {
        Doekoez.getInstance().tick();
        update();
    }

    public void cost1() {
        Shop.getInstance().buyItem(Shop.ITEMS.A);
        update();
    }

    public void cost2() {
        Shop.getInstance().buyItem(Shop.ITEMS.C);
        update();

    }

    public void cost3() {
        Shop.getInstance().buyItem(Shop.ITEMS.B);
        update();
    }

    public void cost4() {
        Shop.getInstance().buyItem(Shop.ITEMS.D);
        update();
    }

    public void cost5() {
        Shop.getInstance().buyItem(Shop.ITEMS.E);
        update();
    }

    public void update() {
        countLabel.setText(
                String.valueOf(
                        Doekoez.getInstance().getDoekoe()
                )
        );
    }
}
