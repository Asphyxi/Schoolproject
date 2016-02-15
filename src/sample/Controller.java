package sample;

import javafx.scene.control.Label;

public class Controller {
    public Label value;

    public void add() {
        Counter.getInstance().tick();
        value.setText(
                String.valueOf(
                        Counter.getInstance().getCount()
                )
        );
    }

    public void reset() {
        Counter.getInstance().startOrReset();
        value.setText(
                String.valueOf(
                        Counter.getInstance().getCount()
                )
        );
    }
}
