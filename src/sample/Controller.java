package sample;

import javafx.scene.control.Label;

public class Controller {
    public Label countLabel;
    public Label updateLabel;

    public void add() {
        Doekoez.getInstance().tick();
        update();
        update2();
    }

    public void cost1() {
        Shop.getInstance().buyItem(Shop.ITEMS.A);
        update();
        update2();
    }

    public void cost2() {
        Shop.getInstance().buyItem(Shop.ITEMS.B);
        update();
        update2();

    }

    public void cost3() {
        Shop.getInstance().buyItem(Shop.ITEMS.C);
        update();
        update2();
    }

    public void cost4() {
        Shop.getInstance().buyItem(Shop.ITEMS.D);
        update();
        update2();
    }

    public void cost5() {
        Shop.getInstance().buyItem(Shop.ITEMS.E);
        update();
        update2();
    }

    public void update() {
        countLabel.setText(
                String.valueOf(
                        Doekoez.getInstance().getDoekoe()
                )
        );
    }

    public void update2() {
        updateLabel.setText(
                String.valueOf(
                        Doekoez.getInstance().getTickSize()
                )
        );
    }
}
